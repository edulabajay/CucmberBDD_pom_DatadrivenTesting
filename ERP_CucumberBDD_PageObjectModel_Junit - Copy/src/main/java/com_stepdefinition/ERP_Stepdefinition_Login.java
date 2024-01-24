package com_stepdefinition;





import com_BasePage_ERP.Basepage_erp;
import com_ERP_Pages.ERP_Homepage;
import com_ERP_Pages.ERP_Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class ERP_Stepdefinition_Login extends Basepage_erp {

// When you create an object, memory is allocated for its instance variables 
ERP_Login erp_login = new ERP_Login();
ERP_Homepage erp_homepage;

	
@Given("User should be on the login page")
public void user_should_be_on_the_login_page() {
  Basepage_erp.initialize(); 
}

/*
@When("Title of the login page is Free CRM")
public void title_of_the_login_page_is_free_crm() {
	String loginpagetitle = loginpage.ValidateLoginPageTitle();
	Assert.assertEquals("Cogmento CRM", loginpagetitle);
}
*/


@Then("User enters \\\"(.*)\\\" and \\\"(.*)\\\"$")
public void user_enters_and(String username, String string2) {
 erp_login = new ERP_Login();
 erp_homepage = erp_login.erp_login(prop.getProperty("username"), prop.getProperty("password"));
 
}

@Then("User clicks on the login button")
public void user_clicks_on_the_login_button() {
	
	 
	

	
}

@Then("User clicks on the create contact button")
public void user_clicks_on_the_create_contact_button() {
    
}

@Then("User enters \\\"(.*)\\\", \\\"(.*)\\\", \\\"(.*)\\\", and \\\"(.*)\\\"$")
public void user_enters_and(String string, String string2, String string3, String string4) {
  
}

@Then("User clicks on the save button")
public void user_clicks_on_the_save_button() {
   
}

@Then("close the browser")
public void close_the_browser() {
   
}



}