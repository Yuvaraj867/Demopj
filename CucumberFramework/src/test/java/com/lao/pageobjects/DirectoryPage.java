package com.lao.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.FindBy;

public class DirectoryPage {
	
	private static DirectoryPage instance;
	
	private DirectoryPage() {
		
	}
	
	
	public static DirectoryPage getInstance() {
		if(instance==null) {
			instance = new DirectoryPage();
		}
		return instance;
	}


	@FindBy(xpath="//label[text()='Job Title']//following::div")
	private  WebElement Jobtitle;
	
	@FindBy(xpath="//span[text()='Chief Executive Officer']")
	private  WebElement SelectJob;
	
	@FindBy(xpath="//button[text()=' Search ']")
	private  WebElement Search;

//	public WebElement getJobtitle() {
//		return Jobtitle;
//	}
	
	public void clickjobtitle() throws InterruptedException {
		Thread.sleep(3000);
		Jobtitle.click();
		SelectJob.click();
		
	}

//	public WebElement getSelectJob() {
//		return SelectJob;
//	}

//	public WebElement getSearch() {
//		return Search;
//	}
	
	public void clicksearch() {
		Search.click();
	}
	
	

}
