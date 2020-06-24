package com.example.java_api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.java_api.dao.Dept_emp;

public interface Dept_empRepository extends JpaRepository<Dept_emp ,Integer>{

@Query(value="select * from dept_emp where dept_id=:dept_id", nativeQuery=true)
	
	public Optional<Dept_emp> getById(@Param("dept_id") int dept_id);
	
}
