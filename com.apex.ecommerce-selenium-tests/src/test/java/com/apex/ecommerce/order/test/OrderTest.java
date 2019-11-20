package com.apex.ecommerce.order.test;

import org.testng.annotations.Test;

import com.apex.ecommerce.core.ApexBaseTest;
import com.apex.ecommerce.order.constant.OrderConstant;
import com.apex.ecommerce.order.page.OrderPage;


public class OrderTest extends ApexBaseTest implements OrderConstant{
	@Test
	public void placeOrderSuccess(){
		OrderPage orderPage = new OrderPage(driver);
		orderPage.clickOnProductBtn("chitraaaaaaa@gmail.com", "chitra121");
	}
}
