package com.tflCompany.Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Babatunde on 20/04/2015.
 */


@RunWith(Cucumber.class)
//@CucumberOptions(features = {"src/test/resources"}, tags = {"@Journey1"})
@CucumberOptions(features = {"src/test/resources"}, glue = {"com.tflCompany.StepDefinition"}, tags = {"@Journey1"})

public class TestRunner {
}
