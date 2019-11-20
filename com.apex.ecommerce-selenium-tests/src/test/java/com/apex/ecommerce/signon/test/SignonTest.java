package com.apex.ecommerce.signon.test;

import org.testng.annotations.Test;

import com.apex.ecommerce.core.ApexBaseTest;
import com.apex.ecommerce.signon.constant.SignonConstant;
import com.apex.ecommerce.signon.page.SignonPage;

public class SignonTest extends ApexBaseTest implements SignonConstant {

	
	@Test
	public void testwithSuccessCredentials(){
		SignonPage signonPage = new SignonPage(driver);
		signonPage.clickOnLoginBtn("chitraaaaaaa@gmail.com", "chitra121");
	}
	@Test
	public void testwithBlankUserId(){
		SignonPage signonPage = new SignonPage(driver);
	signonPage.clickOnLoginBtn("", "chitra121");
	}
	@Test
	public void testwithBlankPassword(){
		SignonPage signonPage = new SignonPage(driver);
		signonPage.clickOnLoginBtn("chitraaaaaaa@gmail.com", "");
	}
	@Test
	public void testwithAllBlanks(){
		SignonPage signonPage = new SignonPage(driver);
		signonPage.clickOnLoginBtn("", "");
	}
	@Test
	public void testwithInvalidCharacters(){
		SignonPage signonPage = new SignonPage(driver);
		signonPage.clickOnLoginBtn("!@#$%$%^%%# ", "chitra121");
	}
//	@Test
//	public void testwithSQLInjection(){
//		
//	}
//	
//	@Test
//	//cross site scripting
//	public void testwithXSS(){
//		
//	}
}
