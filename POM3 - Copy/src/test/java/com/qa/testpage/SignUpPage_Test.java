package com.qa.testpage;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.BasePage.BasePageTest;
import com.qa.pages.LoginPage;
import com.qa.pages.SignUpPage;

public class SignUpPage_Test extends BasePageTest {

	LoginPage loginpage ;
	SignUpPage registerpage;



	public SignUpPage_Test() {
		super();
	}


	@BeforeMethod

	public void setUp() throws IOException {
		initialization();
		loginpage = new LoginPage();
		registerpage = new SignUpPage();

	}

	@Test(priority=1)
	public void Validate_SignUpLink() {
		registerpage.clickSignUpLink();
	}




	@AfterMethod
	public void teardown() {
		
		driver.quit();
	}
}
