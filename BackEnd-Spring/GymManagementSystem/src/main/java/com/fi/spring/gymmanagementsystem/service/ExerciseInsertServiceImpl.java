package com.fi.spring.gymmanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fi.spring.gymmanagementsystem.entity.ExerciseInsertEntity;
import com.fi.spring.gymmanagementsystem.repository.ExerciseInsertRepository;

@Service
public class ExerciseInsertServiceImpl implements ExerciseInsertService {

	@Autowired
	ExerciseInsertRepository repository;
	
	@Override
	public boolean addPlanForMember(ExerciseInsertEntity entity) 
	{
		System.out.println(entity);
		
		/*ExerciseEntity exe = repository.save(entity);
		if(exe != null)
			return true;
		else
			return false;*/
		
		int plan=repository.addExercisePlan(entity.getExeid(),entity.getDate(),entity.getSets(),entity.getTime(),entity.getExerciseid(),entity.getEmail());
		return plan!=0?true:false;
	}

}
