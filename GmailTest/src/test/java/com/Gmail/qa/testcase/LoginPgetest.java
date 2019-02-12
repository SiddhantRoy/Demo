package com.Gmail.qa.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.gmail.qa.base.TestBaseclass;
import com.gmail.qa.pages.Loginpage;

public class LoginPgetest<Homepage> extends TestBaseclass {
	
	Loginpage loginpage;//loginpage class object
	Homepage homepage;
public LoginPgetest()//constructor
{
	super();
	
}

@BeforeMethod
public void setup()
{
	intialization();
	loginpage=new Loginpage();
}
@Test
public void Loginpagetitle() {
}
{
	String title=loginpage.validateLoginpagetitle();
	Assert.assertEquals(title, "Gmail");
}

@Test
public void Login()
{
	homepage=(Homepage) loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
}


@AfterMethod
public void Quit()
{
	driver.quit();
}
}
