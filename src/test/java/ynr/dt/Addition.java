package ynr.dt;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Addition extends WebDriverUtils{
	int sum;
	@Given("when i add {int},{int}")
	public void when_i_add(int a , int b) {
		sum = a+b;
	}

	@Then("sum is {int}")
	public void sum_is(int number) {
		if(number == sum ) {
			System.out.println("Test pased");
		}
		else {
			System.out.println("Test failed");

		}
	}
		
		@When("i open baseURL")
		public void i_open_base_url() {
			invokeBrowser();
		}
		
	}


	

