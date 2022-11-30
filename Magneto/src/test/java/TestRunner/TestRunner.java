package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//Functional_TC/Magneto_TC_4.feature",
		glue="step",
		dryRun=false
		)

public class TestRunner {

}
