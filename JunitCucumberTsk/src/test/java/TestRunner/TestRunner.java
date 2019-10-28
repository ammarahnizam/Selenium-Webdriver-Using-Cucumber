package TestRunner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="Features",
		glue="StepDefinitions",
		plugin= {"pretty","junit:target/cucumber-reports/Cucumber.xml","json:target/cucumber-reports/Cucumber.json","html:target/cucumber-reports" }
		
		)


public class TestRunner {

}
