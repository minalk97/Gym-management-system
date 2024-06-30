package com.fi.spring.gymmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fi.spring.gymmanagementsystem.entity.ExerciseEntity;
import com.fi.spring.gymmanagementsystem.repository.ExerciseRepository;

@Service
public class ExerciseServiceImpl implements ExerciseService{

	
	@Autowired
	ExerciseRepository repository;
	
	@Override
	public ExerciseEntity getExercisePlanById(String email) {
		
		return repository.findById(email).get();
	}

	@Override
	public List<ExerciseEntity> getExercisePlanForMember(String email)
	{
		List<ExerciseEntity> plans=repository.getMemberPlans(email);
		
		return plans;
	}

	@Override
	public boolean addPlanForMember(ExerciseEntity entity) 
	{
		System.out.println(entity.getSets());
	//	System.out.println(entity.getMemid().getMemberid());
		System.out.println(entity.getSets());

		System.out.println(entity.getSets());
		System.out.println(entity.getSets());
		System.out.println(entity.getSets());

		int plan=repository.addExercisePlan(entity.getExeid(),entity.getEmail().getEmail(),entity.getDate(),entity.getSets(),entity.getTime(),entity.getExerciseidd().getExerciseid());
		return plan!=0?true:false;
	}

/*	@Override
	public boolean addnewMember(ExerciseEntity entity) {
		ExerciseEntity returnEntity=repository.save(entity);
		return returnEntity!=null?true:false;
	}
*/
	
	
}
