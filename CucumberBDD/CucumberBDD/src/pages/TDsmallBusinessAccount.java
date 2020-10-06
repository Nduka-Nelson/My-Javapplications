package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TDsmallBusinessAccount extends Base {

	

	public TDsmallBusinessAccount(WebDriver driver) {
		super(driver);
	}

	By Products = By.xpath("//a[@id='td-desktop-nav-dropdown-link-2']/span[1]");
	By Accounts = By.xpath("//a[text()='Accounts']");
	By CreditCards = By.xpath("//a[text()='Credit Cards']");

	public void hoverOverProducts() {
		hoverOverElement(Products);
	}

	public void clickOnAccounts() throws Throwable {
		getElementAndClick(Accounts);
	}

	public void clickOnCreditCards() throws Throwable {
		getElementAndClick(CreditCards);
	}

	public void assertAccountPage(String accountsPageTitle) {
		GetPageTitle(accountsPageTitle);
	}

	public void assertCreditCardsPage(String creditCardsPageTitle) {
		GetPageTitle(creditCardsPageTitle);
	}

}
