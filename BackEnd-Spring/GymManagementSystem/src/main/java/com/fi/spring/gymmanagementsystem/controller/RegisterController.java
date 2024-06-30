package com.fi.spring.gymmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fi.spring.gymmanagementsystem.entity.MemberLoginEntity;
import com.fi.spring.gymmanagementsystem.service.RegisterService;
//@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("api")
public class RegisterController {
	@Autowired
    RegisterService registerService;
	 @Autowired
		RegisterService login;
    
    @PostMapping("register")
    public boolean insertNewMember(@RequestBody MemberLoginEntity entity)
    {
  	  return registerService.addNewMember(entity);
    }
    
    @GetMapping("getMemberById")
    public MemberLoginEntity getMemberById(@RequestParam(name="email") String email)
    {
  	  return registerService.getMemberById(email);
    }
    
   @GetMapping("getAllMembers")
    public List<MemberLoginEntity> getAllMembers() {
		
		return registerService.getAllMembers();
	}
    
	@PostMapping("/authenticate")
	public boolean authenticateMem(@RequestBody MemberLoginEntity entity) {
		
		return login.authenticateMember(entity);
	}
}
