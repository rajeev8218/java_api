package com.example.java_api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.java_api.dao.Salaries;
import com.example.java_api.service.SalariesService;

@RestController
@RequestMapping(value="/Salaries")
public class SalariesController {

	@Autowired
	SalariesService salariesService;
	
	@RequestMapping(value="/getAll4", method=RequestMethod.GET)
	public List<Salaries> getAll(){
		List<Salaries> us=salariesService.getAll();
		return us;
	}

	@RequestMapping(value="/getById4/{id}", method=RequestMethod.GET)
	public Optional<Salaries> getById(@PathVariable String id){
		Optional<Salaries> us=salariesService.getById(Integer.parseInt(id));
		return us;
	}
	
	@RequestMapping(value="/Save4", method= RequestMethod.POST)
	public Salaries save(@RequestBody Salaries salaries) {
		Salaries us=salariesService.save(salaries);
		return us;
	}
	
	@RequestMapping(value="/SaveAll4", method=RequestMethod.POST)
	public List<Salaries> saveAll(@RequestBody List<Salaries> salaries){
		List<Salaries> us=salariesService.saveAll(salaries);
		return us;
	}
	
}
