package p5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Sc3 {
	WebDriver driver;
	 
@Given("Alex logins in testMeApp")
public void alex_logins_in_testMeApp() {
	driver=chrome.getDriver("Chrome");
    driver.get("https://10.232.237.143:443/TestMeApp/fetchcat.htm");
	

	  driver.get("https://10.232.237.143/TestMeApp/fetchcat.htm");
	  driver.findElement(By.id("details-button")).click();
	  driver.findElement(By.id("proceed-link")).click();
	  
	  driver.findElement(By.xpath("//*[@href='login.htm']")).click();
	  driver.findElement(By.name("userName")).sendKeys("lalitha");
	  driver.findElement(By.name("password")).sendKeys("password123");
	  
	  driver.findElement(By.name("Login")).click();
	//  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	  /*
	  Actions cart=new Actions(driver);
	 
	 cart.moveToElement(driver.findElement(By.linkText("All Categories"))).click().build().perform();
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 cart.moveToElement(driver.findElement(By.linkText("Home Appliances"))).click().build().perform();
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 cart.moveToElement(driver.findElement(By.linkText("Floor"))).click().build().perform();
	 cart.moveToElement(driver.findElement(By.linkText("Add to cart"))).click().build().perform();
	*/
   
	  driver.findElement(By.name("products")).sendKeys("head");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//*[@value='FIND']"));
	  driver.findElement(By.linkText("Add to cart")).click();
	  
			  
}

@And("goto search")
public void goto_search() {
}

@When("he types {int} characters")
public void he_types_characters(Integer int1) {
    
}

@Then("results displayed")
public void results_displayed() {
    
}



}
