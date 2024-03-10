package Testrunnerr;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/FeatureaFlofer"},
plugin = {"json:target/cucumber.json"},// HTML report/test result 
glue = "StepDep")//tags = {"@Next"})

public class Testrunnerrr extends AbstractTestNGCucumberTests{
	
	

}
