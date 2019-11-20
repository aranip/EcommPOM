package com.apex.ecommerce.signon.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apex.ecommerce.signon.constant.SignonConstant;

public class SignonPage implements SignonConstant {

	
	@FindBy(linkText = ACCOUNT_CLICK)
	WebElement accountElm;
	@FindBy(name = EMAIL_NAME_LOCATOR)
	WebElement emailIdElm;
	@FindBy(name = PWD_NAME_LOCATOR)
	WebElement passwordElm;
	@FindBy(linkText = LOGIN_BTN_LINK_TEXT_LOCATOR)
	WebElement loginBtnElm;
	public SignonPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public void clickOnLoginBtn(String email, String pwd){
		accountElm.click();
		//enter email
		emailIdElm.sendKeys(email);
		//enter the password
		passwordElm.sendKeys(pwd);
		//click on the btn
		loginBtnElm.click();
	}
	
}
