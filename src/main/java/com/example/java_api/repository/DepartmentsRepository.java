package com.example.java_api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.java_api.dao.Departments;

public interface DepartmentsRepository extends JpaRepository<Departments, Integer>{
	
	@Query(value="select * from departments where dept_no=:dept_No", nativeQuery=true)
	
	public Optional<Departments> getById(@Param("dept_No") int dept_No);
}
