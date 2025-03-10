package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
    features = {"src/test/resources/features"}, 
    glue = {"definitions"},
    plugin = {
        "pretty", // Prints Gherkin steps in the console
        "html:target/cucumber-reports.html", // Generates an HTML report
        "json:target/cucumber.json", // Generates a JSON report
        "junit:target/cucumber.xml" // Generates a JUnit XML report
    },
    monochrome = true, // Improves readability of console output
    tags = "@viorica2" //runs all scenarios. to run specific test use @viorica1 - @viorica5
    )

public class TestRunner {
}