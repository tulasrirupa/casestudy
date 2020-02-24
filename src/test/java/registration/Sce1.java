package registration;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;
@CucumberOptions(monochrome=true,plugin= {"pretty","json:registration_report.json"})
@RunWith(Cucumber.class)
public class Sce1 {

}
