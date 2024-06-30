package com.fi.spring.gymmanagementsystem.service;

import java.util.List;

import com.fi.spring.gymmanagementsystem.entity.AllocationEntity;


public interface AllocationService 
{
	List<AllocationEntity> getAllAllocations();
    boolean allocateMember(AllocationEntity entity);
}
