package com.example.java_api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.java_api.dao.Employees;

public interface EmployeesRepository extends JpaRepository<Employees, Integer>{

	@Query(value="select * from employees where emp_no=:emp_no", nativeQuery=true)
	
	public Optional<Employees> getById(@Param("emp_no") int emp_no);
}
