package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;


public class ChildPage extends ParentPage {
	
	public ChildPage(WebDriver driver) {
		super(driver);
	}

	 private static By Products = By.xpath("//a[@id='td-desktop-nav-dropdown-link-2']/span[1]");
	 private static By Accounts = By.linkText("Accounts");
	 private static By CreditCards = By.linkText("Credit Cards");

	public void hoverOverProducts() {
		HoverOverElement(Products);
		Reporter.log("hover over product");
	}

	public void clickOnAccounts() throws Throwable {
		getElementAndClick(Accounts);
		Reporter.log("click on account");
	}

	public void clickOnCreditCards() throws Throwable {
		getElementAndClick(CreditCards);
		Reporter.log("Click on credit card");
	}

	public void assertAccountPage(String accountsPageTitle) {
		getPageTitle(accountsPageTitle);
		Reporter.log("check if both the pages are correct");
	}

	public void assertCreditCardsPage(String creditCardsPageTitle) {
		getPageTitle(creditCardsPageTitle);
		Reporter.log("credit card page asserted");
	}

	
	
  
  
}
