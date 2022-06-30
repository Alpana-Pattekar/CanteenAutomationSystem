package com.example.spring.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Data
public class FoodItem {
	
	@Id
	private int itemId;
	@NotNull(message="Item name shouldn't be empty")
	@Size(min=4, max=20, message="The characters are not in required size")
	private String itemName;
	
	private double itemPrice;
	@NotNull(message="Item quantity is not provided")
	private int itemQty;
	
//	@OneToOne(cascade=CascadeType.ALL)
//	@JoinColumn(name="cartId")
//	private Cart cart;
	

}
