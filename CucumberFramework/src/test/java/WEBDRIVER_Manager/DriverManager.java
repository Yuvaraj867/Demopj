package WEBDRIVER_Manager;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.stepdefinitions.Common_Step_definition;

import Constants.Constatine;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	private static WebDriver driver=null;
	
	public static WebDriver getDriver() {
		return driver;
	}

	static Logger logger =Logger.getLogger(Common_Step_definition.class);

	public static void Launchbrowser() {
		PropertyConfigurator.configure("File2.properties");
		logger.info("To Launch the web browser");
		try {
			switch (Constatine.BROWSER) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				
				//Systemsetproperty
				driver = new ChromeDriver();
				break;
				
			case "edge":
				WebDriverManager.edgedriver().setup();
				//Systemsetproperty
				driver = new EdgeDriver();
				break;
				

			default:
				//Systemsetproperty
				driver = new ChromeDriver();
				break;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

}}
