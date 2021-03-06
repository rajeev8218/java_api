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

	@Query(value="select * from employees where first_name like ?1% or first_name like ?2% ", nativeQuery=true)
	
	public List<Employees>getByName2(@Param("1%") String Ra,@Param("2%") String Su);

	@Query(value="select * from employees where first_name like %?1% ", nativeQuery=true)
	
	public List<Employees>getCharContains(@Param("first_name") String Ra);
	
	@Query(value="select * from employees where hire_date between ?1 and ?2 ", nativeQuery=true)
	
	public List<Employees>getByDate(@Param("1") String d1,@Param("2") String d2 );
	
}


