package com.baseUtil;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class WebUi {
	protected WebDriver driver;
	
	@BeforeSuite
	public void spinUp() throws MalformedURLException {
		DesiredCapabilities dr=null;
		dr=DesiredCapabilities.firefox();
		dr.setPlatform(Platform.MAC);
		String Path_of_Firefox_Driver=System.getProperty("user.dir")+"/resources/geckodriver";
		System.setProperty("webdriver.gecko.driver",Path_of_Firefox_Driver);
		//driver = new FirefoxDriver();	
		driver = new RemoteWebDriver(new URL("http://192.168.0.104:4444/wd/hub"),dr);
	}
	
	@AfterSuite
	public void spinDown() {
		driver.quit();
	}
	

}
