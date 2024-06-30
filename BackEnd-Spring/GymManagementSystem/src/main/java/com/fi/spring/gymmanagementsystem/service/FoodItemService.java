package com.fi.spring.gymmanagementsystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fi.spring.gymmanagementsystem.entity.FoodItemEntity;


@Service
public interface FoodItemService 
{
	List<FoodItemEntity> getAllFoodItems();
}
