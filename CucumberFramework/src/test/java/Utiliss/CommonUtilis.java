package Utiliss;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import com.lao.pageobjects.DirectoryPage;
import com.lao.pageobjects.Homepage;
import com.lao.pageobjects.Login_page;

import Constants.Constatine;
import WEBDRIVER_Manager.DriverManager;

public class CommonUtilis {
	
	public  void loadProperties() {
		
		Properties properties = new Properties();
		
		try {
			properties.load(getClass().getResourceAsStream("/configure.properties"));
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	Constatine.Appurl=	properties.getProperty("APPURL");
		Constatine.BROWSER= properties.getProperty("Browser");
	Constatine.USERNAME=	properties.getProperty("Username");
	Constatine.PASSWORD=	properties.getProperty("Password");
	
	}
		
	public void intelements() {
		PageFactory.initElements(DriverManager.getDriver(), Login_page.class);
		PageFactory.initElements(DriverManager.getDriver(), Homepage.class);
		PageFactory.initElements(DriverManager.getDriver(), DirectoryPage.class);
		
	}
		
		
		
	
	
	

}
