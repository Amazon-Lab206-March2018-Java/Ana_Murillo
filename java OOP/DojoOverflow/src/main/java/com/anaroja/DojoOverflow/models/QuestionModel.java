package com.anaroja.DojoOverflow.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

	@Entity
	@Table(name="questions")
	public class QuestionModel {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column
	@Size(min = 2, message = "Must provide a question")
    private String question;
    
    @Column(updatable=false)
    @DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
    private Date createdAt;
    private Date updatedAt;
    
    @OneToMany(mappedBy="question", fetch = FetchType.LAZY)
    private List<AnswerModel> answers;
    
    @ManyToMany(fetch= FetchType.LAZY)
    @JoinTable(
    		name = "questions_tags",
    		joinColumns = @JoinColumn(name = "question_id"),
    		inverseJoinColumns = @JoinColumn(name = "tag_id")	
    )
    private List<TagModel> tags;
    
    
    @PrePersist
	protected void onCreate(){
		this.createdAt = new Date();
	 }
	 @PreUpdate
	 protected void onUpdate(){
		 this.updatedAt = new Date();
	}
	
	public QuestionModel() {
		
	}
	
	public QuestionModel(Long id, String question) {
		this.id = id;
		this.question = question;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public List<AnswerModel> getAnswers() {
		return answers;
	}
	public void setAnswers(List<AnswerModel> answers) {
		this.answers = answers;
	}
	public List<TagModel> getTags() {
		return tags;
	}
	public void setTags(List<TagModel> tags) {
		this.tags = tags;
	}
	 
	public void updateAnswers(AnswerModel answers) {
		if (this.answers.contains(answers)) {
			this.answers.remove(answers);
		} 
		else if (!this.answers.contains(answers)) {
			this.answers.add(answers);
		}
	}
	
	public void updateTags(TagModel tag) {
		this.tags.add(tag);
	}
}
