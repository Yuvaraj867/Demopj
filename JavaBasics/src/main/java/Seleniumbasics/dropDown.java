package Seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		
		WebElement Dropdown = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select drop = new Select(Dropdown); //Select the element then stored in the list to get the value from the dropdown
		drop.selectByIndex(0);
		drop.selectByVisibleText("Puppeteer");
		Dropdown.sendKeys("Cypress");
	    
	    List<WebElement>DropOptions2= drop.getOptions();
	    int a1 = DropOptions2.size();
	    System.out.println("get options" +a1);
	    
	    WebElement Multiselect = driver.findElement(By.xpath("//div[@id='j_idt87:auto-complete']"));
	    Select Multi = new Select (Multiselect);
	    Multi.selectByVisibleText("Appium");
	    
	    
	    Multiselect.sendKeys("Appium");
	    driver.findElement(By.xpath("//li[@data-item-label='Selenium WebDriver']")).click();
	    
		/*
		 * Select multi = new Select(Multiselect); multi.selectByIndex(1);
		 * s.selectByIndex(2); s.selectByIndex(3);
		 */
	    
		
	}

}
