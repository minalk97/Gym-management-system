package com.fi.spring.gymmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fi.spring.gymmanagementsystem.entity.ExerciseChartEntity;

@Repository
public interface ExerciseChartRepository extends JpaRepository<ExerciseChartEntity,String>
{

}