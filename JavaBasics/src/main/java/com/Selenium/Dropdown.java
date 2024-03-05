package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\yuvaraj.murugesan\\eclipse-workspace\\Java\\Driver");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.leafground.com/select.xhtml;jsessionid=node01jabv7hmtf2hgzklg5g4jnp0m409652.node0");
	driver.manage().window().maximize();
	
	
	  WebElement a11=
	  driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
	  a11.click();
	  Select s = new Select(a11); 
	  s.selectByVisibleText("Selenium");
	 

 
	

	}

}
