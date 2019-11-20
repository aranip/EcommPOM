package com.datadrivenXlsx;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataDrivenTest extends TestBase implements EcommerceConstant{
	
	@DataProvider
	public Object[][] getTestData() throws Exception{
		Object[][] testData = ParameterizeTest.getDataFromExcel("/Users/amruthapenigalapati/eclipse-workspace/corejava/src/Basic_java/com.Ecommerece.DDXlsx/src/main/java/com/testdata/EcomLogin.xlsx","Sheet1");
		return testData;
	}
	
	@DataProvider
	public Object[][] InValidData() throws Exception{
		Object[][] testinvalidData = ParameterizeTest.getDataFromExcel("/Users/amruthapenigalapati/eclipse-workspace/corejava/src/Basic_java/com.Ecommerece.DDXlsx/src/main/java/com/testdata/EcomLogin.xlsx","Sheet3");
		return testinvalidData;
	}
	@Test(dataProvider ="getTestData")
	public static  void validateemail(String username, String Pwd ) throws InterruptedException{
			driver.findElement(By.linkText("ACCOUNT")).click();
		       Thread.sleep(1000);
		      driver.findElement(By.name(EMAIL)).sendKeys(username);   
		     	Thread.sleep(1000);
		         driver.findElement(By.name(PWD)).sendKeys(Pwd);
				   	Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[4]/td[2]/form/table/tbody/tr[5]/td/a/div")).click();
				String s1 = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div")).getText();
				        System.out.println(s1);
				        Assert.assertEquals(TITLE2, s1);	        
		}
	@Test(dataProvider ="InValidData")
	public void IncorrectUserName(String username, String Pwd  ) throws InterruptedException{
		 driver.findElement(By.linkText("ACCOUNT")).click();
	       Thread.sleep(1000);
	       driver.findElement(By.name(EMAIL)).sendKeys(username);
	   	Thread.sleep(1000);
	   	driver.findElement(By.name(PWD)).sendKeys(Pwd);
	   	Thread.sleep(1000);
	   	driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[4]/td[2]/form/table/tbody/tr[5]/td/a/div")).click();
	   	String s = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/span")).getText();
	   	System.out.println(s);
	   	Assert.assertEquals(TITLE1, s);	
	}
	
	}
