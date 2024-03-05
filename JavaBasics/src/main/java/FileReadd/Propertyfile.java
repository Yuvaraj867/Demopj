package FileReadd;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Propertyfile {

	public static void main(String[] args) throws IOException {
		WebDriver driver=null;
   FileInputStream stream = new FileInputStream("config.properties");
   Properties properties = new Properties();
   properties.load(stream);
   
   String browser = properties.getProperty("browser");
   String Driverlocation=properties.getProperty("DriverLocation");
   if(browser.equals("chrome")) {
	   System.setProperty("webdriver.chrome.driver", Driverlocation);
	   driver = new ChromeDriver();
   }
   else if(browser.equalsIgnoreCase("firefox")){
	   System.setProperty("webdriver.gecko.driver", Driverlocation);
	   driver = new FirefoxDriver();
	   

	   
	   
	   
   }
   driver.get("http://www.google.co.in");
   
	}

}
