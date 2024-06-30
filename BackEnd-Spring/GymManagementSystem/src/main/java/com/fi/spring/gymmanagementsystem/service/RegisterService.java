package com.fi.spring.gymmanagementsystem.service;

import java.util.List;


import com.fi.spring.gymmanagementsystem.entity.MemberLoginEntity;

public interface RegisterService {
	boolean addNewMember(MemberLoginEntity entity);
	MemberLoginEntity getMemberById(String email);
	boolean authenticateMember(MemberLoginEntity entity);
	List<MemberLoginEntity> getAllMembers();
}
