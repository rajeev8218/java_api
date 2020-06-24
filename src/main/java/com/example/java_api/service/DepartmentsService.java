package com.example.java_api.service;

import java.util.List;
import java.util.Optional;

import com.example.java_api.dao.Departments;

public interface DepartmentsService {

	public List<Departments> getAll();
	
	public Optional<Departments> getById(int id);
	
	public Departments save(Departments dpartments);
	
	public List<Departments> saveAll(List<Departments> departmentsList);
	
}
