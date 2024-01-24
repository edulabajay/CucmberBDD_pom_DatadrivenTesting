package com_pom_para;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import com_qa_UtilityPage.TestUtils;

public class BasePage_pom_para {

	public static WebDriver driver;
	public static Properties prop;

	

	
	//Super class Constructor
	public BasePage_pom_para() {

		try {

			prop = new Properties();
			FileInputStream ip=new FileInputStream("C:\\Users\\info\\eclipse-workspace\\CRM_CucmberBDD_Maven_Parameterization_POM\\src\\main\\java\\com_configurefile\\config.properties");
			prop.load(ip);	

		}catch (FileNotFoundException e) {


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	// Initializing / Invoke browser
	public static void initialize() {

		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
		}



		//Waits
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(TestUtils.Page_LOAD_TIMEOUTS, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_WAITS,TimeUnit.SECONDS);


		driver.get(prop.getProperty("url"));
	}
}
