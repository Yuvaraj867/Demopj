package com.lao.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage {
	@FindBy(xpath="//span[text() = 'Directory']")
	public static WebElement Home;
		
	

}
