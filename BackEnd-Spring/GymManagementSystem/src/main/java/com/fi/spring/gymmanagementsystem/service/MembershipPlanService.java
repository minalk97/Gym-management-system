package com.fi.spring.gymmanagementsystem.service;

import java.util.List;
import com.fi.spring.gymmanagementsystem.entity.MembershipPlanEntity;

public interface MembershipPlanService 
{
	List<MembershipPlanEntity> getMembershipPlanForMember();

}
