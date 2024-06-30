package com.fi.spring.gymmanagementsystem.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fi.spring.gymmanagementsystem.entity.ExerciseInsertEntity;
@Repository
public interface ExerciseInsertRepository extends JpaRepository<ExerciseInsertEntity, String> 
{
	 @Modifying
	    @Transactional
	    @Query(nativeQuery=true,value="insert into exerciseplan(exeid,date,sets,time,exerciseid,email) values(:exeid,:date,:sets,:time,:exerciseid,:email)")
	    public int addExercisePlan(@Param("exeid")int exeid, @Param("date")String date, @Param("sets")int sets, @Param("time")int time, @Param("exerciseid")int exerciseid, @Param("email")String email);
}
