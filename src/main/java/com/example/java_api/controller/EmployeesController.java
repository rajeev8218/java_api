package com.example.java_api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.java_api.dao.Employees;
import com.example.java_api.service.EmployeesService;

@RestController
@RequestMapping(value="/Employees")
public class EmployeesController {

	@Autowired
	EmployeesService employeesService;
	
	@RequestMapping(value="/getAll3", method=RequestMethod.GET)
	public List<Employees> getAll(){
		List<Employees> us=employeesService.getAll();
		return us;
	}

	@RequestMapping(value="/getById3/{id}", method=RequestMethod.GET)
	public Optional<Employees> getById(@PathVariable String id){
		Optional<Employees> us=employeesService.getById(Integer.parseInt(id));
		return us;
	}
	
	@RequestMapping(value="/Save3", method= RequestMethod.POST)
	public Employees save(@RequestBody Employees employees) {
		Employees us=employeesService.save(employees);
		return us;
	}
	
	@RequestMapping(value="/SaveAll3", method=RequestMethod.POST)
	public List<Employees> saveAll(@RequestBody List<Employees> employees){
		List<Employees> us=employeesService.saveAll(employees);
		return us;
	}
	
	@RequestMapping(value="/getByName/{first_name}")
	public List<Employees> getByName(@PathVariable("first_name") String Ra) {
	    List<Employees>	us=employeesService.getByName(Ra);
		return us;
	}
	
	@RequestMapping(value="/getByName2/{1%}/{2%}")
	public List<Employees> getByName2(@PathVariable("1%") String Ra,@PathVariable("2%") String Su) {
	    List<Employees>	us=employeesService.getByName2(Ra, Su);
		return us;
	}
	
	@RequestMapping(value="/getCharContains/{first_name}")
	public List<Employees> getCharContains(@PathVariable("first_name") String Ra) {
	    List<Employees>	us=employeesService.getCharContains(Ra);
		return us;
	}
	
}
