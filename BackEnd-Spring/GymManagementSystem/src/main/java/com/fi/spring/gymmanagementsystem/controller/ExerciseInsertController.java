package com.fi.spring.gymmanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fi.spring.gymmanagementsystem.entity.ExerciseInsertEntity;
import com.fi.spring.gymmanagementsystem.service.ExerciseInsertService;
@RestController
@RequestMapping("api")
public class ExerciseInsertController
{
	    @Autowired
	     ExerciseInsertService exercise;
	
			@PostMapping("addPlan")
			public boolean addPlan(@RequestBody ExerciseInsertEntity entity) {
				
				return exercise.addPlanForMember(entity);
			} 
}
