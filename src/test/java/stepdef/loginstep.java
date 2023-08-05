package stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginstep {
	@Given("I am in the login page of netflix")
	public void i_am_in_the_login_page_of_netflix() {	
	System.out.println("Given function excicuted");
	}

	@When("I enter the username and password")
	public void i_enter_the_username_and_password() {
		System.out.println("When function excicuted"); 
	}

	@And("click the signin button")
	public void click_the_signin_button() {
		System.out.println("And function excicuted");  
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		System.out.println("Then function excicuted"); 
	}



}
