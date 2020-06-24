package com.example.java_api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.java_api.dao.Titles;

public interface TitlesRepository extends JpaRepository<Titles, Integer>{

	@Query(value="select * from titles where title_id=:title_id", nativeQuery=true)
	
	public Optional<Titles> getById(@Param("title_id") int title_id);
}
