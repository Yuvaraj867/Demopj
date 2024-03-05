package stepdefinition;

import io.cucumber.java.en.When;

public class Hookexstep {
	@When("to climb first")
public void to_climb_first() {
System.out.println("got one");
}
@When("to climb second")
public void to_climb_second() {
System.out.println("got two");
}
@When("to climb third")
public void to_climb_third() {
    System.out.println("got three");}




}
