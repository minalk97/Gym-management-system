package com.fi.spring.gymmanagementsystem.service;

import java.util.List;

import com.fi.spring.gymmanagementsystem.entity.ManagerLoginEntity;

public interface ManagerService 
{
	boolean authenticateManager(ManagerLoginEntity entity);
	List<ManagerLoginEntity> getAllManagers();
}
