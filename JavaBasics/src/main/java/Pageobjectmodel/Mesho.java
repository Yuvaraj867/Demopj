package Pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mesho {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		  driver.get("https://www.meesho.com/");
		  driver.manage().window().maximize();
		  
		  driver.findElement(By.xpath("//span[text()='Men']")).click();
		  
		  
	}

}
