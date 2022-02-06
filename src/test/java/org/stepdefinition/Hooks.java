package org.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.userlab.UtilityBaseClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends UtilityBaseClass {

	@Before("@regression")
	public void beforeRegressionScenarios() {
		System.out.println("before regression scenario==========");
	}

	@Before("@sanity")
	public void beforeSanityScenarios() {
		System.out.println("before sanity scenario==========");
	}

	@Before("@smoke")
	public void beforeSmokeScenarios() {
		System.out.println("before smoke scenario==========");
	}

	@Before(order = 5)
	public void beforeScenarios() {
		System.out.println("before scenario==========\n");
	}

	@Before(order = 1)
	public void stBrowser() {
		System.out.println("launch browser");
		launchBrowser();
	}

	@Before(order = 2)
	public void maxBrowser() {
		System.out.println("browser max");
		browserMaximize();

	}

	@Before(order = 4)
	public void waitTime() {
		System.out.println("imp wait");

	}

	@Before(order = 3)
	public void stTime() {
		System.out.println("st time");
		dateAndTime();

	}

	@After("@regression")
	public void afterRegressionScenarios() {
		System.out.println("=========after regression scenario");

	}

	@After("@sanity")
	public void afterSanityScenarios() {
		System.out.println("=========after sanity scenario");

	}

	@After("@smoke")
	public void afterSmokeScenarios() {
		System.out.println("=========after smoke scenario");

	}

	@After(order = 4)
	public void afterScenarios() {
		System.out.println("\n=========after scenario");

	}

	@After(order = 3)
	public void screenShotAuto(Scenario s) throws IOException {
		System.out.println("screen shot Auto");

		if (s.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot) driver;
			byte[] snap = ts.getScreenshotAs(OutputType.BYTES);

			s.embed(snap, "img/png");

		}

	}

	@After(order = 3)
	public void screenShotManual(Scenario s) throws IOException {
		System.out.println("screen shot Manual");

		if (s.isFailed()) {

			String name = s.getName();

			String scName = name.replace(' ', '_');

			takeSnap(scName);

		}

	}

	@After(order = 2)
	public void endTime() {

		System.out.println("end time");
		dateAndTime();

	}

	@After(order = 1)
	public void browserEnd() {

		System.out.println("quit browser\n");
		closeBrowser();

	}

}
