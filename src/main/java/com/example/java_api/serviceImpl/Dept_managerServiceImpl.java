package com.example.java_api.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.java_api.dao.Dept_manager;
import com.example.java_api.repository.Dept_managerRepository;
import com.example.java_api.service.Dept_managerService;

@Service
public class Dept_managerServiceImpl implements Dept_managerService {

	@Autowired
	Dept_managerRepository dept_managerRepository;
	
	@Override
	public List<Dept_manager> getAll() {
		// TODO Auto-generated method stub
		List<Dept_manager> returnAll=dept_managerRepository.findAll();
		return returnAll;
	}

	@Override
	public Optional<Dept_manager> getById(int id) {
		// TODO Auto-generated method stub
		Optional<Dept_manager> returnById=dept_managerRepository.getById(id);
		return returnById;
	}

	@Override
	public Dept_manager save(Dept_manager dept_manager) {
		// TODO Auto-generated method stub
		Dept_manager returnSave=dept_managerRepository.save(dept_manager);
		return returnSave;
	}

	@Override
	public List<Dept_manager> saveAll(List<Dept_manager> dept_managerList) {
		// TODO Auto-generated method stub
		List<Dept_manager> returnSaveAll=dept_managerRepository.saveAll(dept_managerList);
		return returnSaveAll;
	}

	
}
