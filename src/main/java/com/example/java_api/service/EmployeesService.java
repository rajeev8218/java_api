package com.example.java_api.service;

import java.util.List;
import java.util.Optional;

import com.example.java_api.dao.Employees;

public interface EmployeesService {
public List<Employees> getAll();
	
	public Optional<Employees> getById(int id);
	
	public Employees save(Employees employees);
	
	public List<Employees> saveAll(List<Employees> employees);
}
