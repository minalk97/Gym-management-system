package com.fi.spring.gymmanagementsystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fi.spring.gymmanagementsystem.entity.ExerciseChartEntity;

@Service
public interface ExerciseChartService 
{
	List<ExerciseChartEntity> getAllExerciseCharts();
	ExerciseChartEntity getExerciseChartsById(String email);
}
