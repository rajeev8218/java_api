package com.example.java_api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.java_api.dao.Dept_manager;

public interface Dept_managerRepository extends JpaRepository<Dept_manager, Integer> {

	@Query(value="select * from dept_manager where manager_id=:manager_id", nativeQuery=true)
	
	public Optional<Dept_manager> getById(@Param("manager_id") int manager_id);
}
