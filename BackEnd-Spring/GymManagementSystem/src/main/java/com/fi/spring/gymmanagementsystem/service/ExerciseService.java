package com.fi.spring.gymmanagementsystem.service;

import java.util.List;

import com.fi.spring.gymmanagementsystem.entity.ExerciseEntity;

public interface ExerciseService 
{

    ExerciseEntity getExercisePlanById(String email);
    //boolean addnewMember( ExerciseEntity entity);
    List<ExerciseEntity> getExercisePlanForMember(String email);
    boolean addPlanForMember(ExerciseEntity entity);
}
