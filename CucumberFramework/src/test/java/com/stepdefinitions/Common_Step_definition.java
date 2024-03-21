package com.stepdefinitions;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

import com.lao.pageobjects.Login_page;

import Constants.Constatine;
import Utiliss.CommonUtilis;
import WEBDRIVER_Manager.DriverManager;
import io.cucumber.java.Before;


public class Common_Step_definition {
	
	
	
	static Logger logger =Logger.getLogger(Common_Step_definition.class);
	
	@Before
	public void beforeScenario() {
		PropertyConfigurator.configure("File2.properties");
		logger.info("Execute first for UTILIS");
		try {
			
			CommonUtilis.getCommonutilisinstance().loadProperties();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		logger.info("Execute first for Launch Browser");

		
		try {
			if(DriverManager.getDriver()==null)
				DriverManager.Launchbrowser();
			DriverManager.getDriver().manage().window().maximize();
			
			CommonUtilis.getCommonutilisinstance().intelements();
			login();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

	private void login()  {
DriverManager.getDriver().get(Constatine.Appurl);
		
		try {
			Thread.sleep(3000);
			Login_page.getInstance().enterusername(Constatine.USERNAME);
			Login_page.getInstance().enterpassword(Constatine.PASSWORD);
			Login_page.getInstance().entersubmit();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}



}
