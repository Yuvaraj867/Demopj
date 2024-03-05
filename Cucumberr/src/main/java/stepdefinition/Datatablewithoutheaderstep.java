package stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Datatablewithoutheaderstep {
	WebDriver driver;
	@Given("To enter the login page")
	public void to_enter_the_login_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yuvaraj.murugesan\\Pictures\\Saved Pictures\\chromedriver-win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       driver.manage().window().maximize();
       Thread.sleep(3000);
		
	}

	
	
		@When("To type the")
		public void to_type_the(io.cucumber.datatable.DataTable dataTable) {
			 try {
			        List<String> param = dataTable.asList(String.class);
			        if (param.size() < 2) {
			            throw new IllegalArgumentException("DataTable should contain at least two values (user and password).");
			        }
			        
			        String user = param.get(0);
			        String password = param.get(1);

			        WebElement dew = driver.findElement(By.xpath("//input[@placeholder='Username']"));
			        dew.sendKeys(user);
			        WebElement swe = driver.findElement(By.xpath("//input[@placeholder='Password']"));
			        swe.sendKeys(password);
			    } catch (Exception e) {
			        // Handle any exceptions here
			        e.printStackTrace();
			    }
	}
	@When("To open  the login")
	public void to_open_the_login() {
		driver.findElement(By.xpath("//span[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input']//following::span[1]")).click();		

	}



}
