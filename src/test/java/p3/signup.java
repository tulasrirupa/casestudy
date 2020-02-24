package p3;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class signup {
	
	@Given("User navigates to URL")
	public void user_navigates_to_URL() {
	    System.out.println("navigates");
	}

	@And("enters {string} and  {string}")
	public void enters_and(String username, String password) {
		 System.out.println("name "+username);
		 System.out.println("pwd "+password);
	}

	@When("click on signup button")
	public void click_on_signup_button() {
	    
	}

	@Then("welcome page is displayed")
	public void welcome_page_is_displayed() {
	   
	}


}
