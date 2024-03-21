package com.stepdefinitions;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;

import com.lao.pageobjects.DirectoryPage;
import com.lao.pageobjects.Homepage;
import com.lao.pageobjects.Login_page;

import Constants.Constatine;
import Utiliss.CommonUtilis;
import WEBDRIVER_Manager.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CEOnamestepdefinitions {
	static Logger logger =Logger.getLogger(Common_Step_definition.class);
	
	@Given("the user successfully logged in to the application")
	public void the_user_successfully_logged_in_to_the_application() throws InterruptedException {
		
		PropertyConfigurator.configure("File2.properties");
		try {
		
		
	    
	    logger.info("successfully logged in to the page ");}
	    catch(Exception e) {
	    	logger.error(e);
	    	CommonUtilis.getCommonutilisinstance().takescreenshot();
	    }
	    
	}

	@And("the user clicks on the directory sub menu")
	public void the_user_clicks_on_the_directory_sub_menu()  {
		
		PropertyConfigurator.configure("File2.properties");
		
		try {
		Homepage.getInst().enterdirectory();
	    logger.info("Click on the directory menu ");
	}catch(Exception e) {
		logger.error(e);
		CommonUtilis.getCommonutilisinstance().takescreenshot();
		Assert.fail(e.getMessage());
	}}

	@When("the user select the job title as {string} using {string}")
	public void the_user_select_the_job_title_as_using(String Jobtitle, String howTo) throws InterruptedException {
		

		try {
		DirectoryPage.getInstance().clickjobtitle();
		//DirectoryPage.getInstance().getSelectJob().click();
	    System.out.println("the user select the job title as CEO");}
		catch(Exception e) {
			logger.error(e);
			CommonUtilis.getCommonutilisinstance().takescreenshot();
		}
			
		}

	@When("the user clicks on the search button.")
	public void the_user_clicks_on_the_search_button() {
		try {
		
		DirectoryPage.getInstance().clicksearch();
		System.out.println("the user clicks on the search button.");
	    	}
		catch(Exception e) {
			logger.error(e);
			CommonUtilis.getCommonutilisinstance().takescreenshot();
			
		}}

	@Then("the user can view the record found")
	public void the_user_can_view_the_record_found() {
	    System.out.println("the user can view the record found");
	}




}
