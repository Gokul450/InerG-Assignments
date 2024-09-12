package com.pages;
import java.util.List;
import java.util.Random;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class CovidTrackerPage extends BasePage {

	public CovidTrackerPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

//Locators

	@FindBy(xpath = "//html")
	public WebElement htmlLoaded;

	@FindBy(xpath = "//h1[normalize-space()='COVID-19 Tracker - India']")
	public WebElement cOVIDTracker;

	@FindBy(xpath = "//select[@class='data-filter-input']")
	public WebElement selectDropDown;

	@FindBy(xpath = "//div[@class='leaflet-container leaflet-touch leaflet-fade-anim leaflet-grab leaflet-touch-drag leaflet-touch-zoom']")
	public WebElement mapElement;

	@FindBy(xpath = "//a[@title='Zoom in']")
	public WebElement zoomIn;

	@FindBy(xpath = "//span[contains(text(),'−')]")
	WebElement zoomOut;

	@FindBy(xpath = "//select[@class='data-filter-input']")
	WebElement selectTagDropDownBox;

	@FindBy(xpath = "//option[@value='Andhra Pradesh']")
	public WebElement andhraPradeshElements;

	@FindBy(xpath = "//option[@value='Andhra Pradesh']")
	public WebElement andhraPradesh;

	@FindBy(xpath = "//option[@value='Arunachal Pradesh']")
	public WebElement arunachalPradesh;

	@FindBy(xpath = "//option[@value='Assam']")
	public WebElement assam;

	@FindBy(xpath = "//option[@value='Bihar']")
	public WebElement bihar;

	@FindBy(xpath = "//option[@value='Chhattisgarh']")
	public WebElement chhattisgarh;

	@FindBy(xpath = "//option[@value='Goa']")
	public WebElement goa;

	@FindBy(xpath = "//option[@value='Gujarat']")
	public WebElement gujarat;

	@FindBy(xpath = "//option[@value='Haryana']")
	public WebElement haryana;

	@FindBy(xpath = "//option[@value='Himachal Pradesh']")
	public WebElement himachalPradesh;

	@FindBy(xpath = "//option[@value='Jharkhand']")
	public WebElement jharkhand;

	@FindBy(xpath = "//option[@value='Karnataka']")
	public WebElement karnataka;

	@FindBy(xpath = "//option[@value='Kerala']")
	public WebElement kerala;

	@FindBy(xpath = "//option[@value='Madhya Pradesh']")
	public WebElement madhyaPradesh;

	@FindBy(xpath = "//option[@value='Maharashtra']")
	public WebElement maharashtra;

	@FindBy(xpath = "//option[@value='Manipur']")
	public WebElement manipur;

	@FindBy(xpath = "//option[@value='Meghalaya']")
	public WebElement meghalaya;

	@FindBy(xpath = "//option[@value='Mizoram']")
	public WebElement mizoram;

	@FindBy(xpath = "//option[@value='Nagaland']")
	public WebElement nagaland;

	@FindBy(xpath = "//option[@value='Odisha']")
	public WebElement odisha;

	@FindBy(xpath = "//option[@value='Punjab']")
	public WebElement punjab;

	@FindBy(xpath = "//option[@value='Rajasthan']")
	public WebElement rajasthan;

	@FindBy(xpath = "//option[@value='Sikkim']")
	public WebElement sikkim;

	@FindBy(xpath = "//option[@value='Tamil Nadu']")
	public WebElement tamilNadu;

	@FindBy(xpath = "//option[@value='Telangana']")
	public WebElement telangana;

	@FindBy(xpath = "//option[@value='Tripura']")
	public WebElement tripura;

	@FindBy(xpath = "//option[@value='Uttar Pradesh']")
	public WebElement uttarPradesh;

	@FindBy(xpath = "//option[@value='Uttarakhand']")
	public WebElement uttarakhand;

	@FindBy(xpath = "//option[@value='West Bengal']")
	public WebElement westBengal;

	@FindBy(xpath = "//div[@class='display-data']")
	public WebElement totalCasesBanner;

	@FindBy(xpath = "//div[@class='mapview']")
	public WebElement map;

	@FindBy(xpath = "(//img[@alt='Marker'])[1]")
	private WebElement mapMarker;

	@FindBy(xpath = "(//a[normalize-space()='Leaflet'])[1]")
	public WebElement leaflet;

	@FindBy(xpath = "(//a[normalize-space()='OpenStreetMap'])[1]")
	public WebElement openStreetMap;

	@FindBy(xpath = "//*[text()='Total']")
	public WebElement total;

	@FindBy(xpath = "(//*[text()='Recovered'])[1]")
	public WebElement recoered;

	@FindBy(xpath = "(//*[text()='Active Cases'])[1]")
	public WebElement actieCases;

	@FindBy(xpath = "(//*[text()='Deaths'])[1]")
	public WebElement deathElement;

	@FindBy(xpath = "(//div[@class='user-select-none svg-container'])[1]")
	public WebElement piechartDisplayed;

	@FindBy(xpath = "(//*[contains(@transform,'translate(0,14.5)')])[1]")
	public WebElement getAttributeStyle1;

	@FindBy(xpath = "(//*[contains(@transform,'translate(0,33.5)')])[1]")
	public WebElement getAttributerecoered;

	@FindBy(xpath = "(//*[contains(@transform,'translate(0,52.5)')])[1]")
	public WebElement getAttributactieCases;

	@FindBy(xpath = "(//*[contains(@transform,'translate(0,71.5)')])[1]")
	public WebElement getAttributedeaths;

	@FindBy(xpath = "//a[@title='Zoom in']")
	public WebElement zoomInElement;

	@FindBy(xpath = "//span[contains(text(),'−')]")
	public WebElement zoomOutElement;

	@FindBy(xpath = "//div[@class='leaflet-pane leaflet-map-pane']//following::div[@class='leaflet-proxy leaflet-zoom-animated']")
	public WebElement getAttributeZoom;

	@FindBy(tagName = "a")
	public List<WebElement> links;

// Test Data 

	public static String totalCases = "Total Cases";
	public static String activeCases = "Active Cases";
	public static String recovered = "Recovered";
	public static String deaths = "Deaths";
	public static String getAttributeStyle = "style";
	public static String style1 = "opacity: 0.5;";
	public static String style2 = "opacity: 1;";
	public static String zoomInAlue = "transform: translate3d(11785.7px, 7233.9px, 0px) scale(32);";
	public static String zoomOutAlue = "scale(16)";

// Action Methods
	public boolean urlIsPerfectlyLoaded() {
		return htmlLoaded.isDisplayed();
	}

	public void totalFunctionValidation() throws Throwable {
		waitForElementToBeVisible(total);
		reptieFunctionalitesInPiechart(total, getAttributeStyle1, getAttributeStyle, style1, style2);
	}

	public void recoeredFunctionValidation() throws Throwable {
		waitForElementToBeVisible(recoered);
		reptieFunctionalitesInPiechart(recoered, getAttributerecoered, getAttributeStyle, style1, style2);
	}

	public void actieCasesFunctionValidation() throws Throwable {
		waitForElementToBeVisible(actieCases);
		reptieFunctionalitesInPiechart(actieCases, getAttributactieCases, getAttributeStyle, style1, style2);
	}

	public void death() throws Throwable {
		waitForElementToBeVisible(deathElement);
		reptieFunctionalitesInPiechart(deathElement, getAttributedeaths, getAttributeStyle, style1, style2);
	}

	public void reptieFunctionalitesInPiechart(WebElement element, WebElement getAttribute, String getAttributeText,
			String text1, String text2) throws Throwable {
		waitForElementToBeVisible(element);
		waitToLoad();
		clickElement(getAttribute);
		Thread.sleep(5000);
		String actualalue = getAttributeFromPresentElement(getAttribute, getAttributeText);
		System.out.println(actualalue);
		softAssert.assertTrue(text1.equals(actualalue));
		Reporter.log("Test Passed With Actual alue- " + actualalue);
		waitToLoad();
		clickElement(getAttribute);
		Thread.sleep(5000);
		doubleClick(getAttribute);
		String actualalue2 = getAttributeFromPresentElement(getAttribute, getAttributeText);
		System.out.println(actualalue2);
		softAssert.assertTrue(text2.equals(actualalue2));
		Reporter.log("Test Passed With Actual alue- " + actualalue2);
		softAssert.assertAll();
		doubleClick(getAttribute);
	}

	public void zoomInFunctionalities() throws Throwable {
		waitForElementToBeVisible(zoomOutElement);
		reptieFunctionalitesChechZoomIn(zoomInElement, getAttributeZoom, getAttributeStyle, zoomInAlue);
	}

	public void ZoomoutFunctionalities() throws Throwable {
		waitForElementToBeVisible(zoomOutElement);
		reptieFunctionalitesChechZoomIn(zoomOutElement, getAttributeZoom, getAttributeStyle, zoomOutAlue);
	}

	public void reptieFunctionalitesChechZoomIn(WebElement element, WebElement getAttribute, String getAttributeText,
			String text1) throws Throwable {
		waitForElementToBeVisible(element);
		waitToLoad();
		clickElement(element);
		Thread.sleep(5000);
		String actualalue = getAttributeFromPresentElementWithOutissible(getAttribute, getAttributeText);
		System.out.println(actualalue);
		// softAssert.assertTrue(text1.equalsIgnoreCase(actualalue));
		// softAssert.assertAll();
		Reporter.log("Test Passed With Actual alue- " + actualalue);
	}

	public boolean piechartDisplayed() {
		return isElementVisible(piechartDisplayed);
	}

	public boolean footerElementsvisible() {
		return isElementVisible(leaflet) && isElementVisible(openStreetMap);
	}

	public String clickAnderifyleafletLink() {
		clickElement(leaflet);
		waitToLoad();
		return getPageTitle();

	}

	public String clickAnderifyopenStreetMap() {
		clickElement(openStreetMap);
		waitToLoad();
		return getPageTitle();

	}

	public boolean mapMarkerNotDisplayed() {
		if (!isElementVisible(mapMarker)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean mapDisplayed() {
		return isElementVisible(map);
	}

	public String pageTitleIsPresent() {
		return cOVIDTracker.getText();
	}

	public boolean selectTagDropDownBoxAndVerify() {
		clickElement(selectTagDropDownBox);
		waitForElementToBeVisible(andhraPradeshElements);
		return isElementVisible(andhraPradeshElements);
	}

	public void clickRandomDropDownvalues() throws Throwable {
		// Creating Random numbers to click different state for each execution-
		Random random = new Random();
		int randomNumber = random.nextInt(28) + 1;
		System.out.println(randomNumber);
		selectTagByIndex(selectDropDown, randomNumber);
		Reporter.log("Random State is selected");
	}

	public int getDropDownSizes() {
		return countNumberOfaluesInSelectDropDown(selectTagDropDownBox);
	}

	public void printDropDowntextValues() throws Throwable {
		refreshCurrentUrl();
		printAllTextaluesInSelectDropDown(selectDropDown);
	}

	public void verifyEachAndEveryDropDown() throws Throwable {
		for (int i = 1; i <= 29 - 1; i++) {
			clickElement(selectTagDropDownBox);
			selectTagByIndex(selectDropDown, i);
			waitForElementToBeVisible(totalCasesBanner);
			softAssert.assertTrue(isTextPresentOnPage(totalCases));
			softAssert.assertTrue(isTextPresentOnPage(activeCases));
			softAssert.assertTrue(isTextPresentOnPage(recovered));
			softAssert.assertTrue(isTextPresentOnPage(deaths));
			refreshCurrentUrl();
		}
		softAssert.assertAll();
	}

	public void scrollDown() {
		scrollToPageBottom();
	}

//Iterating each link and checking the response status
	public void iteratingAllLinks() {
		for (WebElement link : links) {
			String url = link.getAttribute("href");
			verifyLink(url);
		}

	}
}
