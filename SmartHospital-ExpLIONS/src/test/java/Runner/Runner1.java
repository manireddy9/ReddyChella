package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(tags="",features= "src/test/resources/Features",glue="com.stepdefinition",plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},dryRun = false)
		
public class Runner1 {
	

}
//{"pretty","json:target/cucumber-reports/Cucumber.json"},
//{"pretty","junit:t
