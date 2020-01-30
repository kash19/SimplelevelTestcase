package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomForth15 {

	
		private WebDriver driver; 
		
		public pomForth15(WebDriver driver) {
			this.driver = driver; 
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(id="login")
		private WebElement userName; 
		
		@FindBy(id="password")
		private WebElement password;
		
		@FindBy(id="form-login_submitAuth")
		private WebElement loginBtn; 
		
		@FindBy(xpath="//span[@class='caret']")
		private WebElement dropbtn;
		
		@FindBy(id="logout_button")
		private WebElement logoutbtn;
		
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
		public void clickdroptn()
		{
			this.dropbtn.click();
		}
		
		public void clickLogoutBtn() {
			this.logoutbtn.click();
		}

}
