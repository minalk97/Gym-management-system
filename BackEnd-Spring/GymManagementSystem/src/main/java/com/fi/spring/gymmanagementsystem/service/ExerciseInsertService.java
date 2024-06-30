package com.fi.spring.gymmanagementsystem.service;

import org.springframework.stereotype.Service;

import com.fi.spring.gymmanagementsystem.entity.ExerciseEntity;
import com.fi.spring.gymmanagementsystem.entity.ExerciseInsertEntity;
@Service
public interface ExerciseInsertService 
{
	boolean addPlanForMember(ExerciseInsertEntity entity);
}
