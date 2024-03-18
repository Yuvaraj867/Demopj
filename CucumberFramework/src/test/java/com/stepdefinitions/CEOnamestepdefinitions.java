package com.stepdefinitions;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.lao.pageobjects.DirectoryPage;
import com.lao.pageobjects.Homepage;
import com.lao.pageobjects.Login_page;

import Constants.Constatine;
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
		
		DriverManager.getDriver().get(Constatine.Appurl);
		
		Thread.sleep(3000);
		Login_page.Username.sendKeys(Constatine.USERNAME);
	    Login_page.Password.sendKeys(Constatine.PASSWORD);
	    Login_page.Submit.click();
	    
	    logger.info("successfully logged in to the page ");
	    
	}

	@And("the user clicks on the directory sub menu")
	public void the_user_clicks_on_the_directory_sub_menu() throws InterruptedException {
		PropertyConfigurator.configure("File2.properties");
		Thread.sleep(3000);
		Homepage.Home.click();
	    logger.info("Click on the directory menu ");
	}

	@When("the user select the job title as {string}")
	public void the_user_select_the_job_title_as(String string) throws InterruptedException {
		Thread.sleep(3000);
		DirectoryPage.Jobtitle.click();
		DirectoryPage.SelectJob.click();
	    System.out.println("the user select the job title as CEO");}

	@When("the user clicks on the search button.")
	public void the_user_clicks_on_the_search_button() {
		
		DirectoryPage.Search.click();
		System.out.println("the user clicks on the search button.");
	    	}

	@Then("the user can view the record found")
	public void the_user_can_view_the_record_found() {
	    System.out.println("the user can view the record found");
	}




}
