package Seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyperlink {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/link.xhtml");
		driver.manage().window().maximize();
		
		WebElement link1 = driver.findElement(By.linkText("Go to Dashboard"));
		link1.click();
		
		driver.navigate().back();
		WebElement link2 = driver.findElement(By.linkText("Find the URL without clicking me."));
		String getup = link2.getAttribute("href");
		System.out.println("to get destination "  + getup);
		
		WebElement link3 = driver.findElement(By.linkText("Broken?"));
		link3.click();
		
		String title = driver.getTitle();
		
		if(title.contains("404")) {
			System.out.println("the title is "+  title);
		}
		driver.navigate().back();
		
	List<WebElement>totallink =	driver.findElements(By.tagName("a"));
	
	int linkname = totallink.size();
	System.out.println("total link is "+ linkname);
		
		
		
	}

}
