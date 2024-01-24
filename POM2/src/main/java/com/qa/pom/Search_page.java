package com.qa.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_page {

	WebDriver driver;
	
	//Constructor initialize
	public Search_page(WebDriver driver) {


		PageFactory.initElements(driver, this);/// This PageFactory initialization in Constructor which is declare at Global
	}

	@FindBy(xpath = "//textarea[@id='APjFqb']")
	public WebElement google_search;
    @FindBy(xpath = "//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")
    public WebElement googleseaarch_btn;
    @FindBy(xpath = "//h3[normalize-space()='Facebook - log in or sign up']") 
    public WebElement fb_link;



    public void googleseachmthod(String searchtext) {
    	
    	try {
    		google_search.sendKeys("facebook");
    		googleseaarch_btn.click();
		} catch (Exception e) {
			// TODO: handle exception
		
			System.out.println("Exception catch" + e.getMessage());
		}
    }
    	
    	public void fbsign_in() {
    		
    		try {
    			fb_link.click();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Exception catch" + e.getMessage());
			}
    	}
     
    }
    	
    

