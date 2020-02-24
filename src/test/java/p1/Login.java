package p1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Login {

@Given("i enter the username")
public void i_enter_the_username() {
    System.out.println("username is entered");
}

@And("i enter the password")
public void i_enter_the_password() {
	  System.out.println("password is entered");
}

@When("click on login button")
public void click_on_login_button() {
	 System.out.println("clicked on login");
}

@And("home page is displayed")
public void home_page_is_displayed() {
	 System.out.println("user is on homepage");
}


}
