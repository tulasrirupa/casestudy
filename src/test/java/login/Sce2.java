package login;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;
@CucumberOptions(monochrome=true,plugin= {"pretty","json:login_reports.json"})
@RunWith(Cucumber.class)
public class Sce2 {

}
