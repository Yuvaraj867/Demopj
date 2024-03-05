package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Opengoogledefinition {
	WebDriver driver;
	@Given("User in entering the google")
	public void user_in_entering_the_google() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yuvaraj.murugesan\\Pictures\\Saved Pictures\\chromedriver-win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
         driver.manage().window().maximize();
         Thread.sleep(3000);
	}
	@When("user is searching the term {string}")
	public void user_is_searching_the_term(String string) {
		WebElement dew = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		dew.sendKeys("Admin");


	}
	@When("Clicks the save button")
	public void clicks_the_save_button() {
		WebElement swe = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		swe.sendKeys("admin123");
		
	}
	@Then("user should see the search results")
	public void user_should_see_the_search_results() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}




}
