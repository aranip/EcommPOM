package com.apex.ecommerce.registration.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apex.ecommerce.registration.constant.RegistrationConstant;

public class RegistrationPage implements RegistrationConstant{

	@FindBy(linkText = ACCT_CLICK)
	WebElement accountElm;
	@FindBy(linkText = SIGNUP_CLICK)
	WebElement signUpElm;
	@FindBy(xpath = GENDER_BTN)
	WebElement Gender;
	@FindBy(name = FIRST_NAME)
	WebElement fname;
	@FindBy(name = LAST_NAME)
	WebElement lname;
	@FindBy(name = DAY)
	WebElement day;
	@FindBy(name = MONTH)
	WebElement month;
	@FindBy(name = YEAR)
	WebElement year;
	@FindBy(name = EMAIL)
	WebElement email;
	@FindBy(name = HOME_NO)
	WebElement homeNo;
	@FindBy(name = ADDR)
	WebElement address;
	@FindBy(name = CITY)
	WebElement city;
	@FindBy(name = STATE)
	WebElement state;
	@FindBy(id = ZIP)
	WebElement zip;
	@FindBy(name = PHONE)
	WebElement phone;
	@FindBy(name = FAX)
	WebElement fax;
	@FindBy(name = PWD)
	WebElement pwd;
	@FindBy(name = CPWD)
	WebElement cpwd;
	@FindBy(id = TERMS)
	WebElement terms;
	@FindBy(name = SUBMIT)
	WebElement submit;
	
	public RegistrationPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public void clickOnSignUp(){
		accountElm.click();
		signUpElm.click();
		if(!Gender.isSelected())
		{
			Gender.click();
		}
		fname.sendKeys("chitratt");
		lname.sendKeys("haffds");
		day.sendKeys("15");
		month.sendKeys("7");
		year.sendKeys("1995");
		//email.sendKeys("christopher@yahoomail.com");
		email.sendKeys("chris@123.com");
		homeNo.sendKeys("104335");
		address.sendKeys("capitol avenue");
		city.sendKeys("sanjose");
		state.sendKeys("NY");
		zip.sendKeys("95113");
		phone.sendKeys("6547658765");
		fax.sendKeys("54326");
		pwd.sendKeys("chris123");
		cpwd.sendKeys("chris123");
		terms.isSelected();
		terms.click();
		submit.click();
}
}