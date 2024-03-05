package Logintc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CRTUSR {
	@Test 
	@Parameters({"Username","Password"})
	public void Crctuser(String USname,String PWD) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yuvaraj.murugesan\\Pictures\\Saved Pictures\\chromedriver-win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement sw = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		sw.sendKeys(USname);
		WebElement de = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		de.sendKeys(PWD);
		driver.findElement(By.xpath("//button[@type='submit']")).click();


}
}