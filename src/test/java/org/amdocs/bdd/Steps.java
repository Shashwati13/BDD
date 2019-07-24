package org.amdocs.bdd;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
 double result;
	Calculator calc=null;

	@Given("A calculator")
	public void a_calculator() {
		calc=new Calculator();
		
		
		
		
		
		
		
	}

	@When("the input is {string} and {string}")
	public void the_input_is_and(String string, String string2) {
	result=calc.addtion(Double.parseDouble(string), Double.parseDouble(string2));

	}

	@Then("the output is {string}")
	public void the_output_is(String expected) {
		assertEquals(Double.parseDouble(expected),result,0.00007);

	}


}
