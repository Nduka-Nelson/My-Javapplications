package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( plugin = { "pretty", "html:target/cucumber-reports","json:target/cucumber-reports/Cucumber.json",
		"junit:target/cucumber-reports/Cucumber.xml"},features ="resources/features/fcbLogin.feature",
glue = {"stepdefinitions"},monochrome = true)

public class FacebookLoginRunner  {
	
	

}
