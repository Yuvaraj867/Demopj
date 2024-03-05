package Pageobjectmodel;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

  public class RedBus {
  public static void main(String[] args) {
  WebDriver driver = new ChromeDriver();
  driver.get("https://www.redbus.in/");
  driver.manage().window().maximize();
  
  PageFactory.initElements(driver, RedBus1.class);
  
  RedBus1.From.sendKeys("CMBT, Chennai"+Keys.ENTER);
  RedBus1.To.sendKeys("Kalavasal"+Keys.ENTER);
  RedBus1.Date.click();
  
}

}
