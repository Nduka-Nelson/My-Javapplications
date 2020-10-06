package Stepdefinitions;




import Pages.Tdsmallbusiness;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.TdHelper;



public class TdStepDefs extends TdHelper  {
	Tdsmallbusiness Td = new Tdsmallbusiness(driver);
	
	@Given("^the is  user  is on \"([^\"]*)\"$")
	public void the_is_user_is_on(String arg1) throws Throwable {
		driver.get(loadData().getProperty("url"));
	   
	}

	@Then("^the user hover over Products$")
	public void the_user_hover_over_Products() throws Throwable {
		Td.hoverOverProducts();
	}

	@When("^the user clicks on Accounts$")
	public void the_user_clicks_on_Accounts() throws Throwable {
		Td.clickOnAccounts();
	}

	@Then("^the user should be able navigate to Account page$")
	public void the_user_should_be_able_navigate_to_Account_page() throws Throwable {
		Td.assertAccountPage(loadData().getProperty("AccountsPage"));
	}

	@When("^the user clicks on Credit Cards$")
	public void the_user_clicks_on_Credit_Cards() throws Throwable {
	    Td.clickOnCreditCards();
	}

	@Then("^the user should be able navigate to Credit Cards page$")
	public void the_user_should_be_able_navigate_to_Credit_Cards_page() throws Throwable {
		Td.assertCreditCardsPage(loadData().getProperty("CreditCardsPage"));
	} 
  

}
