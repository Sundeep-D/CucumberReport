package CaseStudy06.CaseStudy06;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (monochrome = true,plugin = {"pretty","json:cucumber.json"})
public class Runner {

}
