package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Actions2 {
	
	@Test
	public void testTestmeapp() {
		WebDriver driver=DiverUtility.getDriver("chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/");
		driver.manage().window().maximize();
		Actions act1=new Actions(driver);
		act1.moveToElement(driver.findElement(By.partialLinkText("AboutUs"))).perform();
		act1.moveToElement(driver.findElement(By.partialLinkText("Our Offices"))).perform();
		act1.moveToElement(driver.findElement(By.partialLinkText("Chennai"))).click().perform();
	}

}