package com.fi.spring.gymmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fi.spring.gymmanagementsystem.entity.ExerciseChartEntity;
import com.fi.spring.gymmanagementsystem.service.ExerciseChartService;

@RestController
@RequestMapping("api")
public class ExerciseChartController 
{
    @Autowired
    ExerciseChartService service;
    
    @GetMapping("getAllChartDetails")
    public List<ExerciseChartEntity> getAllExerciseCharts() 
    {
         return service.getAllExerciseCharts();
    }
}
