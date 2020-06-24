package com.example.java_api.service;

import java.util.List;
import java.util.Optional;

import com.example.java_api.dao.Dept_emp;

public interface Dept_empService {

public List<Dept_emp> getAll();
	
	public Optional<Dept_emp> getById(int id);
	
	public Dept_emp save(Dept_emp dept_emp);
	
	public List<Dept_emp> saveAll(List<Dept_emp> dept_empList);
	
}
