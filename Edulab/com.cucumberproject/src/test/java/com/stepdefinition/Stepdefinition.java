package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition  {
WebDriver driver;
@Given("^user should be on Login Page$")
public void user_should_be_on_Login_Page() throws Throwable {
	driver=new ChromeDriver(); 
	System.setProperty("WebDriver.chrome.driver","C:\\chromedriver_win32 (5)\\chromedriver.exe");
	driver.get("https://mu.etranscript.in/app/#/auth/login");
 
}

@When("^user Enter email address and password$")
public void user_Enter_email_address_and_password() throws Throwable {
   

    driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("rrr@gmail.com");
	driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("123456");
}

@Then("^user click on login button$")
public void user_click_on_login_button() throws Throwable {
	driver.findElement(By.xpath("//button")).click();

   
}
}
