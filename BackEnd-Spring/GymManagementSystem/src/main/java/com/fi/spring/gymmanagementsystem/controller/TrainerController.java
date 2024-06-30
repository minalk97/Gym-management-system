package com.fi.spring.gymmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fi.spring.gymmanagementsystem.entity.TrainerLoginEntity;
import com.fi.spring.gymmanagementsystem.service.TrainerService;


@RestController
@RequestMapping("api")
public class TrainerController 
{
	@Autowired
    TrainerService trainerService;
	 @Autowired
		TrainerService login;
	 @GetMapping("getTrainerById")
	    public TrainerLoginEntity getTrainerById(@RequestParam(name="email") String email)
	    {
	  	  return trainerService.getTrainerById(email);
	    }
	 @PostMapping("trainerregister")
	    public boolean insertNewMember(@RequestBody TrainerLoginEntity entity)
	    {
	  	  return trainerService.addNewMember(entity);
	    }
	 
	 @GetMapping("getAllTrainers")
	    public List<TrainerLoginEntity> getAllMembers() {
			
			return trainerService.getAllMembers();
		}
	 @PostMapping("authenticatetrainer")
		public boolean authenticateTrainer(@RequestBody TrainerLoginEntity entity) {
			
			return login.authenticateTrainer(entity);
		}
}
