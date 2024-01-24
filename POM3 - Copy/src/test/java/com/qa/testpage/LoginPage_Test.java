package com.qa.testpage;

import org.testng.annotations.Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.qa.BasePage.BasePageTest;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class LoginPage_Test extends BasePageTest {

	LoginPage loginpage ;
	HomePage homepage;
	
	
	public LoginPage_Test() {
		super();
	}


    @BeforeMethod
	public void setUp() throws IOException {
		 initialization();
		 loginpage = new LoginPage();
		
	}

    @Test(priority=1)
	public void loginPageTitleTest(){
		String title = loginpage.validateLoginPageTitle();
		Assert.assertEquals(title, "Cogmento CRM");
	}
    

	@Test(priority=2)
	public void loginpage_Test(){
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	




	@AfterMethod
	public void teardown() {
		
		driver.quit();
	}







}
