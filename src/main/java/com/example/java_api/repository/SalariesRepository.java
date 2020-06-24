package com.example.java_api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.java_api.dao.Salaries;

public interface SalariesRepository extends JpaRepository<Salaries, Integer>{

	@Query(value="select * from salaries where salary_id=:salary_id", nativeQuery=true)
	
	public Optional<Salaries> getById(@Param("salary_id") int salary_id);
}
