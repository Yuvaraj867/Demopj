package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HRMSTEPS {
       WebDriver driver;
	   @Given("the user is on the login page")
		public void the_user_is_on_the_login_page() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\yuvaraj.murugesan\\Pictures\\Saved Pictures\\chromedriver-win32\\chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	         driver.manage().window().maximize();
	         Thread.sleep(3000);
		}
		@When("the user enter the valid user name and password")
		public void the_user_enter_the_valid_user_name_and_password() {
			WebElement dew = driver.findElement(By.xpath("//input[@placeholder='Username']"));
			dew.sendKeys("Admin");
			WebElement swe = driver.findElement(By.xpath("//input[@placeholder='Password']"));
			swe.sendKeys("admin123");

		}
		@When("the user click on the login button")
		public void the_user_click_on_the_login_button() throws InterruptedException {
			driver.findElement(By.xpath("//button[@type='submit']")).click();
            Thread.sleep(3000);
		}
		@Then("the user click on the My info sub menu")
		public void the_user_click_on_the_my_info_sub_menu() throws InterruptedException {
			driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("My Info" +Keys.ENTER);
		  driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewMyDetails']")).click();
		  Thread.sleep(3000);
		}
		@When("the user enters the first name")
		public void the_user_enters_the_first_name() {
		   driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Yuvi");
		}
		
		@When("the user clicks the gender radio button")
		public void the_user_clicks_the_gender_radio_button() {
driver.findElement(By.xpath("//span[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input']//following::span[1]")).click();		




		}

		@When("the user clicks on the save button")
		public void the_user_clicks_on_the_save_button() {
		    driver.findElement(By.xpath("//button[@type='submit'][1]")).click();
		}



	}


