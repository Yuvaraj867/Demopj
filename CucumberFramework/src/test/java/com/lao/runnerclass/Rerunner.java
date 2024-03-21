package com.lao.runnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@io.cucumber.junit.CucumberOptions(features=  "@targrt/failedscenario.txt" , 
glue = {"com.stepdefinitions"},
dryRun=false,
monochrome=true,
//format= {"html:report/WebReport","json:report/jsonreport.json"}

plugin = { "html:report/cucumber-report.html", "junit:report/cucumber.xml","json:report/jsonreport.json"}                                  
/*tags= "@validateCEo"*/ )
//"html:report/htmlReport.html","json:report/jsonreport.json",


public class Rerunner {
	
	

}
