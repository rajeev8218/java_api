package com.example.java_api.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.java_api.dao.Departments;
import com.example.java_api.repository.DepartmentsRepository;
import com.example.java_api.service.DepartmentsService;

@Service
public class DepartmentsServiceImpl implements DepartmentsService {

	@Autowired
	DepartmentsRepository departmentRepository;
	
	@Override
	public List<Departments> getAll() {
		// TODO Auto-generated method stub
		List<Departments> returnAll=departmentRepository.findAll();
		return returnAll;
	}

	@Override
	public Optional<Departments> getById(int id) {
		// TODO Auto-generated method stub
		Optional<Departments> returnById=departmentRepository.getById(id);
		return returnById;
	}

	@Override
	public Departments save(Departments dpartments) {
		// TODO Auto-generated method stub
		Departments returnSave=departmentRepository.save(dpartments);
		return returnSave;
	}

	@Override
	public List<Departments> saveAll(List<Departments> departmentsList) {
		// TODO Auto-generated method stub
		List<Departments> returnSaveAll=departmentRepository.saveAll(departmentsList);
		return returnSaveAll;
	}
	
	

}
