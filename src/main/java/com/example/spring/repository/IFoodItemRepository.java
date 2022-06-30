package com.example.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring.entity.FoodItem;

public interface IFoodItemRepository extends JpaRepository<FoodItem, Integer>{

}
