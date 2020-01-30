package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomnew {

private WebDriver driver; 
	
	public Pomnew(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="form-login_submitAuth")
	private WebElement loginBtn; 
	
	
	@FindBy(xpath="//a[contains(text(),'Homepage')]")
	 private WebElement homepage;
	
	@FindBy(linkText="Edit profile")
private WebElement editprofile;
	
	@FindBy(xpath="//input[@id='profile_password0']")
	private WebElement Epass;
	
	@FindBy(xpath="//input[@id='password1']")
	private WebElement newpass;
	
	@FindBy(xpath="//input[@id='profile_password2']")
	private WebElement confpass;
	
	@FindBy(id="profile_apply_change")
	private WebElement savesetting;
	
	
	
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}

	public void sendHomepage() {
		this.homepage.click();
	}

	public void sendeditprofile() {
		this.editprofile.click();
	}
	public void sendEpass(String Epass) {
		this.Epass.sendKeys(Epass);
	}
	public void sendnewpass(String newpassword)
	{
		this.newpass.sendKeys(newpassword);
	}
	public void sendconfpass(String confpass) {
		
		this.confpass.sendKeys(confpass);
	}
	
	public void sendsavesetting() {
		this.savesetting.click();
	}

	 
	}


