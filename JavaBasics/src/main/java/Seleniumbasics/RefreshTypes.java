package Seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshTypes {

	public static void main(String[] args) throws AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		WebElement dew = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		dew.sendKeys("Admin");
		//using refresh command
		//driver.navigate().refresh();
		
		//get current url
	//	driver.get(driver.getCurrentUrl());
		
		//using javascriptexecutor
		
		/*
		 * JavascriptExecutor execute = (JavascriptExecutor)driver;
		 * execute.executeScript("location.reload()");// or history.go(0)
		 */		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);
		
		
		

	}

	
	}


