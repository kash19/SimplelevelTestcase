package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.Pomsecond;
import com.training.pom.pomForth15;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class testforth15 {
	private WebDriver driver;
	private String baseUrl;
	
	private pomForth15 testforth15;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeMethod
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		testforth15 = new pomForth15(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
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
		testforth15.sendUserName("kash");
		testforth15.sendPassword("kash@123");
		testforth15.clickLoginBtn();
	//	screenShot.captureScreenShot("First");
		 //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//pomForth15.clickdroptn();
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
		 testforth15.clickdroptn();
		 Thread.sleep(1000);
		   testforth15.clickLogoutBtn();
		
	
	
}
}


