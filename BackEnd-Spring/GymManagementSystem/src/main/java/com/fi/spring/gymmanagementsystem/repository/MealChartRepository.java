package com.fi.spring.gymmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fi.spring.gymmanagementsystem.entity.MealChartEntity;


@Repository
public interface MealChartRepository extends JpaRepository<MealChartEntity,Integer>
{

}
