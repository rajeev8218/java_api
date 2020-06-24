package com.example.java_api.service;

import java.util.List;
import java.util.Optional;


import com.example.java_api.dao.Salaries;

	public interface SalariesService {
	
	public List<Salaries> getAll();
	
	public Optional<Salaries> getById(int id);
	
	public Salaries save(Salaries salaries);
	
	public List<Salaries> saveAll(List<Salaries> salariesList);
}
