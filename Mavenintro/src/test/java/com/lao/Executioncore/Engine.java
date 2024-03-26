package com.lao.Executioncore;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.lao.Utilities.ExcelUtilities;
import com.lao.actionKeywords.ActionKeywords;

public class Engine {
	Method[]methods;
	ActionKeywords actionkeywords;
	static String  keyword;
	public void getKeywordsFromActions() {
		 actionkeywords = new ActionKeywords();
		methods=actionkeywords.getClass().getMethods();
	}
	
	public void executeKeywords() throws Exception {
		for (int i=0 ; i<methods.length;i++) {
			if(methods[i].getName().equalsIgnoreCase(keyword)){
				methods[i].invoke(actionkeywords);
				
			}
			
		}
	}
	

	public static void main(String[] args) throws  Exception {
		ExcelUtilities utilities = new ExcelUtilities();
		utilities.readExcelfile("src/test/resources/TestDataCore.xlsx");
		Engine engine = new Engine();
		engine.getKeywordsFromActions();
		
		for(int row=1; row<=8;row++) {
			 keyword = utilities.getValuesFromExcel(row, 3);
			engine.executeKeywords();
			
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
	

}}
