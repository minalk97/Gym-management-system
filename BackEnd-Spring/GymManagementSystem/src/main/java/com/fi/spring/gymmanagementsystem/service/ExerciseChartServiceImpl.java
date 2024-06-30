package com.fi.spring.gymmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fi.spring.gymmanagementsystem.entity.ExerciseChartEntity;
import com.fi.spring.gymmanagementsystem.repository.ExerciseChartRepository;
@Service
public class ExerciseChartServiceImpl implements ExerciseChartService
{
    @Autowired
	ExerciseChartRepository repository;
	@Override
	public List<ExerciseChartEntity> getAllExerciseCharts() 
	{
		return repository.findAll();
	}

	@Override
	public ExerciseChartEntity getExerciseChartsById(String email) {
		
		return repository.findById(email).get();
	}
}
