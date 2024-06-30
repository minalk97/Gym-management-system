package com.fi.spring.gymmanagementsystem.service;

import java.util.List;

import com.fi.spring.gymmanagementsystem.entity.DietPlanEntity;

public interface DietPlanService 
{
	List <DietPlanEntity> getDietPlanByMember(String email);
	List<DietPlanEntity> getAllDietPlans();
	boolean addDietPlanForMember(DietPlanEntity entity);
}
