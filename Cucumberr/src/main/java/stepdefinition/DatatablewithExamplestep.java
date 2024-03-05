package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DatatablewithExamplestep {
	WebDriver driver;
	@Given("proceed to login page")
	public void proceed_to_login_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yuvaraj.murugesan\\Pictures\\Saved Pictures\\chromedriver-win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
     driver.manage().window().maximize();
     Thread.sleep(3000);	
		
	}
	@When("user enters {string} {string}")
	public void user_enters(String string, String string2) {
		 WebElement dew = driver.findElement(By.xpath("//input[@placeholder='Username']"));
	      dew.sendKeys(string);
	      WebElement swe = driver.findElement(By.xpath("//input[@placeholder='Password']"));
	      swe.sendKeys(string2);
	}
	@When("click the final button")
	public void click_the_final_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}



}
