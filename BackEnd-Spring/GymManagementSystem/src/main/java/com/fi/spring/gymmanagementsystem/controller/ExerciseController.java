package com.fi.spring.gymmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fi.spring.gymmanagementsystem.entity.ExerciseEntity;
import com.fi.spring.gymmanagementsystem.service.ExerciseService;
//import com.fi.spring.gymmanagementsystem.entity.LoginEntity;


@RestController
@RequestMapping("api")
public class ExerciseController 
{

		@Autowired
		ExerciseService exercise;
		
		@GetMapping("getAllPlans")
	    public ExerciseEntity getAllPlans(@RequestParam(name="email") String email)
		{
		   return exercise.getExercisePlanById(email);
		}
		
		
		@GetMapping("getAllPlansForMember")
	    public List<ExerciseEntity> getAllPlansForMember(@RequestParam(name="email") String email)
		{
		   return exercise.getExercisePlanForMember(email);
		}
	
}
