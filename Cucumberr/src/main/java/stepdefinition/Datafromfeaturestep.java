package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Datafromfeaturestep {
	WebDriver driver;
	@Given("To open the login page")
	public void to_open_the_login_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yuvaraj.murugesan\\Pictures\\Saved Pictures\\chromedriver-win32\\chromedriver.exe");

		 driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(3000);
	}
	@When("the user type the  {string} and {string}")
	public void the_user_type_the_and(String string, String string2) {
		WebElement dew = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		dew.sendKeys(string);
		WebElement swe = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		swe.sendKeys(string2);
	}
	@When("To select  the login")
	public void to_select_the_login() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}


}
