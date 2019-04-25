package com.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Locators {
	@Test
	public void testDemoWebShop() {
		
		WebDriver driver;
		
		driver.get("http://demowebshop.tricentis.com/login");
		String Url=driver.getCurrentUrl();
		Assert.assertTrue(Url.contains("webshop"));
	}

}