package com.fi.spring.gymmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.fi.spring.gymmanagementsystem.entity.TrainerLoginEntity;
import com.fi.spring.gymmanagementsystem.repository.TrainerRepository;
@Service
public class TrainerServiceImpl implements TrainerService 
{
    @Autowired
    TrainerRepository repository;
	@Override
	public boolean addNewMember(TrainerLoginEntity entity) 
	{
		TrainerLoginEntity returnEntity=repository.save(entity);
		return returnEntity!=null?true:false;
	}
	@Override
	public TrainerLoginEntity getTrainerById(String email) {
		return repository.findById(email).get();
	}
	@Override
	public List<TrainerLoginEntity> getAllMembers() {
	
		return repository.findAll();
	}

	@Override
	public boolean authenticateTrainer(TrainerLoginEntity entity) 
	{
		TrainerLoginEntity returnEntity=repository.authTrainer(entity.getEmail(),entity.getPassword());
			return returnEntity!=null?true:false;
			
		}
}
