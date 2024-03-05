package myCom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void browser() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\yuvaraj.murugesan\\eclipse-workspace\\Java\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://qa-content.kiteaai.org/login");
	}

	public static void main(String[] args) {
		
		browser();

	}

}
