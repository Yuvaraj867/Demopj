package Seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linksdownload {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/search?q=java&rlz=1C1GCEU_enIN1047IN1047&oq=java&gs_lcrp=EgZjaHJvbWUyDwgAEEUYORiDARixAxiABDITCAEQLhiDARivARjHARixAxiABDIGCAIQRRg7MgYIAxBFGDsyDQgEEAAYgwEYsQMYgAQyDQgFEAAYgwEYsQMYgAQyDQgGEAAYgwEYsQMYgAQyDQgHEAAYgwEYsQMYgAQyDQgIEAAYgwEYsQMYgAQyBwgJEAAYjwLSAQoxMjY5MWowajE1qAIAsAIA&sourceid=chrome&ie=UTF-8");
        driver.manage().window().maximize();
       // To get all the links
//      List <WebElement> link = driver.findElements(By.xpath("//a"));
//      for (WebElement linkall : link) {
//		System.out.println(linkall.getAttribute("href"));
//	}
      //To get the specified link 
      List <WebElement> link12 = driver.findElements(By.xpath("//div[@id='res']//following::h3//following::div/cite"));
      for (WebElement linkall1 : link12) {
		System.out.println(linkall1.getText());
	}
      
	}

}
