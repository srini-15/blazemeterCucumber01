package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features=".//Features//validPurchase.feature",glue="stepdefinitions",
dryRun=false,plugin= {"pretty","html:test-output"})

public class test1 {

}
