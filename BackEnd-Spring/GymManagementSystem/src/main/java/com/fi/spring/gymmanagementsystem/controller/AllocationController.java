package com.fi.spring.gymmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fi.spring.gymmanagementsystem.entity.AllocationEntity;
import com.fi.spring.gymmanagementsystem.service.AllocationService;
@RestController
@RequestMapping("api")
public class AllocationController 
{
	@Autowired
    AllocationService allocationService;
	 
	 @GetMapping("getAllAllocations")
	    public List<AllocationEntity> getAllManagers() {
			
			return allocationService.getAllAllocations();
		}
	 @PostMapping("allocate")
	    public boolean insertNewMember(@RequestBody AllocationEntity entity)
	    {
	  	  return allocationService.allocateMember(entity);
	    }

}
