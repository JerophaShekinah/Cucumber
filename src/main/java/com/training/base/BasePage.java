package com.training.base;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
  WebDriver driver;
public HashMap<String,By> ObjectRepo = new HashMap<String, By>();

	public BasePage(WebDriver driver) 
	{
		this.driver=driver;
	}
public void addObject(String LogicalName, By by) 
{
	ObjectRepo.put(LogicalName, by);
}
private WebElement getElement(String LogicalName) 
{
	By by=ObjectRepo.get(LogicalName);
	WebElement element = driver.findElement(by);
	return element; 
}
public void enterintoTextbox(String LogicalName, String Value) 
{
	WebElement element= getElement(LogicalName);
	waitforElement(element);
	element.sendKeys(Value);
}
public void clickoncheckbox(String LogicalName) 
{
	WebElement element=getElement(LogicalName);
	waitforElement(element);
	element.click();
}
public void clickonButton(String LogicalName) 
{
	WebElement element= getElement(LogicalName);
	waitforElement(element);
	element.click();
}
public void validatepagetitle(String LogicalName)
{
	LogicalName=driver.getTitle();
}
public void clickondropdown(String LogicalName) 
{
	WebElement element= getElement(LogicalName);
	waitforElement(element);
	element.click();
}
public void clickonlink(String LogicalName) 
{
	WebElement element= getElement(LogicalName);
	waitforElement(element);
	element.click();
}
public void validatetextbox(String LogicalName, String Value) 
{
	LogicalName.compareToIgnoreCase(Value);
}
		
private void waitforElement(WebElement element) {
	WebDriverWait wait = new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.visibilityOf(element));
	
}

}
