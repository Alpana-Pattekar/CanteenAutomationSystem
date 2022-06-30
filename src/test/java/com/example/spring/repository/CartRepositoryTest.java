package com.example.spring.repository;


import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

import com.example.spring.entity.Cart;

@SpringBootTest
public class CartRepositoryTest {
	
	@Autowired
	ICartRepository cartRepository;
	
//	@Test
//	void testGetItemByCartId() {
//		List<Cart> items = cartRepository.findById();
//		assertEquals(1, items.size());
//	}
	
	

}
