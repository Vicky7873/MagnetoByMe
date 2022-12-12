package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={".//Functional_TC/Magneto_TC_5.feature",".//Functional_TC/Magneto_TC_6.feature"},
		glue="step",
		dryRun=false
		)

public class TestRunner {

}
