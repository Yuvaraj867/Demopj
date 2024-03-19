package com.lao.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_page {
	
	private static Login_page instance;
	
	

	private Login_page() {
		
	}
	public static Login_page getInstance() {
		if(instance==null) {
			instance=new Login_page();
		}
		return instance;
	}
	
	
	@FindBy(xpath="//input[@placeholder='Username']")
	private  WebElement Username;
	
	
	

	

	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement Password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement Submit;
	
//	public WebElement getPassword() {
//		return Password;
//	}
	
	public void enterusername(String username) {
		Username.sendKeys(username);
	}

//	public WebElement getSubmit() {
//		return Submit;
	
	public void enterpassword(String password) {
		Password.sendKeys(password);
	}
		
		
		
//	}
//	public WebElement getUsername() {
//		return Username;
//	}
	
	public void entersubmit() {
		Submit.click();;
	}

}
