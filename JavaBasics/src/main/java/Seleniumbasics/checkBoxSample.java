package Seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBoxSample {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		
	driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
	WebElement id = driver.findElement(By.xpath("//li[@data-item-value='Miami']"));
	id.click();
	

	

	}

}
