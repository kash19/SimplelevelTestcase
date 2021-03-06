package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.pomFifthTest;
import com.training.pom.pomForth15;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class fifthTestcase {

	private WebDriver driver;
	private String baseUrl;
	
	private pomFifthTest fifthTestcase;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeTest
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		fifthTestcase = new pomFifthTest(driver);
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
	
	@AfterTest
	public void tearDown() throws Exception {
	Thread.sleep(1000);
		driver.quit();
	}
	@Test(priority=0)
	public void validLoginTest() throws InterruptedException {
		Thread.sleep(1000);
		fifthTestcase.sendUserName("admin");
		fifthTestcase.sendPassword("admin@123");
		fifthTestcase.clickLoginBtn();
}
@Test(priority=1)
public void addCourse() throws InterruptedException {
fifthTestcase.clickAdministration();
fifthTestcase.clickClasses();
fifthTestcase.clickAddclass();
fifthTestcase.sendnameTxt("IBMkash");
fifthTestcase.sendDesctxt("for automation we are using");
Thread.sleep(1000);
fifthTestcase.clickdrpdwn();
fifthTestcase.clickAddBtn();
}
}
