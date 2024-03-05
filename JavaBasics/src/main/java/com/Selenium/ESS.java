package com.Selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pageobjectmodel.Loginpage;
import Pageobjectmodel.Validatingpage;

public class ESS {
	

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(18000))	;
		driver.get("https://ess.changepond.com/#/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		PageFactory.initElements(driver, Loginpage.class);
		Loginpage.UserId.sendKeys("4190");
		Loginpage.Password.sendKeys("9912");
		Loginpage.Submit.click();
		Thread.sleep(8000);
		Loginpage.ESS1.click();
		Loginpage.ESS2.click();
		Loginpage.ESS3.click();
		Thread.sleep(2000);
		Loginpage.ESS4.click();
		Loginpage.ESS5.click();
		
		
		PageFactory.initElements(driver, Validatingpage.class);
		Validatingpage.ESS6.click();
		//Validatingpage.ESSA.click();
		//Validatingpage.ESSB.click();
		Validatingpage.ESS7.click();
		Validatingpage.ESS8.click();
		Thread.sleep(18000);
		Validatingpage.ESS9.click();
		Validatingpage.ESS10.click();
		Validatingpage.ESS11.click();
		
		
		
		
		
		
		
		
		
		
		//Without using page factory
		
		/*
		 * Loginpage.UserId(driver).sendKeys("4190");
		 * Loginpage.Password(driver).sendKeys("9912");
		 * Loginpage.Submit(driver).click(); Loginpage.ESS1(driver).click();
		 * Loginpage.ESS2(driver).click(); Loginpage.ESS3(driver).click();
		 * 
		 */
		
		
		/*
		 * WebElement UserId =
		 * driver.findElement(By.xpath("//input[@placeholder='User Id']"));
		 * UserId.sendKeys("4190"); WebElement Password =
		 * driver.findElement(By.xpath("//input[@placeholder='Password']"));
		 * Password.sendKeys("9912");
		 * 
		 * WebElement Submit = driver.findElement(By.xpath("//button[@type='submit']"));
		 * Submit.click();
		 */
       // Thread.sleep(8000);
        
		/*
		 * WebElement ESS1= driver.findElement(By.xpath("//a[@role='button']"));
		 * ESS1.click(); WebElement
		 * ESS2=driver.findElement(By.xpath("//a[@routerlink='/shortfallReport']"));
		 * ESS2.click(); Thread.sleep(8000); WebElement ESS3=
		 * driver.findElement(By.xpath("//input[@placeholder='Select Date']"));
		 * ESS3.click();
		 */
		/*
		 * Thread.sleep(2000);
		 * 
		 * WebElement ESS4 = driver.findElement(By.
		 * xpath("//button[@class='headerbtn mydpicon icon-mydpleft headerbtnenabled']")
		 * ); ESS4.click(); WebElement ESS5 =driver.findElement(By.
		 * xpath("//span[@ng-reflect-ng-class='[object Object]'][normalize-space()='12'][1]"
		 * )); ESS5.click();
		 * 
		 * WebElement ESS6 =
		 * driver.findElement(By.xpath("//my-date-picker[@name='ToDate']"));
		 * ESS6.click(); WebElement ESS7 =driver.findElement(By.
		 * xpath("(//span[@ng-reflect-ng-class='[object Object]'][normalize-space()='21'])[1]"
		 * )); ESS7.click();
		 * 
		 * WebElement ESS8=driver.findElement(By.
		 * xpath("//button[@class='btn btn-lg btn-success pull-right']")); ESS8.click();
		 * 
		 * Thread.sleep(18000); WebElement ESS9=driver.findElement(By.
		 * xpath("//button[@class='dialog__close-btn ng-tns-c13-10']")); ESS9.click();
		 * WebElement ESS10=driver.findElement(By.
		 * xpath("//a[@class='btn btn-sm btn-primary pull-right']")); ESS10.click();
		 * WebElement ESS11=driver.findElement(By.xpath("//button[@class='signout']"));
		 * ESS11.click();
		 */
	}

}
