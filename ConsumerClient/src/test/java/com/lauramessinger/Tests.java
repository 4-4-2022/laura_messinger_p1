package com.lauramessinger;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.beans.factory.annotation.Autowired;

import com.lauramessinger.controller.ProductController;

@TestInstance(Lifecycle.PER_CLASS)
public class Tests {

	ProductController productController = new ProductController();
	
	@Test
	void test() {
		assertTrue(productController.getClass() == ProductController.class);
	}
	
	
	
}
