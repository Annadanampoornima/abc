package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Login {
	WebDriver driver;
	@BeforeClass
	public void beforeClass() {
		
	}
	@AfterClass
	public void AfterClass() {
		driver.close();
	}
	@Test(dataProvider="dp1")
	public void Testlogin(String username,String password) {
	System.setProperty("webdriver.ie.driver","\\C:\\Users\\annadanam.poornima\\Downloads\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");	
	WebDriver driver=new InternetExplorerDriver();
	driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	driver.manage().window().maximize();
	driver.findElement(By.id("userName")).sendKeys(username);
	driver.findElement(By.id("password")).sendKeys(password);
	driver.findElement(By.name("Login")).click();
	WebDriverWait wait=new WebDriverWait(driver,1);
	wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("SignOut")));
	Assert.assertTrue(driver.getTitle().contains("Home"));
	driver.findElement(By.partialLinkText("SignOut")).click();
	}
	@DataProvider(name="dp1")
	public Object[][] getData(){
		Object[][] obj= {
				{"Lalitha","Password123"},{"admin","Password456"}
		};
		return ReadDataExcel.testReadDataExcel("Sheet1");
		
			//return obj;	
		}
	}


