package com.fi.spring.gymmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fi.spring.gymmanagementsystem.entity.ManagerLoginEntity;

import com.fi.spring.gymmanagementsystem.repository.ManagerRepository;

@Service
public class ManagerServiceImpl implements ManagerService {

	 @Autowired
	    ManagerRepository repository;
	@Override
	public boolean authenticateManager(ManagerLoginEntity entity) 
	{
		ManagerLoginEntity returnEntity=repository.authManager(entity.getManagerid(),entity.getPassword());
		return returnEntity!=null?true:false;
	}

	@Override
	public List<ManagerLoginEntity> getAllManagers() 
	{
		return repository.findAll();
	}

}
