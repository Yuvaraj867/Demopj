package com.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyTimesheetsstepdefinitions {
	@Given("the user successfully login to the application")
	public void the_user_successfully_login_to_the_application() {
	    System.out.println("the user successfully login to the application");
	}

	@When("the user clicks on the time submenu")
	public void the_user_clicks_on_the_time_submenu() {
	    System.out.println("the user clicks on the time submenu");

	}

	@When("the user search the {string}")
	public void the_user_search_the(String string) {
	    System.out.println("the user search the {string}");

	}

	@When("the user clicks on the view button")
	public void the_user_clicks_on_the_view_button() {
	    System.out.println("the user clicks on the view button");

	}

	@Then("the user view the message as {string}")
	public void the_user_view_the_message_as(String string) {
	    System.out.println("the user view the message as {string}");

	}




}
