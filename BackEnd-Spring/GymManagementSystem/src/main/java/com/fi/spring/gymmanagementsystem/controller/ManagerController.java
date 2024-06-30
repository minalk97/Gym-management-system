package com.fi.spring.gymmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fi.spring.gymmanagementsystem.entity.ManagerLoginEntity;
import com.fi.spring.gymmanagementsystem.service.ManagerService;

@RestController
@RequestMapping("api")
public class ManagerController 
{
	@Autowired
    ManagerService managerService;
	 @Autowired
		ManagerService login;
	 
	 
	 @GetMapping("getAllManagers")
	    public List<ManagerLoginEntity> getAllManagers() {
			
			return managerService.getAllManagers();
		}
	 @PostMapping("authenticateManager")
		public boolean authenticateManager(@RequestBody ManagerLoginEntity entity) {
			
			return login.authenticateManager(entity);
		}
}
