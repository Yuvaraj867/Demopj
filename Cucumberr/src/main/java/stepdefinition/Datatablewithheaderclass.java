package stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Datatablewithheaderclass {
	WebDriver driver;
	@Given("To write  the login page")
	public void to_write_the_login_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yuvaraj.murugesan\\Pictures\\Saved Pictures\\chromedriver-win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
      driver.manage().window().maximize();
      Thread.sleep(3000);
	}
	@When("the user type the")
	public void the_user_type_the(io.cucumber.datatable.DataTable dataTable) {
	List<Map<String,String> > result = dataTable.asMaps(String.class,String.class);
	 String Username = result.get(0).get("Username");
	 String password = result.get(0).get("Password");
	  WebElement dew = driver.findElement(By.xpath("//input[@placeholder='Username']"));
      dew.sendKeys(Username);
      WebElement swe = driver.findElement(By.xpath("//input[@placeholder='Password']"));
      swe.sendKeys(password);
	}
	@When("To write  the login")
	public void to_write_the_login() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();


}}
