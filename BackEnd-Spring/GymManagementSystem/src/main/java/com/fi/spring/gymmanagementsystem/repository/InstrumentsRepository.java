package com.fi.spring.gymmanagementsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.fi.spring.gymmanagementsystem.entity.InstrumentsEntity;

@Repository
public interface InstrumentsRepository extends JpaRepository<InstrumentsEntity, Integer> 
{
	@Query(nativeQuery = true,value = "select * from instruments")
	public List<InstrumentsEntity> getAllInstruments();

}