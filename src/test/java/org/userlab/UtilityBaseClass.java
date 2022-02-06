package org.userlab;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UtilityBaseClass {
	public static WebDriver driver;

	public static WebDriver launchBrowser() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		return driver;
	}

	public static void closeBrowser() {
		driver.quit();

	}

	public static void launchUrl(String url) {
		driver.get(url);

	}

	public static void browserMaximize() {
		driver.manage().window().maximize();

	}

	public static void fill(WebElement element, String txt) {
		element.sendKeys(txt);

	}

	public static void BtnClick(WebElement element) {
		element.click();

	}

	public static void copyTxt() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);

	}

	public static void pasteTxt() throws AWTException {
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_CONTROL);
		r1.keyPress(KeyEvent.VK_V);

		r1.keyRelease(KeyEvent.VK_CONTROL);
		r1.keyRelease(KeyEvent.VK_V);

	}

	public static void keyTab() throws AWTException {
		Robot r2 = new Robot();
		r2.keyPress(KeyEvent.VK_TAB);
		r2.keyRelease(KeyEvent.VK_TAB);

	}

	public static void dateAndTime() {
		Date d = new Date();
		System.out.println(d);

	}

	public static void takeSnap(String name) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File perm=new File
		("E:\\eclipse Photon Project\\Cucumber3PmNew\\src\\test\\resources\\Screenshot\\"+name+".png");
		FileUtils.copyFile(temp, perm);

	}

}
