package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.userlab.UtilityBaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition2 extends UtilityBaseClass {

	@Given("User must be in FB login page")
	public void user_must_be_in_FB_login_page() {
		launchUrl("https://www.facebook.com/");
	}

	@When("User enter values to the emailfield {string} and passwordfield {string}")
	public void user_enter_values_to_the_emailfield_and_passwordfield(String emailValue, String passValue) {
		WebElement username = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));

		fill(username, emailValue);
		fill(password, passValue);

	}

	@When("User clicked login btn")
	public void user_cliked_login_btn() {
		WebElement loginBtn = driver.findElement(By.name("login"));
		
	}

	@Then("User validate and quit the browser")
	public void user_validate_and_quit_the_browser() {
		System.out.println("scenario outline ");
		
	}

}
