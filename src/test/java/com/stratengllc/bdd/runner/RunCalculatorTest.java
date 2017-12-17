package com.stratengllc.bdd.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
	format = {"pretty", "html:target/cucumber-htmlreport","json:target/cucumber-report.json"},
        glue = "com.stratengllc.bdd.steps",
        features = "classpath:cucumber/calculator.feature"
)
public class RunCalculatorTest {
}
