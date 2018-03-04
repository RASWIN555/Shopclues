package com.ecomm.shopclues.genlibraries;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.relevantcodes.extentreports.ExtentReports;

public class BaseClass { 
	
	public static WebDriver driv;
	ExtentReports ext;
	
	@BeforeSuite
	public void initiateExtentrepConfig() {
		ext=new ExtentReports("C:\\Users\\ASHISH\\eclipse-workspaceTY\\mvn_shopclues_automation_proj\\test-output\\ExtentReport.html");	
		ext.loadConfig(new File("C:\\Users\\ASHISH\\eclipse-workspaceTY\\mvn_shopclues_automation_proj\\extent-config.xml"));
	}
	
	@Parameters("Browser")
	@BeforeClass
	public void beforeClassConfig(String browserNm) {
		if(browserNm.equals("FireFox"))
			driv=new FirefoxDriver();
		else if(browserNm.equals("Chrome"))
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASHISH\\eclipse-workspaceTY\\mvn_shopclues_automation_proj\\src\\main\\resources\\chromedriver");
			driv=new ChromeDriver();
	}
	
	@AfterClass
	public void afterClassConfig() {
		driv.close();
	}
	@AfterSuite
	public void closeExtentrep() {
		ext.flush();
		ext.close();
	}
	
	
}
