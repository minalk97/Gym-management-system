package com.fi.spring.gymmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fi.spring.gymmanagementsystem.entity.MealChartEntity;
import com.fi.spring.gymmanagementsystem.service.MealChartService;

@RestController
@RequestMapping("api")
public class MealChartController 
{
	@Autowired
    MealChartService service;
    
    @GetMapping("getAllMealChartDetails")
    public List<MealChartEntity> getAllMealChart() 
    {
         return service.getAllMealChart();
    }
}
