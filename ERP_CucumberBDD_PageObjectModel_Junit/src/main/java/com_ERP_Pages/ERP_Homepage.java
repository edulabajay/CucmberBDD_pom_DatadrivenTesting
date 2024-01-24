package com_ERP_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com_BasePage_ERP.Basepage_erp;

public class ERP_Homepage extends Basepage_erp {

	//1.Page 	Factory or Object Repo

	@FindBy(xpath="//span[normalize-space()='Contacts']")
	WebElement erp_contacts_link;

	@FindBy(xpath="//div[3]//button[1]//i[1]")
	WebElement erp_create_contact_btn;
	
	

	//2.driver and this for current class reference
	public ERP_Homepage() {
		
		PageFactory.initElements(driver, this);

		//"driver" here driver is use for initialize browser for all WebElement that we initialize above with @FindBy
		//"this"   here this is for refer/pointing  to current class object
	}
	
	//3.Action

	public ERP_ContactPage erp_validatecontact_link() {
		
		erp_contacts_link.click();
		
		return new ERP_ContactPage();
	}

	public ERP_ContactPage erp_validatenewcontact_butn() {
		
		Actions action = new Actions(driver);
		action.moveToElement(erp_contacts_link).build().perform();
		erp_create_contact_btn.click();
		
		return new ERP_ContactPage();
		

	}
	
	
}