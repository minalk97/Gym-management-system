package com.fi.spring.gymmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fi.spring.gymmanagementsystem.entity.AllocationEntity;
import com.fi.spring.gymmanagementsystem.repository.AllocationRepository;

@Service
public class AllocationServiceImpl implements AllocationService {
	@Autowired
    AllocationRepository repository;
	@Override
	public List<AllocationEntity> getAllAllocations() 
	{
		return repository.getAllAllocations();
	}

	@Override
	public boolean allocateMember(AllocationEntity entity) {
		AllocationEntity returnEntity=repository.save(entity);
		return returnEntity!=null?true:false;
	}

}
