package p4;
import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class caserunner {
	
	@Given("I want to give the names")
	public void i_want_to_give_the_names(DataTable dt) {
		List <Map<String,String>> list=dt.asMaps(String.class, String.class);
		
	    for(int i=0; i<list.size();i++) {
	    	System.out.println(list.get(i).get("name"));
	    	System.out.println(list.get(i).get("password"));
	    }
	}

	@And("some actions")
	public void some_actions() {
		System.out.println("actions");
	    
	}

	@When("I complete action")
	public void i_complete_action() {
	   System.out.println("complete actions");
	}

	@Then("I finish")
	public void i_finish() {
	  System.out.println("end");
	}



}
