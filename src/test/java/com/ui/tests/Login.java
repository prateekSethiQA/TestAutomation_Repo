package com.ui.tests;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.baseUtil.WebUi;

public class Login extends WebUi{
	
	@Test
	public void performSearch() {
		driver.get("https://www.google.com/");
//		driver.findElement(By.name("q")).sendKeys("Browserstack Guide"); // name locator for text box
		WebElement searchbutton = driver.findElement(By.name("btnK"));// name locator for google search
		searchbutton.click();
	}
}
