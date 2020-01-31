package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class pomFifthTest {
private WebDriver driver; 
	
	public pomFifthTest(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="form-login_submitAuth")
	private WebElement loginBtn; 
	 
	@FindBy(xpath="//a[contains(text(),'Administration')]")
	private WebElement administration;
	
	@FindBy(xpath="//div[@class='alert alert-info']//span[contains(text(),'×')]")
	private WebElement cross;
	
	@FindBy(xpath="//a[contains(text(),'Classes')]")
	private WebElement classes;
	
	@FindBy(xpath="//div[@class='actions']//a[2]//img[1]")
	private WebElement addclass;
	
	@FindBy(id="usergroup_name")
	private WebElement classnametxt;
	
	@FindBy(id="usergroup_description")
	private WebElement descriptiontxt;
	
	@FindBy(xpath="//div[@class='filter-option-inner-inner']")
	private WebElement groupdrpdown;
	
	@FindBy(id="usergroup_submit")
	private WebElement addbtn;
	
	@FindBy(xpath="//form[@id='usergroup']//li[1]//a[1]")
	private WebElement open;
	
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
	public void clickAdministration() {
		this.administration.click();
	}
	public void clickCross() {
		this.cross.click();
	}
	public void clickClasses() {
		this.classes.click();
	}
	
	public void clickAddclass() {
		this.addclass.click();
	}
	public void sendnameTxt(String classname) {
		this.classnametxt.sendKeys(classname);
	}
	
	public void sendDesctxt(String Description) {
		this.descriptiontxt.sendKeys(Description);
	}
	
	public void clickdrpdwn() throws InterruptedException {
		this.groupdrpdown.click();
 Actions act = new Actions(driver);
 act.moveToElement(groupdrpdown).moveToElement(open).click().build().perform();
	
	}
 public void clickAddBtn() {
	 this.addbtn.click();
 }
}
