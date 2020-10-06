package stepdefenitions;

import java.util.concurrent.TimeUnit;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.TDsmallBusinessAccount;
import utility.Helper;

public class loginStepDefinition extends Helper {

	TDsmallBusinessAccount td = new TDsmallBusinessAccount(driver);

	@Given("^the is on \"([^\"]*)\"$")
	public void the_is_on(String arg1) throws Throwable {
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		driver.manage().window().maximize();

		driver.get(propLoader().getProperty("url"));
	}

	@Then("^the user hover over Products$")
	public void the_user_hover_over_Products() throws Throwable {
		td.hoverOverProducts();
	}

	@Then("^the user clicks on Accounts$")
	public void the_user_clicks_on_Accounts() throws Throwable {
		td.clickOnAccounts();
	}

	@Then("^the user should be able navigate to Account page$")
	public void the_user_should_be_able_navigate_to_Account_page() throws Throwable {
		td.assertAccountPage(propLoader().getProperty("accountsPage"));
	}

	@Then("^the user clicks on Credit Cards$")
	public void the_user_clicks_on_Credit_Cards() throws Throwable {
		td.clickOnCreditCards();
	}

	@Then("^the user should be able navigate to Credit Cards page$")
	public void the_user_should_be_able_navigate_to_Credit_Cards_page() throws Throwable {
		td.assertAccountPage(propLoader().getProperty("creditCardsPage"));
	}

}
