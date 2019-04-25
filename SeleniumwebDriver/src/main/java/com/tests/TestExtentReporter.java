package com.tests;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class TestExtentReporter {
	WebDriver driver;
	ExtentHtmlReporter htmlreporter;
	ExtentReports reports;
	ExtentTest logger;
@BeforeClass
public void beforeClass()
{
SimpleDateFormate sdf=new SimpleDataFormat("yyyy-mm-dd-hh-mm-ss-ms");
String path=System.
	}
@Test
public void Passtest() {
	
}
@Test
public void Failtest() {
	
}
@Test
public void Skiptest() {
	
}
@AfterMethod
public void aftermethod(ITestResult result) {
	
}

@AfterClass
public void afterClass() {
	
}

}
