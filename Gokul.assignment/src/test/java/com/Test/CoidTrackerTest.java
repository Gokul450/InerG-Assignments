package com.Test;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.pages.CovidTrackerPage;

public class CoidTrackerTest extends BaseClass {

	@Test(priority = 0)
	public void verifyWebPageLoadProperly() {
		CovidTrackerPage pageTest = new CovidTrackerPage(driver, wait);

		Reporter.log(
				"*******************Test Description Covid-001 - Verify the web page loaded properly    **************************************");
		// Open Url
		Reporter.log("Open Url");
		Assert.assertTrue(pageTest.urlIsPerfectlyLoaded());
		Reporter.log("Open Url - Test Passed");

		// Verify the page is loaded with the title of COVID-19 Tracker - India
		Reporter.log("Verify the page is loaded with the title of COVID-19 Tracker - India");
		String actualText = pageTest.pageTitleIsPresent();
		Assert.assertTrue(expectedPageTitleText.equals(actualText));
		Reporter.log("Verify the page is loaded with the title of COVID-19 Tracker - India - Test Passed");

		Reporter.log("verify the non location specified map is shown in base page");
		Assert.assertTrue(pageTest.urlIsPerfectlyLoaded() & pageTest.mapMarkerNotDisplayed());
		Reporter.log(" Map is shown in base page- test Passed");
		Reporter.log("*****************End of Test**************************************************************");
	}

	@Test(priority = 1)
	/*
	 * Test Task - The automation should be implemented using Selenium WebDriver
	 * with any framework, and the Page Object Model (POM) design pattern should be
	 * applied. Use the "Select" class function to select a state, and ensure the
	 * function is defined in the base class. Use a "for loop" to print the values
	 * at each point from the Line Chart Representation Plot.
	 */
	public void verifythedropDown() throws Throwable {
		CovidTrackerPage pageTest = new CovidTrackerPage(driver, wait);

		Reporter.log(
				"*******************Test Description Covid-002 - Verify the drop down    **************************************");
		// Open Url
		Reporter.log("Open Url");
		Assert.assertTrue(pageTest.urlIsPerfectlyLoaded());
		Reporter.log("Open Url - Test Passed");

		// Verify Dropdown Elements
		Reporter.log(" Click dropdown");
		Assert.assertTrue(pageTest.urlIsPerfectlyLoaded());
		Reporter.log(" Dropdown Enlarged - Test Passed");
		Assert.assertTrue(pageTest.selectTagDropDownBoxAndVerify());
		Reporter.log("DropDown Box is expanded- Test Passed");

		// Verify the 28 states field available in the drop down box
		Reporter.log("Verify the 29 states field available in the drop down box");
		int actualValue = pageTest.getDropDownSizes();
		System.out.println(actualValue);
		Assert.assertTrue(expectedStateCount == actualValue);
		Reporter.log("Verified the 29 states field available in the drop down box - Test Passed with ActualValue - "
				+ actualValue);

		Reporter.log("Click each & every field & verify the statiscs is updated for the every field");
		pageTest.printDropDowntextValues();
		pageTest.verifyEachAndEveryDropDown();
		Reporter.log(
				"Clicked each & every field & verified the statiscs is  getting updated for the every field - Test Passed");
		Reporter.log("*****************End of Test**************************************************************");
	}

	@Test(priority = 2)

	public void verifyFooterElements() throws Throwable {
		CovidTrackerPage pageTest = new CovidTrackerPage(driver, wait);

		// Open Url
		Reporter.log(
				"*******************Test Description Covid-003 - Verify the footer elements   **************************************");
		Reporter.log("Open Url");
		Assert.assertTrue(pageTest.urlIsPerfectlyLoaded());
		Reporter.log("Open Url - Test Passed");

		// Verify footer Elements
		pageTest.scrollDown();
		Reporter.log("Verify footer Elements displayed");
		Assert.assertTrue(pageTest.footerElementsvisible());
		Reporter.log(" footer Elements displayed -" + "Test Passed");
		Reporter.log("Click lealet ");
		String ActualTitleLeaflet = pageTest.clickAnderifyleafletLink();
		Assert.assertTrue(expectedPageTitleLeaflet.equals(ActualTitleLeaflet));
		Reporter.log("Navigated to the leaflet page -" + "Test Passed with Title - " + ActualTitleLeaflet);

		driver.navigate().back();
		Reporter.log("Click Openstreetmap ");
		String ActualTitleopenStreetMap = pageTest.clickAnderifyopenStreetMap();
		Assert.assertTrue(expectedPageTitleOpenStreetMap.equals(ActualTitleopenStreetMap));
		Reporter.log(
				"Navigated to the Open Street Map -" + "Test Passed with Title - " + expectedPageTitleOpenStreetMap);
		Reporter.log("*****************End of Test**************************************************************");
	}

	@Test(priority = 3)

	public void verifyPieChart() throws Throwable {
		CovidTrackerPage pageTest = new CovidTrackerPage(driver, wait);

		// Open Url
		Reporter.log(
				"*******************Test Description Covid-006 -Verify the Pie chart   **************************************");
		Reporter.log("Open Url");
		Assert.assertTrue(pageTest.urlIsPerfectlyLoaded());
		Reporter.log("Open Url - Test Passed");

		// click random state options
		Reporter.log("Click random state  ");
		pageTest.clickRandomDropDownvalues();

		Reporter.log(" Verify Pie chart is displayed");
		pageTest.piechartDisplayed();
		Reporter.log(" Pie chart is displayed - Test Passed");

		Reporter.log(" Verify Total function");
		pageTest.totalFunctionValidation();
		pageTest.recoeredFunctionValidation();
		pageTest.actieCasesFunctionValidation();
		pageTest.death();
		Reporter.log("*****************End of Test**************************************************************");
	}

// Zoom In & Zoom out functionalities elements are dyanamic - so validation is not possible - Iam just only executing with out verifing
	@Test(priority = 4)
	public void verifyZoomoutandZoomIn() throws Throwable {
		CovidTrackerPage pageTest = new CovidTrackerPage(driver, wait);

		// Open Url
		Reporter.log(
				"*******************Test Description Covid-007 - Verify  Zoom out and Zoom In Functions  in map  **************************************");
		Reporter.log("Open Url");
		Assert.assertTrue(pageTest.urlIsPerfectlyLoaded());
		Reporter.log("Open Url - Test Passed");

		// click random state options
		Reporter.log("Click random state  ");
		pageTest.clickRandomDropDownvalues();

		// scroll down to map
		Reporter.log("Verify Zoom In and Zoom out Functionalities");
		pageTest.scrollDown();
		pageTest.zoomInFunctionalities();
		pageTest.ZoomoutFunctionalities();
		Reporter.log("*****************End of Test**************************************************************");

	}

	@Test(priority = 5)
	public void VerifyAllpagelinks() throws Throwable {
		CovidTrackerPage pageTest = new CovidTrackerPage(driver, wait);

		// Open Url
		Reporter.log(
				"*******************Test Description Covid-009 - Verify  All page links   **************************************");
		Reporter.log("Open Url");
		Assert.assertTrue(pageTest.urlIsPerfectlyLoaded());
		Reporter.log("Open Url - Test Passed");

		// click random state options
		Reporter.log("verfifing And iterating all links");
		pageTest.iteratingAllLinks();
		Reporter.log("*****************End of Test**************************************************************");

	}

}
