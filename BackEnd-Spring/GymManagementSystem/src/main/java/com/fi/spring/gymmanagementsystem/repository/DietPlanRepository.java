package com.fi.spring.gymmanagementsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fi.spring.gymmanagementsystem.entity.DietPlanEntity;

@Repository
public interface DietPlanRepository extends JpaRepository<DietPlanEntity,String>
{
	@Query(nativeQuery=true,value="select * from dietplan where email=:email")
	public List<DietPlanEntity> getDietByMemberId(@Param("email")String email);
	
    @Modifying
    @Query(nativeQuery=true,value="insert into dietplan(id,date,mealid,foodid,email) values(:id,:date,:mealid,:foodid,:email)")
    public int addDietPlan(@Param("id")int id,@Param("date")String date, @Param("mealid")int mealid, @Param("foodid")int foodid, @Param("email")String email);
}
