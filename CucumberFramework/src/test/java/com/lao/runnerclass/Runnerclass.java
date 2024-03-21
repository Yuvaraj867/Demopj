package com.lao.runnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@io.cucumber.junit.CucumberOptions(features=  "src/test/resources/Featurefiles" , 
glue = {"com.stepdefinitions"},
dryRun=false,
monochrome=true,

//format= {"html:report/WebReport","json:report/jsonreport.json"}

		plugin = {"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm","pretty",
				/* "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", */"html:report/cucumber-report.html", "junit:report/cucumber.xml","json:report/jsonreport.json"},                                   
tags= "@validateCEo",publish=true
)
//"html:report/htmlReport.html","json:report/jsonreport.json",


public class Runnerclass {

}
