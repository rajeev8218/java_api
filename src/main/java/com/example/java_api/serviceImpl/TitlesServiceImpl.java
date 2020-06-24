package com.example.java_api.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.java_api.dao.Titles;
import com.example.java_api.repository.TitlesRepository;
import com.example.java_api.service.TitlesService;

@Service
public class TitlesServiceImpl implements TitlesService {

	@Autowired
	TitlesRepository titlesRepository;
	
	@Override
	public List<Titles> getAll() {
		// TODO Auto-generated method stub
		List<Titles> returnAll=titlesRepository.findAll();
		return returnAll;
	}

	@Override
	public Optional<Titles> getById(int id) {
		// TODO Auto-generated method stub
		Optional<Titles> returnById=titlesRepository.getById(id);
		return returnById;
	}

	@Override
	public Titles save(Titles titles) {
		// TODO Auto-generated method stub
		Titles returnSave=titlesRepository.save(titles);
		return returnSave;
	}

	@Override
	public List<Titles> saveAll(List<Titles> titlesList) {
		// TODO Auto-generated method stub
		List<Titles> returnSaveAll=titlesRepository.saveAll(titlesList);
		return returnSaveAll;
	}

}
