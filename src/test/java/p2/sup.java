package p2;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class sup {
	
	
	@Given("User navigates to URL")
	public void user_navigates_to_URL() {
	    System.out.println("test me app signup page");
	}

	@And("enters {string} and  {int}")
	public void credentials(String username, int pwd) {
		System.out.println("user_id= "+username);
	     System.out.println("password is= "+pwd);
	}

	@When("click on signup button")
	public void click_on_signup_button() {
		System.out.println("clicks on signup button");
	}

	@Then("welcome page is displayed")
	public void welcome_page_is_displayed() {
		System.out.println("homepage displays");
	}



@Given("User enters user name")
public void user_enters_user_name() {
    
	System.out.println("lalit");
}

@Given("user enters password")
public void user_enters_password() {
	System.out.println("123");
}

@When("click on login button")
public void click_on_login_button() {
	System.out.println("login button");
}

@Then("home page is displayed")
public void home_page_is_displayed() {
	System.out.println("homepage");
}



}
