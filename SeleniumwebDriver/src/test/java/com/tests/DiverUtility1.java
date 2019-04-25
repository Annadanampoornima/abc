package com.tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DiverUtility1 {
static public WebDriver getDriver(String browser){
if(browser.equals("chrome")) {
System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\annadanam.poornima\\Downloads\\chromedriver_win32\\chromedriver.exe");
return new ChromeDriver();
}
else if(browser.equals("ie")) {
	System.setProperty("webdriver.ie.driver", "\\C:\\Users\\annadanam.poornima\\Downloads\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
	return new InternetExplorerDriver();
}
else
{
	return null;
}
}
}