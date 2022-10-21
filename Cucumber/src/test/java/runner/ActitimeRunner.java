package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"src/test/resources/Features/"},
		glue= {"stepDefination"},
		plugin= {"html:target/report.html"},
		monochrome = true, 
		publish = true
		)
public class ActitimeRunner extends AbstractTestNGCucumberTests {

}
