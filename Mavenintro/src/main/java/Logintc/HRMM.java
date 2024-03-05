package Logintc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HRMM {
	@Test
	public void OpenHRM() throws InterruptedException {
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\yuvaraj.murugesan\\Pictures\\Saved Pictures\\chromedriver-win32\\chromedriver.exe"
		 * );
		 */
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement dew = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		dew.sendKeys("Admin");
		WebElement swe = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		swe.sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("My Info" + Keys.ENTER);
		driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewMyDetails']")).click();
		Thread.sleep(3000);
		WebElement name = driver.findElement(By.xpath("//input[@name='firstName']"));
		name.click();
		name.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		name.sendKeys(Keys.DELETE);
		name.sendKeys("Yuvi");
		driver.findElement(By.xpath("//label[text()='Nationality'] //following::i")).click();
		Thread.sleep(3000);
		List<WebElement> Listbox = driver.findElements(By.xpath("//div[@role='listbox']"));
		for (WebElement listBox : Listbox) {
			// Assuming each option is represented by <div> elements inside the list box
			// int positions=0;
			List<WebElement> options = listBox.findElements(By.tagName("div"));
			for (WebElement list : options) {
				System.out.println(list.getText());
				// positions++;
				// if (positions==3) {

				if (list.getText().equals("Austrian")) {

					list.click();
					break;// we are using break to neglect the stale element exception as it breaks the
							// ongoing loop

				}
			}

		}

		driver.findElement(By.xpath("//label[text()='Marital Status'] //following::i")).click();
		Thread.sleep(3000);
		List<WebElement> Listbox1 = driver.findElements(By.xpath("//div[@role='listbox']"));
		for (WebElement list1 : Listbox1) {
			List<WebElement> Listone = list1.findElements(By.tagName("div"));

			for (WebElement list3 : Listone) {
				if (list3.getText().equals("Married")) {
					list3.click();
					break;
				}
			}
		}

		WebElement ssd = driver.findElement(By.xpath("//label[text()='Date of Birth']//following::input[1]"));
		ssd.click();
		ssd.sendKeys(Keys.chord(Keys.CONTROL, "a"));

// Delete the selected text by sending the delete key
		ssd.sendKeys(Keys.DELETE);
		ssd.sendKeys("2024-01-05");

		driver.findElement(By.xpath(
				"//span[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input']//following::span[1]"))
				.click();
		driver.findElement(By.xpath("//button[@type='submit'][1]")).click();
		Thread.sleep(3000);

	}

}
