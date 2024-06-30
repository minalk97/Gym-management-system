package com.fi.spring.gymmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fi.spring.gymmanagementsystem.entity.ManagerLoginEntity;


public interface ManagerRepository extends JpaRepository<ManagerLoginEntity, String> 
{
	@Query(nativeQuery = true,value = "select * from manager where managerid=:namemanagerid and password=:namepassword")
	public ManagerLoginEntity authManager(@Param("namemanagerid")String managerid,@Param("namepassword")String password);


}
