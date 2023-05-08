package com.music.store.musicStore.controller;

import com.music.store.musicStore.entity.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.music.store.musicStore.repository.SongRepository;
import java.util.ArrayList;
import java.util.List;



@RestController
public class SongController {
    @Autowired
    SongRepository repository;

    @GetMapping("/list-song")
    public List<Song> list() {
        List<Song> songs = new ArrayList<>();
        repository.findAll().forEach(songs::add);
        return songs;

    }

    @RequestMapping("/songs" )
    public ModelAndView getSongs() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("song.html");
        return modelAndView;
    }

    public List<Song> listSong() {
      Song song = new Song();
      song.setSongId(112102158432121213L);
      song.setSongName("song1");
      Song song2 = new Song();
      song2.setSongId(112102148432121213L);
      song2.setSongName("song2");
      return List.of(song, song2);
    }

}
