package Seleniumbasics;

import java.io.File;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileS {

	

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/file.xhtml");
		driver.manage().window().maximize();
		
		WebElement folder = driver.findElement(By.id("j_idt93:j_idt95"));
		folder.click();
		Thread.sleep(3000);
		
		File Locationfl = new File ("C:\\Users\\yuvaraj.murugesan\\Downloads");
		
		File[]totalfiles = Locationfl.listFiles();
		
		for (File Result : totalfiles) {
			if (Result.getName().contains("Variables")) {
			System.out.println("file downloaded");
			break;
			}
		else {
			System.out.println("not found");
			break;
			}
			
			
			
		}
	}

}
