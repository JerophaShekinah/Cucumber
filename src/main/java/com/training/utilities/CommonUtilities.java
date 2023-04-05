package com.training.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CommonUtilities {
	
	public String getproperty(String key) throws IOException 
	{
		String spath="/Users/jerophashekinah/eclipse-workspace/SalesforceCucumberFramework/properties/application.properties";
		FileInputStream fileinput= new FileInputStream(spath);
		Properties prop=new Properties();
		prop.load(fileinput);
		String Value=prop.getProperty(key);
	     return Value;
		
	}
	

}
