package Pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpage {
	
	WebDriver driver = new ChromeDriver();
	@FindBy(xpath="//input[@placeholder='User Id']")
	public static WebElement UserId;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	public static WebElement Password;
	
	@FindBy(xpath="//button[@type='submit']")
	public static WebElement Submit;
	//WebDriver wait = new WebDriverWait(driver,20);
	
	@FindBy(xpath="//a[@role='button']")
	public static WebElement ESS1;
	
	@FindBy(xpath="//a[@routerlink='/shortfallReport']")
	public static WebElement ESS2;
	
	@FindBy(xpath="//input[@placeholder='Select Date']")
	public static WebElement ESS3;
	
	@FindBy(xpath="//button[@aria-label='Previous Month']")
	public static WebElement ESS4;
	
	@FindBy(xpath="//div[@class='datevalue currmonth'][normalize-space()='26'] ")
	public static WebElement ESS5;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * public static WebElement UserId (WebDriver driver) { return
	 * driver.findElement(By.xpath("//input[@placeholder='User Id']")); }
	 * 
	 * public static WebElement Password(WebDriver driver) { return
	 * driver.findElement(By.xpath("//input[@placeholder='Password']")); }
	 * 
	 * public static WebElement Submit(WebDriver driver) { return
	 * driver.findElement(By.xpath("//button[@type='submit']")); }
	 * 
	 * public static WebElement ESS1(WebDriver driver) { return
	 * driver.findElement(By.xpath("//a[@role='button']"));
	 * 
	 * } public static WebElement ESS2(WebDriver driver) { return
	 * driver.findElement(By.xpath("//a[@routerlink='/shortfallReport']"));
	 * 
	 * } public static WebElement ESS3(WebDriver driver) { return
	 * driver.findElement(By.xpath("//input[@placeholder='Select Date']"));
	 * 
	 * }
	 */

}
