package com.lao.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage {
	private static Homepage inst;
	
	private Homepage() {
		
	}
	public static Homepage getInst() {
		if(inst==null) {
			inst = new Homepage();
		}
		return inst;
	}
	
	
	@FindBy(xpath="//span[text() = 'Directory']")
	private  WebElement Home;

//	public WebElement getHome() {
//		return Home;
//	}
	
	public void enterdirectory() throws InterruptedException {
		Thread.sleep(3000);
		Home.click();
	}

	
		
	

}
