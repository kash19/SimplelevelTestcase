package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomsecond {
private WebDriver driver; 
	
	public Pomsecond(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="form-login_submitAuth")
	private WebElement loginBtn; 
	
	@FindBy(linkText="Course catalog")
	private WebElement coursecatalog;
	
	@FindBy(xpath="//input[@name='search_term']")
	private WebElement SearchBox;
	
	@FindBy(xpath="//div//button[@class='btn btn-default']")
	private WebElement Searchbtn;
	
	@FindBy(xpath="//div//a[@title='Subscribe']")
	private WebElement regbtn;
	
	
	

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
	
	public void coursecatalog() {
		this.coursecatalog.click();
	}
	public void SearchBox(String Course) {
		this.SearchBox.sendKeys(Course);
	}
 public void Searchbtn()
 {
	 this.Searchbtn.click();
 }
 
 public void regbtn()
 {
	 this.regbtn.click();
 }
}
