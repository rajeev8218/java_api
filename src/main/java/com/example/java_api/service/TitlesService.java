package com.example.java_api.service;

import java.util.List;
import java.util.Optional;

import com.example.java_api.dao.Titles;

public interface TitlesService {
		
	public List<Titles> getAll();
	
	public Optional<Titles> getById(int id);
	
	public Titles save(Titles titles);
	
	public List<Titles> saveAll(List<Titles> titlesList);
}
