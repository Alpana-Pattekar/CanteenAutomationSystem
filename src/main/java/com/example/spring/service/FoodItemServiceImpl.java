package com.example.spring.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.entity.FoodItem;
import com.example.spring.repository.ICartRepository;
import com.example.spring.repository.IFoodItemRepository;

@Service
public class FoodItemServiceImpl implements IFoodItemService {

	@Autowired
	IFoodItemRepository foodItemRepo;

//	@Override
//	public FoodItem addItemToCart(FoodItem foodItem) {
//		return foodItemRepo.save(foodItem);
//	}

//	@Override
//	public FoodItem deleteItem(int cartId) {
//		//find emp based on empid
//		Optional<FoodItem> foodItem = foodItemRepo.findById(cartId);
//
//		//delete emp if present else return null or throw exception
//		if(foodItem.isPresent()) {
//			foodItemRepo.deleteById(cartId);
//		} else {
//			return null;
//		}
//		//return emp
//		return foodItem.get();
//	}

}
