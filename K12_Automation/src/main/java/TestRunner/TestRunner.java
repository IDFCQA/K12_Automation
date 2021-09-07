package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
 features = "C:\\Users\\Acer\\eclipse-workspace\\K12_Automation\\src\\main\\java\\Features\\K12PartnerJourney.feature"
 ,glue={"StepDefinition"}
 ,plugin = {"pretty", "html:target/Automation-reports.html"}
 ,monochrome=true
 
 )

public class TestRunner {

	
}
