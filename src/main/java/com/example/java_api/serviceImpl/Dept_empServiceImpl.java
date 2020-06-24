package com.example.java_api.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.java_api.dao.Dept_emp;
import com.example.java_api.repository.Dept_empRepository;
import com.example.java_api.service.Dept_empService;

@Service
public class Dept_empServiceImpl implements Dept_empService {

	@Autowired
	Dept_empRepository dept_empRepository;
	
	@Override
	public List<Dept_emp> getAll() {
		// TODO Auto-generated method stub
		List<Dept_emp> returnAll=dept_empRepository.findAll();
		return returnAll;
	}

	@Override
	public Optional<Dept_emp> getById(int id) {
		// TODO Auto-generated method stub
		Optional<Dept_emp> returnById=dept_empRepository.getById(id);
		return returnById;
	}

	@Override
	public Dept_emp save(Dept_emp dept_emp) {
		// TODO Auto-generated method stub
		Dept_emp returnSave=dept_empRepository.save(dept_emp);
		return returnSave;
	}

	@Override
	public List<Dept_emp> saveAll(List<Dept_emp> dept_empList) {
		// TODO Auto-generated method stub
		List<Dept_emp> returnSaveAll=dept_empRepository.saveAll(dept_empList);
		return returnSaveAll;
	}

}
