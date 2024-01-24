package com.qa.BasePage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.qa.utils.UtilityPage;
import com.qa.utils.WebEventListener;

public class BasePageTest {
	public static WebDriver driver;
	public static Properties prop;
	public  static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;

	public BasePageTest(){
		
		
	   // protected static Logger Logger  = LogManager.getLogger(BasePageTest.class);


///////-----Config.propperties-----///////
		try {
		    prop = new Properties();
		    FileInputStream ip = new FileInputStream("C:\\Users\\info\\eclipse-workspace\\POM3\\src\\main\\resources\\config.properties");
		    prop.load(ip);
		} catch (FileNotFoundException e) {
		    e.printStackTrace();
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}

//////----WebDriver Initialize-----////
	public static void initialization(){
		String browsername= prop.getProperty("browser");

		if(browsername.equals("chrome")) {
			System.setProperty("weddriver.chrome.driver","chromedriver.exe");
			driver = new ChromeDriver();

		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(UtilityPage.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(UtilityPage.IMPLICIT_WAIT, TimeUnit.SECONDS);

		
		/*else if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver", "/Users/naveenkhunteta/Documents/SeleniumServer/geckodriver");	
			driver = new FirefoxDriver(); 
		}
		 */
		
		
///////----Listener-----//////////		
		
		e_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListerHandler to register it with EventFiringWebDriver
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;

		
		driver.get(prop.getProperty("url"));

	}









}

