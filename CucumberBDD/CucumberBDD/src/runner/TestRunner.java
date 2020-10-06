package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "resourses/features", glue = "stepdefenitions", tags = "@Products")
public class TestRunner {

}
