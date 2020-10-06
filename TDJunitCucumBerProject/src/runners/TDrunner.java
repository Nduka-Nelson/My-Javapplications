package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions( features ="resources/features/TDBanking.feature",glue = {"stepdefinitions"},
plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json","junit:target/cucumber-reports/Cucumber.xml",
		 "html:target/cucumber-reports"}, tags = {"@Products"},monochrome = true)
public class TDrunner  {

}
