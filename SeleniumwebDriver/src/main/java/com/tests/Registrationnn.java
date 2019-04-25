package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Registrationnn {
	@Test
public void TestRegistration() {
		System.setProperty("webdriver.ie.driver","\\C:\\Users\\annadanam.poornima\\Downloads\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
	WebDriver driver= new InternetExplorerDriver();
	driver.get("http://10.232.237.143:443/TestMeApp/RegisterUser.htm");
	driver.manage().window().maximize();
	driver.findElement(By.id("userName")).sendKeys("Pdhanu1");
	driver.findElement(By.id("firstName")).sendKeys("p");
	driver.findElement(By.id("lastName")).sendKeys("dhanu");
	driver.findElement(By.id("password")).sendKeys("Password123");
	driver.findElement(By.id("pass_confirmation")).sendKeys("Password123");
	driver.findElement(By.cssSelector("input[value='Female']")).click();
	driver.findElement(By.id("emailAddress")).sendKeys("abc@gmail.com");
	driver.findElement(By.id("mobileNumber")).sendKeys("9231265920");
	driver.findElement(By.id("dob")).sendKeys("29/12/2019");
	driver.findElement(By.id("address")).sendKeys("rerr123nksdfhkewh");
	Select sc=new Select(driver.findElement(By.id("securityQuestion")));
	sc.selectByValue("411011");
	driver.findElement(By.id("answer")).sendKeys("Pink");
	driver.findElement(By.name("Submit")).click();
	
	}
	
	

}
