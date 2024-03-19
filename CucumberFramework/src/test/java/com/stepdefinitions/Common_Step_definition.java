package com.stepdefinitions;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

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
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}



}
