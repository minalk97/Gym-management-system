package com.fi.spring.gymmanagementsystem.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fi.spring.gymmanagementsystem.entity.DietPlanEntity;
import com.fi.spring.gymmanagementsystem.repository.DietPlanRepository;



@Service
public class DietPlanServiceImpl implements DietPlanService
{
	@Autowired
    DietPlanRepository repository;
	
	@Override
	public List<DietPlanEntity> getAllDietPlans() 
	{
		return repository.findAll();
	}


	@Override
	public List<DietPlanEntity> getDietPlanByMember(String email) {
		
		List<DietPlanEntity> plans = repository.getDietByMemberId(email);
		return plans;
	}


	@Override
	@Transactional
	public boolean addDietPlanForMember(DietPlanEntity entity) 
	{
		int plan=repository.addDietPlan(entity.getId(),entity.getDate(),entity.getMealid().getMealid(),entity.getFoodid().getFoodid(),entity.getEmail().getEmail());
		return plan!=0?true:false;
	}
	
	
	
	
	
	
}
