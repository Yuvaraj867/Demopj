package Seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
  
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		WebElement v1 = driver.findElement(By.id("form:drag_content"));
		WebElement v2 = driver.findElement(By.id("form:drop_header"));

		Actions act = new Actions(driver);
		//act.clickAndHold(v1).moveToElement(v2).release(v2).build().perform();
		act.dragAndDrop(v1, v2).build().perform();

	}

}
