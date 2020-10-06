package Pages;


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class ParentPage {
  
  private static final int TIMEOUT = 5;
	private static final int POLLING = 100;

	static WebDriver driver;
	private WebDriverWait wait;

	public ParentPage(WebDriver driver) {
		ParentPage.driver = driver;
		wait = new WebDriverWait(driver, TIMEOUT, POLLING);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, TIMEOUT), this);
	}

	/**
	 * This method hover over element
	 */

	protected void HoverOverElement(By locator) {
		WebElement element;
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		new Actions(driver).moveToElement(element).build().perform();
	}

	/**
	 * This method waits for the element to load on the page
	 * 
	 */

	protected void waitForElementToAppear(By locator) throws Throwable {
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	/**
	 * This method waits for the element to load on the page and then click
	 * 
	 */
	protected void getElementAndClick(By locator) throws Throwable {
		WebElement element;
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		element.click();
	}

	/**
	 * This method waits for the element to appear and then enters text into text
	 * field
	 */
	protected void getElementAndEnter(By locator, String text) throws Throwable {
		WebElement element;
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		element.sendKeys(text);
	}

	/**
	 * This method asserts that text present on the page is the same as should be
	 */
	protected void getPageTitle(String text) {
		waitForLoad( driver);
		assertEquals(driver.getTitle(), text);
	}

	/*
	 * This method waits while page has been loaded
	 */
	private void waitForLoad(WebDriver driver) {

		ExpectedCondition<Boolean> pageLoadCondition = new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
			}
		};

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(pageLoadCondition);
	}

}
