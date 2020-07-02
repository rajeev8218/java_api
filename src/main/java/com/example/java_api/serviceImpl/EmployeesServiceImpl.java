package com.example.java_api.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.java_api.dao.Employees;
import com.example.java_api.repository.EmployeesRepository;
import com.example.java_api.service.EmployeesService;

@Service
public class EmployeesServiceImpl implements EmployeesService {

	@Autowired
	EmployeesRepository employeesRepository;
	
	@Override
	public List<Employees> getAll() {
		// TODO Auto-generated method stub
		List<Employees> returnAll=employeesRepository.findAll();
		return returnAll;
	}

	@Override
	public Optional<Employees> getById(int id) {
		// TODO Auto-generated method stub
		Optional<Employees> returnById=employeesRepository.getById(id);
		return returnById;
	}

	@Override
	public Employees save(Employees employees) {
		// TODO Auto-generated method stub
		Employees returnSave=employeesRepository.save(employees);
		return returnSave;
	}

	@Override
	public List<Employees> saveAll(List<Employees> employees) {
		// TODO Auto-generated method stub
		List<Employees> returnSaveAll=employeesRepository.saveAll(employees);
		return returnSaveAll;
	}

	@Override
	public List<Employees> getByName(String Ra) {
		// TODO Auto-generated method stub
		List<Employees> returnByName=employeesRepository.getByName(Ra);
		return returnByName;
	}

	@Override
	public List<Employees> getByName2(String Ra, String Su) {
		// TODO Auto-generated method stub
		List<Employees> returnByName2=employeesRepository.getByName2(Ra, Su);
		return returnByName2;
	}

}
