package com.example.java_api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.example.java_api.dao.Dept_emp;

import com.example.java_api.service.Dept_empService;

@RestController
@RequestMapping(value="/Dept_emp")
public class Dept_empController {
	
	@Autowired
	Dept_empService dept_empService;
	
	@RequestMapping(value="/getAll1", method=RequestMethod.GET)
	public List<Dept_emp> getAll(){
		List<Dept_emp> us=dept_empService.getAll();
		return us;
	}
	
	@RequestMapping(value="/getById1/{id}", method=RequestMethod.GET)
	public Optional<Dept_emp> getById(@PathVariable String id){
		Optional<Dept_emp> us=dept_empService.getById(Integer.parseInt(id));
		return us;
	}
	
	@RequestMapping(value="/Save1", method= RequestMethod.POST)
	public Dept_emp save(@RequestBody Dept_emp dept_emp) {
		Dept_emp us=dept_empService.save(dept_emp);
		return us;
	}
	
	@RequestMapping(value="/SaveAll1", method=RequestMethod.POST)
	public List<Dept_emp> saveAll(@RequestBody List<Dept_emp> dept_empList){
		List<Dept_emp> us=dept_empService.saveAll(dept_empList);
		return us;
	}

}
