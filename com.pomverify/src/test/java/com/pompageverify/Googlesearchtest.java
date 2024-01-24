package com.pompageverify;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pomverify.Search_page;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Googlesearchtest {

	WebDriver driver;
	
	Search_page pompage;



	@BeforeTest
	public void beforetest() throws Exception {
		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium Driver\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		Thread.sleep(3000);
	    driver.get("https://www.google.com/");
	}
@Test
public void googlesearch() {
	 
	 pompage = new Search_page(driver);
	 pompage.googleseachmthod("facebook");
 }







}
