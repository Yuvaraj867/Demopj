package Seleniumbasics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchUrlWithoutGetandNavigate {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		String url = "https://www.google.co.in/";
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.location=\'"+url+"\'");
		

	}

}
