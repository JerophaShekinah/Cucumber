package com.training.steps;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.training.base.BasePage;
import com.training.base.BaseTest;
import com.training.pagefactory.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps extends BaseTest {
	
	PageFactory pageFactory= new PageFactory();
	BasePage page;
	
	@Before
	public void setup() throws Exception 
	{
		launchapplication();
	}

	@Given("user is on {string}")
	public void user_is_on(String Page) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IOException
	{
		
		page = pageFactory.initialize(Page);
		//page= new LoginPage();
		
	    
	}
	@When("user  enter into Textbox {string} {string}")
	public void user_enter_into_textbox(String LogicalName, String Value) 
	{
	    page.enterintoTextbox(LogicalName, Value);
	}
	
	@Then("click on button {string}")
	public void click_on_button(String LogicalName) 
	{
	    page.clickonButton(LogicalName);
	}
	
	@Then("error message is displayed and user validates the error message {string}")
	public void error_message_is_displayed_and_user_validates_the_error_message(String LogicalName) 
	{
		String Expected="Please enter your password.";
	    LogicalName.compareToIgnoreCase(Expected);
	    System.out.println("Error message is validated");
	}
	
	
	@Then("validate title {string} {string}")
	public void validate_title(String LogicalName, String Value ) 
	{
		page.validatepagetitle(LogicalName);
		LogicalName.compareToIgnoreCase(Value);
	}

@Then("click on checkbox {string}")
public void click_on_checkbox(String LogicalName) 
{
    page.clickoncheckbox(LogicalName);

}
@Then("click on usermenu {string}")
public void click_on_usermenu(String LogicalName) 
{
    page.clickondropdown(LogicalName);
}
@Then("click on Logout {string}")
public void click_on_logout(String LogicalName) 
{
page.clickonlink(LogicalName);    

}
@Then("validate the populated usermenu Textbox {string} {string}")
public void validate_the_populated_usermenu_textbox(String LogicalName, String Value) 
{
	
	page.validatetextbox(LogicalName, Value);
}

	
	@After
	public void teardown(Scenario scenario) {
		
		byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		
		scenario.attach(screenshot, "image/png", scenario.getName());
		
		//driver.close();
		driver=null;
	}
	
}
