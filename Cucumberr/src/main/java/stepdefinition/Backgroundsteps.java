package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Backgroundsteps {
	@Given("To go bank")
	public void to_go_bank() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("To go bank");
	}

	@Given("To take money")
	public void to_take_money() {
	    System.out.println("to take money");
	}

	@Given("To enter into the shop")
	public void to_enter_into_the_shop() {
	   System.out.println("To enter into the shop");
	}

	@When("To select the van")
	public void to_select_the_van() {
	  System.out.println("To select the van");
	}

	@Then("To buy at minimum price")
	public void to_buy_at_minimum_price() {
	   System.out.println("To buy at minimum price");
	}

	@Given("To enter into the place")
	public void to_enter_into_the_place() {
	   System.out.println("To enter into the place");
	}

	@When("To select the car")
	public void to_select_the_car() {
	   System.out.println("To select the car");
	}

	@Then("To buy at average price")
	public void to_buy_at_average_price() {
	    System.out.println("To buy at average price");
	}




}
