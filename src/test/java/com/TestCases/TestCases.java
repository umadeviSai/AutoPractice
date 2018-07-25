package com.TestCases;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCases {
	
	public static void main(String[]args){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TM\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("prem");
		driver.findElement(By.xpath("//img[@src='/gif/continue_new1.gif?v=1']")).click();
		driver.findElement(By.xpath("//a[@target='blank']")).click();
		Set<String> handles = driver.getWindowHandles();
		for(String handle:handles){
			driver.switchTo().window(handle);
			if(driver.getCurrentUrl().contains("driver.getCurrentUrl();")){
				driver.findElement(By.linkText("Click here")).click();
				handles = driver.getWindowHandles();
				for(String handle2:handles){
					driver.switchTo().window(handle2);
					if(driver.getCurrentUrl().contains("product/customerid")){
						driver.close();
					}
				}
			}
		}
	}

}
