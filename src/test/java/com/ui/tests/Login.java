package com.ui.tests;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.baseUtil.WebUi;

public class Login extends WebUi{
	
	@Test
	public void performSearch() {
		driver.get("http://automationpractice.com/index.php");
//		driver.findElement(By.name("q")).sendKeys("Browserstack Guide"); // name locator for text box
		WebElement signIn = driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
		signIn.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
