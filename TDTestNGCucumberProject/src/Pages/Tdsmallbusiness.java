package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Tdsmallbusiness extends TdBase {
  
	

	 public Tdsmallbusiness(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private static By Products = By.xpath("//a[@id='td-desktop-nav-dropdown-link-2']/span[1]");
	 private static By Accounts = By.linkText("Accounts");
	 private static By CreditCards = By.linkText("Credit Cards");

	public void hoverOverProducts() {
		HoverOverElement(Products);
		
	}

	public void clickOnAccounts() throws Throwable {
		getElementAndClick(Accounts);
	}

	public void clickOnCreditCards() throws Throwable {
		getElementAndClick(CreditCards);
	}

	public void assertAccountPage(String accountsPageTitle) {
		getPageTitle(accountsPageTitle);
	}

	public void assertCreditCardsPage(String creditCardsPageTitle) {
		getPageTitle(creditCardsPageTitle);
	}

  
}
