package com.fi.spring.gymmanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fi.spring.gymmanagementsystem.entity.DietPlanInsertEntity;
import com.fi.spring.gymmanagementsystem.repository.DietPlanInsertRepository;
@Service
public class DietPlanInsertServiceImpl implements DietPlanInsertService {

	@Autowired
    DietPlanInsertRepository repository;
	@Override
	public boolean addDietPlanForMember(DietPlanInsertEntity entity) 
	{
		int plan=repository.addDietPlan(entity.getId(),entity.getDate(),entity.getMealid(),entity.getFoodid(),entity.getEmail());
		return plan!=0?true:false;
	}

}
