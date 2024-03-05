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
import org.openqa.selenium.interactions.Actions;

public class Scrolldown {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.google.com/search?q=test&rlz=1C1GCEU_enIN1047IN1047&oq=test&gs_lcrp=EgZjaHJvbWUyFAgAEEUYORhDGIMBGLEDGIAEGIoFMgwIARAjGCcYgAQYigUyDAgCEAAYQxiABBiKBTIMCAMQABhDGIAEGIoFMgwIBBAAGEMYgAQYigUyDAgFEAAYQxiABBiKBTITCAYQLhiDARjHARixAxjRAxiABDIMCAcQABhDGIAEGIoFMgwICBAAGEMYgAQYigUyDAgJEAAYQxiABBiKBdIBCTkzNDBqMGoxNagCALACAA&sourceid=chrome&ie=UTF-8");
		driver.manage().window().maximize();
		//Thread.sleep(3000);
		JavascriptExecutor aq = (JavascriptExecutor)driver;
		
	//	aq.executeScript("window.scrollBy(0,700)","");
		//aq.executeScript("windows.scrollBy(0,-300)", "");
	/*
	 * Thread.sleep(3000);
	 * aq.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
	 * Thread.sleep(3000); aq.executeScript("window.scroll(0,0)","");
	 * Thread.sleep(3000);
	 */
	Robot re = new Robot();
	re.keyPress(KeyEvent.VK_PAGE_DOWN);
	re.keyRelease(KeyEvent.VK_PAGE_DOWN);
	Thread.sleep(3000);
	re.keyPress(KeyEvent.VK_PAGE_UP);
	re.keyRelease(KeyEvent.VK_PAGE_UP);
	
	
		
		
		

	}

}
