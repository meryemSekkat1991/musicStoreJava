package com.music.store.musicStore.controller;

import com.music.store.musicStore.entity.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
