package com.fi.spring.gymmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fi.spring.gymmanagementsystem.entity.MealChartEntity;
import com.fi.spring.gymmanagementsystem.repository.MealChartRepository;


@Service
public class MealChartServiceImpl implements MealChartService
{
	@Autowired
	MealChartRepository repository;

	@Override
	public List<MealChartEntity> getAllMealChart() 
	{
		return repository.findAll();
	}

	
}
