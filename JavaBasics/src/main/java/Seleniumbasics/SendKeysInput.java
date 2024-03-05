package Seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysInput {

	public static void main(String[] args) throws AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		WebElement qa = driver.findElement(By.xpath("//textarea[@name='q']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("document.getElementsByName('q')[0].value='test'", "");
		js.executeScript("arguments[0].value='test'", qa);
		
		
		
		//using robot class
		//driver.switchTo().activeElement();
//		Robot rb = new Robot();
//		rb.keyPress(KeyEvent.VK_T);
//		rb.keyRelease(KeyEvent.VK_T);
//		rb.keyPress(KeyEvent.VK_E);
//		rb.keyRelease(KeyEvent.VK_E);
//		rb.keyPress(KeyEvent.VK_S);
//		rb.keyRelease(KeyEvent.VK_S);
//		rb.keyPress(KeyEvent.VK_T);
//		rb.keyRelease(KeyEvent.VK_T);
		
		
		
		
		

	}

}
