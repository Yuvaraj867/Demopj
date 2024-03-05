package Seleniumbasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertExample {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.leafground.com/alert.xhtml");
	driver.manage().window().maximize();
	
	WebElement aa = driver.findElement(By.id("j_idt88:j_idt91"));
	aa.click();
	Alert bb =driver.switchTo().alert();
	bb.accept();
	
	WebElement cc = driver.findElement(By.id("j_idt88:j_idt93"));
	cc.click();
	Alert dd = driver.switchTo().alert();
	dd.dismiss();
	
	
	WebElement ee = driver.findElement(By.id("j_idt88:j_idt95"));
	ee.click();
	WebElement ff = driver.findElement(By.id("j_idt88:j_idt98"));
    ff.click();
	
	
	WebElement gg = driver.findElement(By.id("j_idt88:j_idt95"));
	gg.click();
	WebElement hh = driver.findElement(By.id("j_idt88:j_idt98"));
	hh.click();
	
	WebElement ii = driver.findElement(By.id("j_idt88:j_idt100"));
	gg.click();
	WebElement jj = driver.findElement(By.xpath("//a[@class='ui-dialog-titlebar-icon ui-dialog-titlebar-close ui-corner-all']"));
	hh.click();
	
	
	WebElement kk = driver.findElement(By.id("j_idt88:j_idt104"));
	kk.click();
	Alert ll = driver.switchTo().alert();
	ll.sendKeys("Yuvi");
	ll.accept();
	
	WebElement mm = driver.findElement(By.id("j_idt88:j_idt106"));
	mm.click();
	WebElement nn = driver.findElement(By.id("j_idt88:j_idt108"));
	nn.click();
	
	WebElement oo = driver.findElement(By.id("j_idt88:j_idt111"));
	oo.click();
	WebElement pp = driver.findElement(By.xpath("//a[@class='ui-dialog-titlebar-icon ui-dialog-titlebar-minimize ui-corner-all']"));
	pp.click();
	
	 

	}

}
