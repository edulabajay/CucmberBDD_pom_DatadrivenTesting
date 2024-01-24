package com_runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(

features = "C:\\Users\\info\\eclipse-workspace\\CRM_CucmberBDD_Maven_Parameterization_POM\\src\\main\\java\\com_featurefile\\ERP.Feature",
glue = {"com_StepDefinition"},
plugin = {"pretty","html:test-output"},
monochrome=true, // to display console in  readable output
dryRun = true

)

public class Runner_Test {

}
