package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.Pomsecond;
import com.training.pom.pomThird;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class test3case {
	private WebDriver driver;
	private String baseUrl;
	
	private pomThird pomThird;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeMethod
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		pomThird = new pomThird(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
		screenShot = new ScreenShot(driver); 
	}

	/*@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		Pomsecond = new Pomsecond(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}*/
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	
	
	
	@Test(priority=0)
	public void validLoginTest() throws InterruptedException {
		Thread.sleep(1000);
		pomThird.sendUserName("kash");
		pomThird.sendPassword("kash@123");
		pomThird.clickLoginBtn();
	screenShot.captureScreenShot("third");
		
		pomThird.clickcourseList(); Thread.sleep(1000);
		screenShot.captureScreenShot("third");
		pomThird.clickCoursedesc();
		
		
	
	
	
	
}
}


