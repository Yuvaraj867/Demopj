package Seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//th for columns and tr for rows
public class Tables {

	public static void main(String[] args) {
     WebDriver driver = new ChromeDriver();
     driver.get("https://www.leafground.com/table.xhtml");
     driver.manage().window().maximize();
     
     List<WebElement>Columnsize= driver.findElements(By.tagName("th"));
     int tcl=  Columnsize.size();
     System.out.println("print column " +tcl);
     
     List<WebElement>Rowsize = driver.findElements(By.tagName("tr"));
     int trw = Rowsize.size();
     System.out.println("print column " +trw);

     WebElement aq = driver.findElement(By.xpath("//table//tr[2]/td[2]//following::td[2]"));
     String aw = aq.getText();
   System.out.println(aw);
     
	}

}
