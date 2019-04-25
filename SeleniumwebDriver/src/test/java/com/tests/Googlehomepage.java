package com.tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Googlehomepage {
	@Test
	public void testgooglehomepage() {
		System.setProperty("webdriver.ie.driver","\\C:\\Users\\annadanam.poornima\\Downloads\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
	WebDriver driver=Diversity.getDriver("chrome");
	driver.manage().window().maximize();
	driver.get("https://www.Amazon.com");
	driver.close();
	}
	

}
