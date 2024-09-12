package com.pages;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class BasePage {

	WebDriver driver;
	WebDriverWait wait;
	SoftAssert softAssert = new SoftAssert();

	public BasePage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
		PageFactory.initElements(driver, this);
	}

	public void waitForElementToBeVisible(WebElement element) {
		try {
			wait.until(ExpectedConditions.visibilityOf((element)));
		} catch (Exception e) {
			throw e;
		}
	}

	public static void verifyLink(String url) {
		try {
			URL link = new URL(url);
			HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
			httpURLConnection.setConnectTimeout(3000); // Set connection timeout to 3 seconds
			httpURLConnection.connect();

			if (httpURLConnection.getResponseCode() == 200) {
				System.out.println(url + " - " + httpURLConnection.getResponseMessage());
			} else {
				System.out.println(url + " - " + httpURLConnection.getResponseMessage() + " - " + "is a broken link");
				Reporter.log(url + " - " + httpURLConnection.getResponseMessage() + " - " + "is a broken link");
			}
		} catch (Exception e) {
			System.out.println(url + " - " + "is a broken link");
			Reporter.log(url + " - " + "is a broken link");
		}
	}

	public String getAttributeFromPresentElement(WebElement element, String attributeName) {
		waitForElementToBeVisible(element);
		String attributeValue = element.getAttribute(attributeName);
		return (attributeValue != null) ? attributeValue.trim() : "";
	}

	public String getAttributeFromPresentElementWithOutissible(WebElement element, String attributeName) {
		// waitForElementToBeVisible(element);
		String attributeValue = element.getAttribute(attributeName);
		return (attributeValue != null) ? attributeValue.trim() : "";
	}

	public void doubleClick(WebElement we) {
		Actions action = new Actions(driver);
		waitForElementToBeVisible(we);
		action.doubleClick(we).build().perform();
	}

	public void refreshCurrentUrl() {
		driver.navigate().refresh();
	}

	public void clickElement(WebElement element) {
		waitForElementToBeVisible(element);
		element.click();
	}

	public void selectTagByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);

	}

	public void selectTagByText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	public void selectTagByvalue(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByValue(text);
	}

	public Boolean isElementVisible(WebElement element) {
		if (element != null) {
			try {
				wait.until(ExpectedConditions.visibilityOf(element));
				return true;
			} catch (Exception ex) {
				System.out.println("Exception occured in Selenium Actions: Message: " + ex.getMessage());
				return false;
			}
		}
		return false;
	}

	public int countNumberOfaluesInSelectDropDown(WebElement element) {
		Select se = new Select(element);
		List<WebElement> l = se.getOptions();
		return l.size();
	}

	public void printAllTextaluesInSelectDropDown(WebElement element) {
		Select se = new Select(element);
		List<WebElement> l = se.getOptions();
		for (int i = 0; i <= l.size() - 1; i++) {
			String textValues = l.get(i).getText();
			System.out.println(textValues);
			Reporter.log("Text values are - " + textValues);
		}
	}

	public void ClickdropDown(WebElement element) {
		Select se = new Select(element);
		List<WebElement> l = se.getOptions();
		for (int i = 1; i <= l.size() - 1; i++) {
			l.get(i).click();

		}
	}

	public boolean isTextPresentOnPage(String expectedText) {
		return (!driver.findElements(By.xpath("//*[contains(text(),'" + expectedText + "')]")).isEmpty());
	}

	public void scrollToPageBottom() {
		Reporter.log("Scroll to page bottom");
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	public void waitToLoad() {
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

}
