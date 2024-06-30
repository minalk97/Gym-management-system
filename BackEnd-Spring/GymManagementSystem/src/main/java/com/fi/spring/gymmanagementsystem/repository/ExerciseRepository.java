package com.fi.spring.gymmanagementsystem.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

//import com.fi.spring.gymmanagementsystem.entity.ExerciseChartEntity;
import com.fi.spring.gymmanagementsystem.entity.ExerciseEntity;
//import com.fi.spring.gymmanagementsystem.entity.MemberLoginEntity;

@Repository
public interface ExerciseRepository extends JpaRepository<ExerciseEntity,String>
	{
		@Query(nativeQuery=true,value="select * from exerciseplan where email=:nameemail")
		public List<ExerciseEntity> getMemberPlans(@Param("nameemail")String email);
		
		
	    @Modifying
	    @Transactional
	    @Query(nativeQuery=true,value="insert into exerciseplan(exeid,email,date,sets,time,exerciseid) values(:exeid,:email,:date,:sets,:time,:exerciseid)")
	    public int addExercisePlan(@Param("exeid")int exeid, @Param("email")String email, @Param("date")String date, @Param("sets")int sets, @Param("time")int time, @Param("exerciseid")int exerciseid);
	}

