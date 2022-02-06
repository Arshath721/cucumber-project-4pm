package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.userlab.UtilityBaseClass;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends UtilityBaseClass {

	@Given("User must be in facebook login page")
	public void user_must_be_in_facebook_login_page() {
		launchUrl("https://www.facebook.com/");
	}

	@When("User enter invalid username and invalid password")
	public void user_enter_invalid_username_and_invalid_password(DataTable d) {

		WebElement username = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));

		List<Map<String, String>> maps = d.asMaps();
		Map<String, String> map2 = maps.get(1);
		String nameValue = map2.get("usernameKey");

		Map<String, String> map1 = maps.get(0);
		String passValue = map1.get("passKey");

		fill(username, nameValue);
		fill(password, passValue);

	}

	@When("User click login button")
	public void user_click_login_button() throws InterruptedException {
		WebElement loginBtn = driver.findElement(By.name("login"));
		loginBtn.click();
		Thread.sleep(3000);
		System.out.println("data table scenario");

	}

	@Then("User must be in invalid page")
	public void user_must_be_in_invalid_page() {
		System.out.println("ivalid page");

	}

	@When("User click forgot password link")
	public void user_click_forgot_password_link() {
		WebElement forgotBtn = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		forgotBtn.click();

	}

	@When("User enter value to text feild and click search button")
	public void user_enter_value_to_text_feild_and_click_search_button() {
		WebElement textBox = driver.findElement(By.id("identify_email"));
		fill(textBox, "6543210987");

		WebElement searchBtn = driver.findElement(By.id("di_submit"));
		searchBtn.click();
	}

	@Then("User must be in identify your account page")
	public void user_must_be_in_identify_your_account_page() {
		System.out.println("identify your account page");
		System.out.println("forgot password scenario");
	}

}
