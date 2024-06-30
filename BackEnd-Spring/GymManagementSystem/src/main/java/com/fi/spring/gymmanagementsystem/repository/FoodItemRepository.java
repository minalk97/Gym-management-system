package com.fi.spring.gymmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fi.spring.gymmanagementsystem.entity.FoodItemEntity;



@Repository
public interface FoodItemRepository extends JpaRepository<FoodItemEntity,Integer>
{

}
