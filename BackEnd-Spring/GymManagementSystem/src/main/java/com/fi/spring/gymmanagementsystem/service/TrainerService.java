package com.fi.spring.gymmanagementsystem.service;


import java.util.List;


import com.fi.spring.gymmanagementsystem.entity.TrainerLoginEntity;

public interface TrainerService 
{
	boolean addNewMember(TrainerLoginEntity entity);
	TrainerLoginEntity getTrainerById(String email);
	boolean authenticateTrainer(TrainerLoginEntity entity);
	List<TrainerLoginEntity> getAllMembers();
}
