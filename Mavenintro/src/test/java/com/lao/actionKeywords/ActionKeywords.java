package com.lao.actionKeywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionKeywords {
	static WebDriver driver;
	
	public static void openbrowser() throws InterruptedException {
		 driver = new ChromeDriver();
		
	}
	
	public static void goTOURL() throws InterruptedException {
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	        driver.manage().window().maximize();
	        Thread.sleep(3000);
	}
	
	public static void enterUserName() {
		WebElement userName = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		userName.sendKeys("Admin");
	}
	
	public static void enterPassword() {
		WebElement passWord = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		passWord.sendKeys("admin123");
	}
	public static void clickloginbutton() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	public static void clickDirectory() throws InterruptedException  {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text() = 'Directory']")).click();
	}
	
	public static void selectQALead() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Job Title']//following::div")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Automation Tester']")).click();
		
	}
	
	public static void clickSearch() {
		driver.findElement(By.xpath("//button[text()=' Search ']")).click();
		
	}

}
