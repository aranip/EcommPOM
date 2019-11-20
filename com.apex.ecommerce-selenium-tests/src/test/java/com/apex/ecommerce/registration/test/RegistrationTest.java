package com.apex.ecommerce.registration.test;

import org.testng.annotations.Test;

import com.apex.ecommerce.core.ApexBaseTest;
import com.apex.ecommerce.registration.constant.RegistrationConstant;
import com.apex.ecommerce.registration.page.RegistrationPage;
import com.apex.ecommerce.signon.page.SignonPage;

public class RegistrationTest extends ApexBaseTest implements RegistrationConstant {

	@Test
	public void RegisterBeforeLogin(){
		RegistrationPage registrationPage = new RegistrationPage(driver);
		registrationPage.clickOnSignUp();
	}
}
