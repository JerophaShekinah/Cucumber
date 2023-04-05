package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;
import com.training.base.BaseTest;

public class Homepage extends BasePage {

	static WebDriver driver;
	
	public Homepage() throws InterruptedException 
	{
		super(driver=BaseTest.getDriver());
		Thread.sleep(5000);
		addObject("usermenudd",By.id("userNavLabel"));
		addObject("Logout",By.xpath("//a[normalize-space()='Logout']"));
	}

}
