package com.fi.spring.gymmanagementsystem.service;

import org.springframework.stereotype.Service;

import com.fi.spring.gymmanagementsystem.entity.DietPlanInsertEntity;
@Service
public interface DietPlanInsertService 
{
	boolean addDietPlanForMember(DietPlanInsertEntity entity);
}
