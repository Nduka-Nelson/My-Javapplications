package Runners;



import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;




@CucumberOptions(
        features = {"resources/features/Td.feature"},
        glue = {"stepdefinitions"},
        tags = {"@Products"},
        plugin = { "pretty","html:target/cucumber-reports/cucumber-pretty","json:target/cucumber-reports/"
        		+ "CucumberTestReport.json","rerun:target/cucumber-reports/rerun.txt" },monochrome = true)
@Test
public class Tdrunner 	extends AbstractTestNGCucumberTests     {

	
	 

  
  
}
