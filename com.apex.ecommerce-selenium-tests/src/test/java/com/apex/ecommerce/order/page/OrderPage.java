package com.apex.ecommerce.order.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apex.ecommerce.order.constant.OrderConstant;

public class OrderPage implements OrderConstant {
	
	@FindBy(linkText = PRODUCT)
	WebElement product;
	@FindBy(xpath = ITEM)
	WebElement item;
	@FindBy(xpath = ADD_CART)
	WebElement cart;
	@FindBy(xpath = CHECKOUT)
	WebElement itemcout;
	@FindBy(name = EMAIL_NAME)
	WebElement emailIdElm;
	@FindBy(name = PWD_NAME)
	WebElement passwordElm;
	@FindBy(xpath = LOGIN)
	WebElement login;
	@FindBy(xpath = CONTINUE)
	WebElement cont;
	@FindBy(xpath = SHIP)
	WebElement ship;
//	@FindBy(xpath = CONTE)
//	WebElement cnte;
	public OrderPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public void clickOnProductBtn(String email, String pwd){
		product.click();
		item.click();
		cart.click();
		itemcout.click();
		emailIdElm.sendKeys(email);
		passwordElm.sendKeys(pwd);
		login.submit();
		cont.click();
		if(!ship.isSelected())
		{
		    ship.click();
		}
		//cnte.click();
}
}