package com.lauramessinger;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.lauramessinger.controller.AccountController;
import com.lauramessinger.controller.ProductController;
import com.lauramessinger.model.Account;
import com.lauramessinger.model.Cpu;
import com.lauramessinger.model.Monitor;

@SpringBootTest
public class Tests {

	@Autowired
	ProductController productController;
	
	@Autowired
	AccountController accountController;
	
	@Test
	void test1() {
		assertTrue(productController.getClass() == ProductController.class);
	}
	
	@Test
	void test2() {
		Object firstProduct = productController.getAll().toArray()[0];
		assertTrue(firstProduct.getClass() == Cpu.class);
	}
	
	@Test
	void test3() {
		Object lastProduct = productController.getAll().toArray()[19];
		assertTrue(lastProduct.getClass() == Monitor.class);
	}
	
	@Test
	void test4() {
		Object firstAccount = accountController.getAll().toArray()[0];
		Account casted = (Account)firstAccount;
		assertTrue(casted.getComments().size() == 10);
	}
	
	@Test
	void test5() {
		assertTrue(true);
	}
	
	@Test
	void test6() {
		Object firstAccount = accountController.getAll().toArray()[0];
		Account casted = (Account)firstAccount;
		assertTrue(casted.getInformation().getFirstName() != null);
	}
	
}
