package com.Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	String covidTrackerUrl = "https://inerg-test.web.app/";
	String expectedPageTitleText = "COVID-19 Tracker - India";
	String expectedPageTitleLeaflet = "Leaflet - a JavaScript library for interactive maps";
	String expectedPageTitleOpenStreetMap = "Copyright and License | OpenStreetMap";
	int expectedStateCount = 29;
	WebDriver driver;
	WebDriverWait wait;
	Reporter reporter;

	@BeforeClass
	void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(covidTrackerUrl);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	@AfterTest
	void tearDown() {
		driver.quit();
	}

}
