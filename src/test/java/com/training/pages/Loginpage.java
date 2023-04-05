package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;
import com.training.base.BaseTest;

public class Loginpage extends BasePage 
{
	static WebDriver driver;
	
	public Loginpage() throws InterruptedException
	{
		super(driver=BaseTest.getDriver());
		Thread.sleep(2000);
		addObject("Username", By.id("username"));
		addObject("Password",By.id("password"));
		addObject("Login", By.id("Login"));
		addObject("Errormessage", By.id("error"));
		addObject("RememberMe",By.id("rememberUn"));
		addObject("popusername",By.id("idcard-identity"));
	}
	
}

