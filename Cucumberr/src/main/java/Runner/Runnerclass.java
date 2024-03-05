package Runner;
//It should combine feature file and step definition
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@io.cucumber.junit.CucumberOptions(features=  "Featurefiles" , 
glue = {"stepdefinition","Hooks"},
dryRun=true,
monochrome=true,
//format= {"html:report/WebReport","json:report/jsonreport.json"}
plugin = { "html:report/cucumber-report.html", "junit:report/cucumber.xml","json:report/jsonreport.json"},
tags= "@HRM" )
//"html:report/htmlReport.html","json:report/jsonreport.json",
public class Runnerclass {

}

