package com.lao.actionKeywords;

import org.apache.bcel.generic.SWITCH;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.lao.Executioncore.Engine;
import com.lao.Utilities.ExcelUtilities;

public class ActionKeywords {
	static WebDriver driver;
	
	public static void openbrowser() throws InterruptedException {
		
	
switch (ExcelUtilities.DataColumnValue) {
case "chrome":
	driver = new ChromeDriver();
	break;
case "firefox":
	driver = new FirefoxDriver();
	break;
	
	default:
		driver = new ChromeDriver();
	
}}
	
	public static void goTOURL() throws InterruptedException {
		 driver.get(ExcelUtilities.DataColumnValue);
	        driver.manage().window().maximize();
	        Thread.sleep(3000);
	}
	
	public static void enterUserName() {
		WebElement userName = driver.findElement(Engine.Locator);
		userName.sendKeys(ExcelUtilities.DataColumnValue);
	}
	
	public static void enterPassword() {
		WebElement passWord = driver.findElement(Engine.Locator);
		passWord.sendKeys(ExcelUtilities.DataColumnValue);
	}
	public static void clickloginbutton() {
		driver.findElement(Engine.Locator);
	}
	
	public static void clickDirectory() throws InterruptedException  {
		Thread.sleep(3000);
		driver.findElement(Engine.Locator);
	}
	
	public static void selectQALead() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(Engine.Locator);
		Thread.sleep(3000);
		driver.findElement(Engine.Locator);
		
	}
	
	public static void clickSearch() {
		driver.findElement(Engine.Locator);
		
	}

}
