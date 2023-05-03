package com.music.store.musicStore.controller;

import com.music.store.musicStore.entity.Singer;
import com.music.store.musicStore.repository.SingerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SingerController {
	@Autowired
	SingerRepository repository;

	@GetMapping("/list-singer")
	public List<Singer> list(){
		List<Singer> singers =new ArrayList<>();
		repository.findAll().forEach(singers::add);
		return singers;
	}


}
