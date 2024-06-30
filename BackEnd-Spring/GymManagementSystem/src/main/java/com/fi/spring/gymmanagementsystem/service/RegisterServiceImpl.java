package com.fi.spring.gymmanagementsystem.service;

import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fi.spring.gymmanagementsystem.entity.MemberLoginEntity;
import com.fi.spring.gymmanagementsystem.repository.RegisterRepository;
@Service
public class RegisterServiceImpl implements RegisterService {
		@Autowired
		
	    RegisterRepository repository;
		@Override
		public boolean addNewMember(MemberLoginEntity entity)
		{
			int returnEntity=repository.addNewMember(entity.getMemberid(),entity.getName(),entity.getEmail(),entity.getPassword(),entity.getContactno(), entity.getAge(), entity.getAddress(),entity.getCpassword(),entity.getMembershipid());
			return returnEntity!=0?true:false;	
		}
		@Override
		public MemberLoginEntity getMemberById(String email) {
			return repository.findById(email).get();
		}
				
		@Override
		public boolean authenticateMember(MemberLoginEntity entity) 
		{
			MemberLoginEntity returnEntity=repository.authMember(entity.getEmail(),entity.getPassword());
				return returnEntity!=null?true:false;
				
			}
		@Override
		public List<MemberLoginEntity> getAllMembers() {
		
			return repository.getAllMembers();
		}
	}


