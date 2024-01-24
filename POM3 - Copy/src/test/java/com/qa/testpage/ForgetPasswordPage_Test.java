package com.qa.testpage;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.BasePage.BasePageTest;
import com.qa.pages.ForgetPasswordPage;
import com.qa.pages.LoginPage;

public class ForgetPasswordPage_Test extends BasePageTest {

	LoginPage loginpage ;
	ForgetPasswordPage forgetpasslink;


	public ForgetPasswordPage_Test() {
		super();
	}


	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		loginpage = new LoginPage();
		forgetpasslink = new  ForgetPasswordPage();

	}

	@Test
	public void validate_ForgetPassLink() {
		forgetpasslink.clickForgetPasswordLink();
	}

	@AfterMethod
	public void teardown() {
		
		driver.quit();
	}
}
