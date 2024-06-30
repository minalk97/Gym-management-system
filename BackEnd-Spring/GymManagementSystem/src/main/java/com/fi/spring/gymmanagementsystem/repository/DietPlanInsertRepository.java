package com.fi.spring.gymmanagementsystem.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fi.spring.gymmanagementsystem.entity.DietPlanInsertEntity;

public interface DietPlanInsertRepository extends JpaRepository<DietPlanInsertEntity, String> 
{
	 @Modifying
	    @Transactional
	    @Query(nativeQuery=true,value="insert into dietplan(id,date,mealid,foodid,email) values(:id,:date,:mealid,:foodid,:email)")
	    public int addDietPlan(@Param("id")int id,@Param("date")String date, @Param("mealid")int mealid, @Param("foodid")int foodid, @Param("email")String email);
}
