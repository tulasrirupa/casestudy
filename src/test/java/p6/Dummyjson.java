package p6;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome=true,plugin= {"pretty","json:cucumber-reports.json"})
public class Dummyjson {

}
