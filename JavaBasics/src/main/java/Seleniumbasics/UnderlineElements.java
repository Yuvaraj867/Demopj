package Seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UnderlineElements {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		WebElement lang = driver.findElement(By.xpath("//a[text()='தமிழ்']"));
		String beforevalue = lang.getCssValue("text-decoration");
		System.out.println("before value "  +beforevalue);
		Actions act = new Actions(driver);
		act.moveToElement(lang);
		act.perform();
		String aftervalue = lang.getCssValue("text-decoration");
		System.out.println("after value "  +aftervalue);
		
	}

}
