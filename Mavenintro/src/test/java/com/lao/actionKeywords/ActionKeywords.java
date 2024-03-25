package com.lao.actionKeywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionKeywords {
	WebDriver driver;
	
	public void openbrowser() {
		WebDriver driver = new ChromeDriver();
		
	}
	
	public void goTOURL() {
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	        driver.manage().window().maximize();
	}
	
	public void enterUserName() {
		WebElement userName = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		userName.sendKeys("Admin");
	}
	
	public void enterPassword() {
		WebElement passWord = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		passWord.sendKeys("admin123");
	}
	public void clickloginbutton() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
