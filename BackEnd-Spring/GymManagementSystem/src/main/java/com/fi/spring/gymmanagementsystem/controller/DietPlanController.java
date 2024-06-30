package com.fi.spring.gymmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fi.spring.gymmanagementsystem.entity.DietPlanEntity;
import com.fi.spring.gymmanagementsystem.service.DietPlanService;

@RestController
@RequestMapping("api")
public class DietPlanController 
{
  @Autowired
  DietPlanService dietplanService;
  
  
  @GetMapping("getDietPlanById")
  public List<DietPlanEntity> getDietPlanById(@RequestParam(name="email") String email)
  {
	  return dietplanService.getDietPlanByMember(email);
  }
  
  @GetMapping("getAllDietPlans")
  public List<DietPlanEntity> getAllDietPlans()
  {
	  return dietplanService.getAllDietPlans();
  }

  
}
