package com.lao.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {

	public static void main(String[] args) {
		//open browser
		WebDriver driver = new ChromeDriver();
		//go to URl
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        
        //enter username
        WebElement dew = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		dew.sendKeys("Admin");
		//enter password
		WebElement swe = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		swe.sendKeys("admin123");
		
		//Click login button
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
