package com.fi.spring.gymmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fi.spring.gymmanagementsystem.entity.FoodItemEntity;
import com.fi.spring.gymmanagementsystem.service.FoodItemService;

@RestController
@RequestMapping("api")
public class FoodItemController 
{
	@Autowired
    FoodItemService service;
    
    @GetMapping("getAllFoodItemDetails")
    public List<FoodItemEntity> getAllFoodItems() 
    {
         return service.getAllFoodItems();
    }
}
