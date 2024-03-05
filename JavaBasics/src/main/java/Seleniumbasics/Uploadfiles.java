package Seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadfiles {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/file.xhtml");
		driver.manage().window().maximize();
		WebElement Upfolder = driver.findElement(By.xpath("//span[@class='ui-fileupload-simple ui-widget']"));
		Upfolder.click();
		Thread.sleep(3000);
		
		String file = "C:\\Users\\yuvaraj.murugesan\\Downloads\\Updated Location Allocation - V&V.xlsx";
		// string selection to store the string
		
		StringSelection select = new StringSelection(file);
		//Toolkit store between copy and paste here we get the value from toolkit
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);
		
		// to perform keyboard actions we use robot
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_V);
		rob.keyRelease(KeyEvent.VK_V);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyPress(KeyEvent.VK_ENTER);
		
		

	}

}
