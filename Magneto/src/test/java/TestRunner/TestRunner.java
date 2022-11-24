package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//Functional_TC/Magneto_TC_1.feature",
		glue="step"
		)

public class TestRunner {

}
