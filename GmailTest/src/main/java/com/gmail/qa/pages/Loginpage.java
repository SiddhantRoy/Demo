package com.gmail.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.objectrepositorylib.Homepage;
import com.gmail.qa.base.TestBaseclass;

public class Loginpage extends TestBaseclass {

	private static final Homepage Homepage = null;

	//pagefactory OR
	@FindBy(id="identifierId")
	WebElement username;
	
	@FindBy(xpath="//span[text()='Next']")
	WebElement nextbutton;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//span[text()='Next']")
	WebElement nextbutton1;
	
	
	//create mathod
	//creat a constructor of a class
	public Loginpage()
	{
		PageFactory.initElements(driver,this);
		
	}
	
	
	//actions:
	public String validateLoginpagetitle()
	{
		return driver.getTitle();		
	}
	
	public Homepage login(String un, String pwd)
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		Loginpage.click();
		
		
		return Homepage;
		
		
	}


	private static void click() {
		// TODO Auto-generated method stub
		
	}
	
}
