package com.anaroja.lookify.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.anaroja.lookify.models.Song;
import com.anaroja.lookify.services.SongService;

@Controller
public class Songs{
	
	private final SongService songService;
	
	public Songs(SongService songService) {
		this.songService = songService;
	}
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("/Songs")
	public String song(@ModelAttribute("Song") Song song, Model m) {
		List<Song> songs = songService.allSongs();
		m.addAttribute("Song", songs);
		return "dashboard.jsp";
	}
	
	@RequestMapping("/Songs/{id}")
    public String findSongById(Model model, @PathVariable("id") Long id) {
        model.addAttribute("Song", songService.findSongById(id));
        return "showSongs.jsp";
    }
	
	@RequestMapping("/Songs/new")
    public String newSong(@Valid @ModelAttribute("song") Song song, BindingResult result) {
		if (result.hasErrors()) {
			return "new.jsp";
		}else {
			songService.addSong(song);
			return "redirect:/Songs";
		}
    }
	
	@RequestMapping("/Songs/delete/{id}")
    public String destroySong(@PathVariable("id") Long id) {
		songService.destroySong(id);
        return "redirect:/Songs";
    }
	
	@RequestMapping("/search")
    public String findSongByArtist(@RequestParam("artist") String artist) {
        return "redirect:/search/"+artist;
    }
	
	@RequestMapping("/search/{artist}")
    public String findSongByA(Model model, @PathVariable("artist") String artist) {
        model.addAttribute("artist", songService.findSongByArtist(artist));
        return "artistSong.jsp";
    }
	
	@RequestMapping("/topTen")
	public String topTen(Model model, @PathVariable("top") Song song) {
        model.addAttribute("top", songService.topTen(song));
        return "topTen.jsp";
    }
}
