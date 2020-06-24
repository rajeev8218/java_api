package com.example.java_api.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.java_api.dao.Salaries;
import com.example.java_api.repository.SalariesRepository;
import com.example.java_api.service.SalariesService;

@Service
public class SalariesServiceImpl implements SalariesService {

	@Autowired
	SalariesRepository salariesRepository;
	
	@Override
	public List<Salaries> getAll() {
		// TODO Auto-generated method stub
		List<Salaries> returnAll=salariesRepository.findAll();
		return returnAll;
	}

	@Override
	public Optional<Salaries> getById(int id) {
		// TODO Auto-generated method stub
		Optional<Salaries> returnById=salariesRepository.getById(id);
		return returnById;
	}

	@Override
	public Salaries save(Salaries salaries) {
		// TODO Auto-generated method stub
		Salaries returnSave=salariesRepository.save(salaries);
		return returnSave;
	}

	@Override
	public List<Salaries> saveAll(List<Salaries> salariesList) {
		// TODO Auto-generated method stub
		List<Salaries> returnSaveAll=salariesRepository.saveAll(salariesList);
		return returnSaveAll;
	}

}
