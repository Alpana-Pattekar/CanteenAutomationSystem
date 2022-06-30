package com.example.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.entity.Cart;
import com.example.spring.entity.FoodItem;
import com.example.spring.service.ICartService;
import com.example.spring.service.IFoodItemService;

@RestController
public class FoodItemController {

	@Autowired
	IFoodItemService foodItemServ;

//	//add item to cart
//	@PostMapping("/additem")
//	ResponseEntity<FoodItem> addItemToCart(@RequestBody FoodItem foodItem) {
//		FoodItem item = foodItemServ.addItemToCart(foodItem);
//		return new ResponseEntity<>(item, HttpStatus.OK);
//
//	}
	
//	//delete item from cart based on itemId
//		@DeleteMapping("/deleteitem/{id}")
//		ResponseEntity<FoodItem> deleteCartItem(@PathVariable("id") int cartId) {
//			FoodItem foodItem = foodItemServ.deleteItem(cartId);
//			return new ResponseEntity<>(foodItem, HttpStatus.OK);
//		}

}