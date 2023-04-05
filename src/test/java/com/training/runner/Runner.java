package com.training.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (features="/Users/jerophashekinah/eclipse-workspace/SalesforceCucumberFramework/features",
                  glue= {"com.training.steps"} , 
                   plugin = {"pretty", "html:target/cucumber-reports/cucumber.html",
                		                "json:target/cucumber-reports/cucumber.json"},
                   tags="@TC03"

)

public class Runner {
	
	

}
