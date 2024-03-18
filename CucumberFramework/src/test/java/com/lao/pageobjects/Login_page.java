package com.lao.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_page {
	
	
	@FindBy(xpath="//input[@placeholder='Username']")
	public static WebElement Username;
	
	
	@FindBy(xpath="//input[@placeholder='Password']")
	public static WebElement Password;
	
	@FindBy(xpath="//button[@type='submit']")
	public static WebElement Submit;

}
