package com.example.java_api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.java_api.dao.Titles;
import com.example.java_api.service.TitlesService;

@RestController
@RequestMapping(value="/Titles")
public class TitlesController {

	@Autowired
	TitlesService titlesService;
	
	@RequestMapping(value="/getAll3", method=RequestMethod.GET)
	public List<Titles> getAll(){
		List<Titles> us=titlesService.getAll();
		return us;
	}

	@RequestMapping(value="/getById3/{id}", method=RequestMethod.GET)
	public Optional<Titles> getById(@PathVariable String id){
		Optional<Titles> us=titlesService.getById(Integer.parseInt(id));
		return us;
	}
	
	@RequestMapping(value="/Save3", method= RequestMethod.POST)
	public Titles save(@RequestBody Titles titles) {
		Titles us=titlesService.save(titles);
		return us;
	}
	
	@RequestMapping(value="/SaveAll3", method=RequestMethod.POST)
	public List<Titles> saveAll(@RequestBody List<Titles> titles){
		List<Titles> us=titlesService.saveAll(titles);
		return us;
	}
	
}
