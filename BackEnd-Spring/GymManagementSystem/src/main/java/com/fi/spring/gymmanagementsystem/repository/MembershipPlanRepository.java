package com.fi.spring.gymmanagementsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fi.spring.gymmanagementsystem.entity.MembershipPlanEntity;

public interface MembershipPlanRepository extends JpaRepository<MembershipPlanEntity, Integer> 
{
	@Query(nativeQuery=true,value="select * from membershipplan")
	public List<MembershipPlanEntity> getMembershipPlans();
}
