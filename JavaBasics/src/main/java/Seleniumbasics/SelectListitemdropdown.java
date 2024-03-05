package Seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectListitemdropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewPersonalDetails/empNumber/7");
		
		driver.findElement(By.xpath("//label[text()='Nationality'] //following::i")).click();
		Thread.sleep(3000);
		List<WebElement> Listbox = driver.findElements(By.xpath("//div[@role='listbox']"));
		for (WebElement listBox : Listbox) {
		    // Assuming each option is represented by <div> elements inside the list box
		    List<WebElement> options = listBox.findElements(By.tagName("div"));
		for (WebElement list : options) {
			//System.out.println(list.getText());
		if(list.getText().equals("Austrian")) {
			
		
			list.click();
			break;
		}}}
		}
		

	}


