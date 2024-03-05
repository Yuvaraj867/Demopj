package Logintc;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class BrowserLauncher {
	    public static void main(String[] args) {
	        // Specify the path to ChromeDriver executable
	        String driverPath = "C:\\Users\\yuvaraj.murugesan\\Downloads\\chromedriver_win32 (2).exe"; // Change this to your ChromeDriver path

	        // Set the system property for ChromeDriver (Not using System.setProperty)
	        // System.setProperty("webdriver.chrome.driver", driverPath);

	        // Initialize WebDriver with ChromeDriver
	        WebDriver driver = new ChromeDriver();

	        // Launch the browser
	        driver.get("https://www.example.com");

	        // Close the browser
	        driver.quit();
	    }
	}


