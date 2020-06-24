package com.example.java_api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.java_api.dao.Departments;
import com.example.java_api.service.DepartmentsService;

@RestController
@RequestMapping(value="/Departments")
public class DepartmentsController {
	@Autowired
	DepartmentsService departmentsService;
	
	@RequestMapping(value="/getAll", method=RequestMethod.GET)
	public List<Departments> getAll(){
		List<Departments> us=departmentsService.getAll();
		return us;
	}
	
	@RequestMapping(value="/getById/{id}")
	public Optional<Departments> getById(@PathVariable String id){
		Optional<Departments> us=departmentsService.getById(Integer.parseInt(id));
		return us;
	}
	
	@RequestMapping(value="/Save", method= RequestMethod.POST)
	public Departments save(@RequestBody Departments dpartments) {
		Departments us=departmentsService.save(dpartments);
		return us;
	}
	
	@RequestMapping(value="/SaveAll", method=RequestMethod.POST)
	public List<Departments> saveAll(@RequestBody List<Departments> departmentsList){
		List<Departments> us=departmentsService.saveAll(departmentsList);
		return us;
	}

}
