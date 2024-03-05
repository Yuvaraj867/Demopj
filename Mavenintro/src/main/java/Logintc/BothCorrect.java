package Logintc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BothCorrect{
	@Test
	@Parameters({"Username","Password"})

	public void BothCRT(String USname,String PWD) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yuvaraj.murugesan\\Pictures\\Saved Pictures\\chromedriver-win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement swrt = driver.findElement(By.xpath("//input[@name='username']"));
		swrt.sendKeys(USname);
		WebElement deq = driver.findElement(By.xpath("password"));
		deq.sendKeys(PWD);
		driver.findElement(By.xpath("//button[@type='submit']")).click();


}}
