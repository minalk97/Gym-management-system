package com.fi.spring.gymmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.fi.spring.gymmanagementsystem.entity.TrainerLoginEntity;

public interface TrainerRepository extends JpaRepository<TrainerLoginEntity, String> 
{
	@Query(nativeQuery = true,value = "select * from trainer where email=:nameemail and password=:namepassword")
	public TrainerLoginEntity authTrainer(@Param("nameemail")String email,@Param("namepassword")String password);
	
}
