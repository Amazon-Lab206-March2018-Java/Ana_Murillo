package com.anaroja.DojoOverflow.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.assertj.core.util.Arrays;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.anaroja.DojoOverflow.models.AnswerModel;
import com.anaroja.DojoOverflow.models.QuestionModel;
import com.anaroja.DojoOverflow.models.TagModel;
import com.anaroja.DojoOverflow.services.AnswerService;
import com.anaroja.DojoOverflow.services.QuestionService;
import com.anaroja.DojoOverflow.services.TagService;

@Controller
public class controller {
	
	private final AnswerService answerService;
	private final TagService tagService;
	private final QuestionService questionService;
	
	public controller(AnswerService answerService, TagService tagService,QuestionService questionService ) {
		this.answerService = answerService;
		this.tagService = tagService;
		this.questionService = questionService;
	}
	
	@RequestMapping ("/")
	public String index() {
		return "redirect:/dashboard";
	}
	
	@RequestMapping ("/dashboard")
	public String dashboard(Model model) {
		model.addAttribute("questions", questionService.findAll());
		return "info.jsp";
	}
	
	@RequestMapping ("/question/new")
	public String newQuestion(@ModelAttribute("new_question") QuestionModel question) {
		return "newQuestion.jsp";
	}
	
	@PostMapping ("/question/new")
	public String createQuestion(@Valid @ModelAttribute("new_question") QuestionModel question, BindingResult result,@RequestParam("tagA") String tagA,@RequestParam("tagB") String tagB,@RequestParam("tagC") String tagC) {
		if (result.hasErrors()) {
			return "newQuestion.jsp";
		}
		QuestionModel questions = questionService.addQuestion(question);
		List<String> tagList = new ArrayList<String>(Arrays.asList(tagA,tagB,tagC));
		List<TagModel> tags = new ArrayList<TagModel>();
		for (int i = 0; i <tagList.size(); i++) {
			if (tagService.findTagByTag(tagList.get(i)) != null) {
				tags.add(tagService.findTagByTag(tagList.get(i)));
			}
		}
		question.setTags(tags);
		questionService.addQuestion(question);
		return "redirect:/question/" + question.getId();
    }
	
	@RequestMapping("/question/{id}")
	public String displayQuestion(@ModelAttribute("answer") AnswerModel answer, @PathVariable("id") Long id, Model model) {
		model.addAttribute("question", questionService.findById(id));
		return "info.jsp";
	}
	
	@PostMapping ("/answer/new")
	public String createAnswer(@Valid @ModelAttribute("new_answer") AnswerModel answer, BindingResult result, @RequestParam ("question") Long question_id, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("question", questionService.findById(question_id));
			return "questions.jsp";
		}
		answer.setQuestion(questionService.findById(question_id));
		answerService.addAnswer(answer);
		return "redirect:/question/" + question_id;	
	
	}

}
