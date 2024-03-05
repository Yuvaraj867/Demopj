package stepdefinition;

import io.cucumber.java.en.When;

public class ExpressionStep {
	@When("I have {int} laptop")
	public void i_have_laptop(Integer int1) {
	    System.out.println("re " +int1);
	  
	}
	@When("I have {double} GPA")
	public void i_have_gpa(Double double1) {
	    System.out.println("re1 " +double1);

	   
	}
	@When("{string} is younger than {string} and {string}")
	public void is_younger_than_and(String string, String string2, String string3) {
	    System.out.println("re12 " +string +  " two " +string2 + " three " +string3);
	    
	}



}
