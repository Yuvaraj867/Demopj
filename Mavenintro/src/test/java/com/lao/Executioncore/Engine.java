package com.lao.Executioncore;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.openqa.selenium.By;

import com.lao.Constants.Constants;
import com.lao.Utilities.ExcelUtilities;
import com.lao.Utilities.Locators;
import com.lao.actionKeywords.ActionKeywords;

public class Engine {
	Method[]methods;
	ActionKeywords actionkeywords;
	
	public static By Locator;
	public void getKeywordsFromActions() {
		 actionkeywords = new ActionKeywords();
		methods=actionkeywords.getClass().getMethods();
	}
	
	public void executeKeywords() throws Exception {
		for (int i=0 ; i<methods.length;i++) {
			if(methods[i].getName().equalsIgnoreCase(ExcelUtilities.KeywordColumnValue)){
				methods[i].invoke(actionkeywords);
				
			}
			
		}
	}
	

	public static void main(String[] args) throws  Exception {
		ExcelUtilities utilities = new ExcelUtilities();
		utilities.readExcelfile(Constants.Excel_Location);
		Engine engine = new Engine();
		int locatorColumn =3;
		int KeyWordColumn = locatorColumn+1;
		int DataColumn = locatorColumn+2;
		
		
		
		engine.getKeywordsFromActions();
		
		for(int row=1; row<=8;row++) {
			 utilities.getlocatorsKeywordsAndData(row,  Constants.locatorColumn, KeyWordColumn, DataColumn );
			engine.executeKeywords();
			engine.findWebElementsToBeUsed();
			
			/*if(keyword.equalsIgnoreCase("openbrowser")) {
				ActionKeywords.openbrowser();
			}else if(keyword.equalsIgnoreCase("goTOURL")) {
				ActionKeywords.goTOURL();
			}else if(keyword.equalsIgnoreCase("enterUserName")) {
				ActionKeywords.enterUserName();
			}else if (keyword.equalsIgnoreCase("enterPassword")) {
				ActionKeywords.enterPassword();
			}else if  (keyword.equalsIgnoreCase("clickloginbutton")) {
				ActionKeywords.clickloginbutton();
			}else if (keyword.equalsIgnoreCase("clickDirectory")) {
				ActionKeywords.clickDirectory();
			}else if (keyword.equalsIgnoreCase("selectQALead")) {
				ActionKeywords.selectQALead();
			}else if(keyword.equalsIgnoreCase("clicksearch")) {
				ActionKeywords.clickSearch();
			}
		}*/
	}
		
	

}
	public void findWebElementsToBeUsed() {
		switch (ExcelUtilities.LocatorName) {
		case "xpath":
			Locator=Locators.getXpath(ExcelUtilities.LocatorValue);
			break;
		case "id":
			Locator=Locators.getId(ExcelUtilities.LocatorValue);
			break;
			
		case "name":
			Locator=Locators.getName(ExcelUtilities.LocatorValue);
			break;
			
		
			
		case "linktext":
			Locator=	Locators.getLinkText(ExcelUtilities.LocatorValue);
			break;
			
		case "partiallinktext":
			Locator=Locators.getPartialLinkText(ExcelUtilities.LocatorValue);
			break;
			
		case "tagname":
			Locator=Locators.getTagName(ExcelUtilities.LocatorValue);
			break;
			
		case "cssselector":
			Locator=Locators.getCssSelector(ExcelUtilities.LocatorValue);
			break;	
			
			
			

		default:
			break;
		}
	}}
