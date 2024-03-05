package Seleniumbasics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		String aa = driver.getWindowHandle();
		WebElement aq = driver.findElement(By.xpath("//button[@id='j_idt88:new']"));
		aq.click();
		Set<String> a12 = driver.getWindowHandles();
		for (String a13 : a12) {
			driver.switchTo().window(a13);
		}
		WebElement a14 = driver.findElement(By.xpath("//input[@placeholder='Search...']"));
		a14.sendKeys("abcd");
		driver.close();
		driver.switchTo().window(aa);

		int a15 = driver.getWindowHandles().size();
		System.out.println(a15);

		WebElement abc = driver.findElement(By.xpath("//button[@name='j_idt88:j_idt93']"));
		abc.click();

		Set<String> a17 = driver.getWindowHandles();
		for (String a18 : a17) {
			if (!a18.equals(aa)) {
				driver.switchTo().window(a18);
				driver.close();
			}
		}
	}
}
