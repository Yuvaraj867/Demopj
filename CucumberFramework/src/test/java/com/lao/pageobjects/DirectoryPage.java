package com.lao.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.FindBy;

public class DirectoryPage {
	@FindBy(xpath="//label[text()='Job Title']//following::div")
	public static WebElement Jobtitle;
	
	@FindBy(xpath="//span[text()='Chief Executive Officer']")
	public static WebElement SelectJob;
	
	@FindBy(xpath="//button[text()=' Search ']")
	public static WebElement Search;

}
