package com.abnamro;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json"},
 features = "src/test/features",
 glue={"com.abnamro.steps"}
 )
public class TestRunner {
	
}

