package com.fi.spring.gymmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.fi.spring.gymmanagementsystem.entity.MembershipPlanEntity;
import com.fi.spring.gymmanagementsystem.service.MembershipPlanService;

@RestController
@RequestMapping("api")
public class MembershipPlanController 
{
	@Autowired
	MembershipPlanService plan;
	
	@GetMapping("getAllMembershipPlans")
    public List<MembershipPlanEntity> getAllMembershipPlansForMember()
	{
	   return plan.getMembershipPlanForMember()	;
			   }

}
