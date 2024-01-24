package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features="src/test/java/com/feature/Login.feature",
		glue="com.stepdefinition",
		dryRun=false,                // it is used to compile feature file
		monochrome=true,             // to readable output
		plugin="html:target",
		tags="@tag1"                 // tags are used to specific scenario
)


public class Runner {

}
