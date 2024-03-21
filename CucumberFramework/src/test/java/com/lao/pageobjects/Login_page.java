package com.lao.pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utiliss.CommonUtilis;
import WEBDRIVER_Manager.DriverManager;

public class Login_page {
	
	private static Login_page instance;
	
	WebDriver driver = DriverManager.getDriver();

	private Login_page() {
		
	}
	public static Login_page getInstance() {
		if(instance==null) {
			instance=new Login_page();
		}
		return instance;
	}
	
	
//	@FindBy(xpath="//input[@placeholder='Username']")
//	private  WebElement Username;
	
	By Username = By.xpath("//input[@placeholder='Username']");
	
	

	

//	@FindBy(xpath="//input[@placeholder='Password']")
//	private WebElement Password;
	
	By Password = By.xpath("//input[@placeholder='Password']");
	
	
	
	
//	@FindBy(xpath="//button[@type='submit']")
//	private WebElement Submit;
	
	By Submit = By.xpath("//button[@type='submit']");
	
//	public WebElement getPassword() {
//		return Password;
//	}
	
	public void enterusername(String username) {
		try {
		CommonUtilis.getCommonutilisinstance().hihlightelement(driver.findElement(Username));
		driver.findElement(Username).sendKeys(username);
		}catch(Exception e) {
		System.out.println("Not finding let use explicit wait");
		try {
			
			
		WebDriverWait waitfor = new WebDriverWait(driver, null);
		waitfor.until(ExpectedConditions.visibilityOfElementLocated(Username));
			
		} catch (Exception e2) {
			System.out.println("should be waited ");
		}
	}}

//	public WebElement getSubmit() {
//		return Submit;
	
	public void enterpassword(String password) {
		CommonUtilis.getCommonutilisinstance().hihlightelement(driver.findElement(Password));
		driver.findElement(Password).sendKeys(password);
	}
		
		
		
//	}
//	public WebElement getUsername() {
//		return Username;
//	}
	
	public void entersubmit() {
		CommonUtilis.getCommonutilisinstance().hihlightelement(driver.findElement(Submit));
		driver.findElement(Submit).click();
	}

}
