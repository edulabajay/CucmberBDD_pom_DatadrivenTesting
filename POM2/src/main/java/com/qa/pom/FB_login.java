package com.qa.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FB_login {

	WebDriver driver;
	
	public FB_login(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//input[@id='email']") public WebElement user_id;
	@FindBy(xpath = "//input[@id='pass']") public WebElement password;
	@FindBy(xpath = "//button") public WebElement login_btn;
 


	public void login_details() {
		
		user_id.sendKeys("8390391858");
		password.sendKeys("7898888888");
		login_btn.click();
	}

}
