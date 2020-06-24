package com.example.java_api.service;

import java.util.List;
import java.util.Optional;


import com.example.java_api.dao.Dept_manager;

public interface Dept_managerService {

public List<Dept_manager> getAll();
	
	public Optional<Dept_manager> getById(int id);
	
	public Dept_manager save(Dept_manager dept_manager);
	
	public List<Dept_manager> saveAll(List<Dept_manager> dept_managerList);
}
