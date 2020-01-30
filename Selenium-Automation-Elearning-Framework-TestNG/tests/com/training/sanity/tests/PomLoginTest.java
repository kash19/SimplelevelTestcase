package com.training.sanity.tests;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;

import com.training.pom.Pomnew;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class PomLoginTest {
	private WebDriver driver;
	private String baseUrl;

	private Pomnew Pomnew;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeTest
	public  void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		Pomnew = new Pomnew(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}

	/*	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		Pomnew = new Pomnew(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}*/

	@AfterTest
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test(priority=0)
	public void validLoginTest() throws InterruptedException {
		Thread.sleep(1000);
		Pomnew.sendUserName("kash");
		Pomnew.sendPassword("kash@123");
		Pomnew.clickLoginBtn();
		screenShot.captureScreenShot("FirstTestcase");
	}

	@Test(priority=1)
	public void admin() throws InterruptedException
	{
		Thread.sleep(1000);

		Pomnew.sendHomepage();
		//screenShot.captureScreenShot("FirstTestcase");
		Pomnew.sendeditprofile();
		Thread.sleep(1000);
		Pomnew.sendEpass("kash@123");
		Pomnew.sendnewpass("kash@123");
		Pomnew.sendconfpass("kash@123");
		Thread.sleep(1000);
		screenShot.captureScreenShot("FirstTestcase");
		Pomnew.sendsavesetting();
		String expectedText="Your new profile has been saved";
		String actualText = driver.findElement(By.xpath("//div[@class='alert alert-info']")).getText();
		assertEquals(actualText,expectedText);

	}
}



