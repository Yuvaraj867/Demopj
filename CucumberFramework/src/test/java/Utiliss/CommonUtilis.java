package Utiliss;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import com.lao.pageobjects.DirectoryPage;
import com.lao.pageobjects.Homepage;
import com.lao.pageobjects.Login_page;

import Constants.Constatine;
import WEBDRIVER_Manager.DriverManager;

public class CommonUtilis {
	
	private static CommonUtilis commonutilisinstance=null;
	
	private CommonUtilis() {
		
	}
	
	
	
	public static CommonUtilis getCommonutilisinstance() {
		if(commonutilisinstance==null) {
			commonutilisinstance=new CommonUtilis();
			
		}
		return commonutilisinstance;
	}



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
		PageFactory.initElements(DriverManager.getDriver(), Login_page.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), Homepage.getInst());
		PageFactory.initElements(DriverManager.getDriver(), DirectoryPage.getInstance());
		
	}
		
	public void takescreenshot()  {

		  TakesScreenshot screenimg = (TakesScreenshot)DriverManager.getDriver();
		  File filess =screenimg.getScreenshotAs(OutputType.FILE); 
		  try {
			  FileUtils.copyFile(filess, new File("screenshot.png"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
			
		}
		  
		 
	}
		
		
	
	
	

}
