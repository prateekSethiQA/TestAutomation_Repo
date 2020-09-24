package com.baseUtil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class WebUi {
	protected WebDriver driver;
	
	@BeforeSuite
	public void spinUp() {
		String Path_of_Firefox_Driver=System.getProperty("user.dir")+"/resources/geckodriver";
		System.setProperty("webdriver.gecko.driver",Path_of_Firefox_Driver);
		driver = new FirefoxDriver();		
	}
	
	@AfterSuite
	public void spinDown() {
		driver.quit();
	}
	

}
