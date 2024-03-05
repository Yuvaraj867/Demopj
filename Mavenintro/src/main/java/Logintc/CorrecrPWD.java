package Logintc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CorrecrPWD {
	@Test
	@Parameters({"Username","Password"})

	public void Crctpwd(String USname,String PWD) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yuvaraj.murugesan\\Pictures\\Saved Pictures\\chromedriver-win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement aq = driver.findElement(By.name("username"));
		aq.sendKeys(USname);
		WebElement qq = driver.findElement(By.name("password"));
		qq.sendKeys(PWD);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		
		
		
	}

}
