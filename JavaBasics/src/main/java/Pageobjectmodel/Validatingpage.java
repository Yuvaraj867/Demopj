package Pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Validatingpage {
	
	
	
	@FindBy(xpath="//my-date-picker[@name='ToDate']")
	public static WebElement ESS6;
	
	@FindBy(xpath="//button[@aria-label='Previous Month']")
	public static WebElement ESSA;
	
	@FindBy(xpath="//div[@class='datevalue currmonth'][normalize-space()='30'] ")
	public static WebElement ESSB;
	
	@FindBy(xpath="//div[@class='datevalue currmonth'][normalize-space()='22']")
	public static WebElement ESS7;
	
	@FindBy(xpath="//button[@class='btn btn-lg btn-success pull-right']")
	public static WebElement ESS8;
	
	@FindBy(xpath="//button[@class='dialog__close-btn ng-tns-c13-10']")
	public static WebElement ESS9;
	
	@FindBy(xpath="//a[@class='btn btn-sm btn-primary pull-right']")
	public static WebElement ESS10;
	
	@FindBy(xpath="//button[@class='signout']")
	public static WebElement ESS11;
	
	
}
