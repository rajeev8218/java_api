package com.example.java_api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.java_api.dao.Dept_manager;
import com.example.java_api.service.Dept_managerService;

@RestController
@RequestMapping(value="/Dept_manager")
public class Dept_managerController {
	
	@Autowired
	Dept_managerService dept_managerService;
	
	@RequestMapping(value="/getAll2", method=RequestMethod.GET)
		public List<Dept_manager> getAll(){
		List<Dept_manager> us=dept_managerService.getAll();
		return us;
	}
	
	@RequestMapping(value="/getById2/{id}", method=RequestMethod.GET)
	public Optional<Dept_manager> getById(@PathVariable String id){
		Optional<Dept_manager> us=dept_managerService.getById(Integer.parseInt(id));
		return us;
	}
	
	@RequestMapping(value="/Save2", method= RequestMethod.POST)
	public Dept_manager save(@RequestBody Dept_manager dept_manager) {
		Dept_manager us=dept_managerService.save(dept_manager);
		return us;
	}
	
	@RequestMapping(value="/SaveAll2", method=RequestMethod.POST)
	public List<Dept_manager> saveAll(@RequestBody List<Dept_manager> dept_manager){
		List<Dept_manager> us=dept_managerService.saveAll(dept_manager);
		return us;
	}

}
