package Seleniumbasics; //frame = html/html  , //nested frame=html/html/html

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml;jsessionid=node08xd1eanchoxf1skv6lr6rk62l425238.node0");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		WebElement a1 = driver.findElement(By.id("Click"));
		a1.click();
		//to get text by frame:
		
	String a2 =	driver.findElement(By.id("Click")).getText();
	System.out.println(a2);
	
	driver.switchTo().defaultContent();
	driver.switchTo().frame(1);
	
	  driver.switchTo().frame("frame2"); 
	  WebElement a3 =driver.findElement(By.id("Click")); 
	  a3.click();
	 
	
	driver.switchTo().defaultContent();

	List<WebElement>a4=driver.findElements(By.tagName("iframe"));
	int size = a4.size();
	System.out.println(size);
	
	}

}
