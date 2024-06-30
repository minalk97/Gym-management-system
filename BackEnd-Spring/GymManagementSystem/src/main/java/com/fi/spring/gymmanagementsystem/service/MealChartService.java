package com.fi.spring.gymmanagementsystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fi.spring.gymmanagementsystem.entity.MealChartEntity;


@Service
public interface MealChartService 
{
	List<MealChartEntity> getAllMealChart();
}
