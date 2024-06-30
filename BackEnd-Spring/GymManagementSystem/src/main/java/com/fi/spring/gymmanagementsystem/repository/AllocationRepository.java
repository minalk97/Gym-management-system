package com.fi.spring.gymmanagementsystem.repository;



import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fi.spring.gymmanagementsystem.entity.AllocationEntity;



public interface AllocationRepository extends JpaRepository<AllocationEntity, Integer> 
{  
	@Query(nativeQuery = true,value = "select id,traineremail,mememail from memberallocation")
	public List<AllocationEntity> getAllAllocations();
	
	 @Modifying
	    @Transactional
	    @Query(nativeQuery=true,value="insert into memberallocation(id,mememail,traineremail) values(:id,:mememail,:traineremail)")
	    public int allocateMember( @Param("id")int id,@Param("mememail")String mememail, @Param("traineremail")String traineremail);
	

}
