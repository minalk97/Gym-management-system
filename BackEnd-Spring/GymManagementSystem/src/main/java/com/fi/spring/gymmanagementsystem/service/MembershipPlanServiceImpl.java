package com.fi.spring.gymmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fi.spring.gymmanagementsystem.entity.MembershipPlanEntity;
import com.fi.spring.gymmanagementsystem.repository.MembershipPlanRepository;
@Service
public class MembershipPlanServiceImpl implements MembershipPlanService {

	@Autowired
	MembershipPlanRepository plan;
	@Override
	public List<MembershipPlanEntity> getMembershipPlanForMember() 
	{
       List<MembershipPlanEntity> plans=plan.getMembershipPlans();
		
		return plans;
	}

}
