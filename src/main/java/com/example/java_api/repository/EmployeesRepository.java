package com.example.java_api.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.java_api.dao.Employees;

public interface EmployeesRepository extends JpaRepository<Employees, Integer>{

	@Query(value="select * from employees where emp_no=:emp_no", nativeQuery=true)
	
	public Optional<Employees> getById(@Param("emp_no") int emp_no);
	
	@Query(value="select * from employees where first_name like ?1% ", nativeQuery=true)
	
	public List<Employees>getByName(@Param("first_name") String Ra);
}
