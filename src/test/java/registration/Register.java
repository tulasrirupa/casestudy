package registration;

import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import io.cucumber.java.en.And;
 import io.cucumber.java.en.Given;
 import io.cucumber.java.en.Then;
 import io.cucumber.java.en.When;






 public class Register {
  WebDriver driver;
  @Given("User clicks on signup button")
  public void user_clicks_on_signup_button() {
     driver=chrome.getDriver("Chrome");
     driver.get("https://10.232.237.143:443/TestMeApp/fetchcat.htm");
     driver.findElement(By.id("details-button")).click();
     driver.findElement(By.id("proceed-link")).click();
     driver.findElement(By.xpath("//*[@href='RegisterUser.htm']")).click();
    
  }

 @Given("enters username as {string}")
  public void enters_username_as(String string) {
     driver.findElement(By.name("userName")).sendKeys("ddfssxx");
  }

 
 @Given("enters first name as {string}")
  public void enters_first_name_as(String string) {
    driver.findElement(By.name("firstName")).sendKeys("tula");  
  }


 @Given("enters last name as {string}")
  public void enters_last_name_as(String string) {
   driver.findElement(By.id("lastName")).sendKeys("sri");
  }

 
 @Given("enters password as {string}")
  public void enters_password_as(String string) {
   driver.findElement(By.id("password")).sendKeys("tula123");
 }

 @Given("enters confirm password as {string}")
  public void enters_confirm_password_as(String string) {
   driver.findElement(By.name("confirmPassword")).sendKeys("tula123");
 }


 @Given("clicks on gender female radio button")
  public void clicks_on_gender_female_radio_button() {
	 driver.findElement(By.xpath("//*[@value='Female']")).click();
 }


 @Given("enters email as {string}")
  public void enters_email_as(String string) {
   driver.findElement(By.id("emailAddress")).sendKeys("tsri@gmail.com");
 }
  
 
  @Given("enters mobile number as {}")
  public void enters_mobileno_as(String string) {
   driver.findElement(By.id("mobileNumber")).sendKeys("12345678");
  }

 @Given("enters dob as {string}")
  public void enters_dob_as(String string) {
   driver.findElement(By.name("dob")).sendKeys("07/07/1998");
  }


 @Given("enters address as {string}")
  public void enters_address_as(String string) {
   driver.findElement(By.id("address")).sendKeys("coimbatore");
 }


 @Given("selects security question clicks")
  public void selects_security_question_clicks() {
   Select sel=new Select(driver.findElement(By.name("securityQuestion")));
   sel.selectByIndex(1);
  }


 @Given("enters answer as {string}")
  public void enters_answer_as(String string) {
   driver.findElement(By.id("answer")).sendKeys("Blue");
  }

 @When("click on register button")
  public void click_on_register_button() {
   driver.findElement(By.name("Submit")).click();
  }

 @Then("welcome page is displayed")
  public void welcome_page_is_displayed() {
   System.out.println("HomePage is displayed");
  }
 }
 
