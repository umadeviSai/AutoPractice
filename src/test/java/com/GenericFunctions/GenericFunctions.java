package com.GenericFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericFunctions {
	
	
	
	public static WebDriver driver;
	
	public static void launchApplication(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//check
		driver.manage().deleteAllCookies();
	}

}
