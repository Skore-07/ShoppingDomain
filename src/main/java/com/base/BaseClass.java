package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.utility.Utility;

public class BaseClass {
	public static WebDriver driver;
	public static Properties prop;
	
	
	
	
	public static void launchTheWeb()
	
	 
    {
		 FileInputStream file=null;;
			try {
				File src = new File("C:\\Users\\Suraj\\eclipse-workspace\\ShoppingDemo\\src\\main\\resources\\property\\config.properties");
				file = new FileInputStream( src);
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
			   prop= new Properties();
			   try {
				prop.load(file);
			} catch (IOException e) {
				
				e.printStackTrace();
			}   // load properties file
	
    	
    	driver= new FirefoxDriver();
    	
    	driver.manage().window().maximize();
    	Utility.implicit_Wait();
    	driver.get(prop.getProperty("url"));
    	
    }  	

}