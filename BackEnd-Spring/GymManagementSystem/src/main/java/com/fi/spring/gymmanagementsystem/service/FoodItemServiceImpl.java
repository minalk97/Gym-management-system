package com.fi.spring.gymmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fi.spring.gymmanagementsystem.entity.FoodItemEntity;
import com.fi.spring.gymmanagementsystem.repository.FoodItemRepository;
@Service
public class FoodItemServiceImpl implements FoodItemService
{

	@Autowired
	FoodItemRepository repository;
	
	@Override
	public List<FoodItemEntity> getAllFoodItems() {
		return repository.findAll();
	}

}
