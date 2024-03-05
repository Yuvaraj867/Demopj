package com.Selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pageobjectmodel.Loginpage;

public class AmazonOrder {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS)	;	
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		//Thread.sleep(3000);
		
//WebDriverWait wait = new WebDriverWait(driver, null);

		WebElement ad = driver.findElement(By.id("twotabsearchtextbox"));
		ad.sendKeys("redmi 13" + Keys.ENTER);
		driver.findElement(By.xpath("//li[@id='p_90/20912642031']")).click();
		driver.findElement(By.xpath("//span[text()='₹10,000 - ₹20,000']")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='256 GB']//preceding::div[1]")).click();
//WebElement aq=driver.findElement(By.xpath("//span[text()='AMOLED']//preceding::div[1]"));
//aq.click();
		String ss = driver.getWindowHandle();
		System.out.println("get" + ss);
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Redmi Note 13 5G (Stealth Black, 8GB RAM, 256GB Storage) | MTK Dimensity 6080 5G | 7.6mm, Slimmest Note Ever']//preceding::a[1]")).click();
		//Thread.sleep(3000);

		Set<String> dw = driver.getWindowHandles();
		System.out.println("print" + dw);
		for (String ed : dw) {
			driver.switchTo().window(ed);
		}
		//Thread.sleep(3000);

		//driver.findElement(By.xpath("//i[@class='a-icon a-accordion-radio a-icon-radio-active']")).click();
		//driver.findElement(By.xpath("//input[@id='mbb-offeringID-1']//following::i[1]")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
		//Thread.sleep(3000);


	WebElement a23 = driver.findElement(By.xpath("//input[@id='buy-now-button']//preceding::div[4]"));
	
	//  Actions actions1 = new Actions(driver); actions1.moveToElement(element);
	//  actions1.perform();
	 
		
	js.executeScript("window.scrollBy(0,450)", "");	
	//Thread.sleep(3000);
	 a23.click();
        


	}

}
