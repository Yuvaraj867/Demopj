package Seleniumbasics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
	//links can be clicked using the locators link text and partial link text
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
        String ab = driver.getWindowHandle();
        
        WebElement ac = driver.findElement(By.xpath("//button[@id='j_idt88:new']"));
		ac.click();
		Set<String>ad = driver.getWindowHandles();
		for(String ae:ad ) { 
		driver.switchTo().window(ae);
		} 
		driver.findElement(By.id("message")).sendKeys("msg"+Keys.ENTER);
		int a15 = driver.getWindowHandles().size(); 
		System.out.println(a15);
		 driver.close();
		 driver.switchTo().window(ab);
		 
		 WebElement bb = driver.findElement(By.xpath("//button[@name='j_idt88:j_idt93']"));
         bb.click();
         
         Set<String> qq = driver.getWindowHandles();
         for(String qa : qq) {
        	 if(!qa.equals(ab)) {
        		 driver.switchTo().window(qa);
        		 driver.close();
        	 }
         }
		 
		 
		
	}

}
