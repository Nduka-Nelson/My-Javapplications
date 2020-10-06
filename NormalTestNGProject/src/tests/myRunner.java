package tests;






import org.testng.annotations.Test;

import Pages.ChildPage;
import utils.helper;


public class myRunner  extends helper {
	
	
	/*@Test(groups = { "Smoke" })
	public void LunchSite() throws IOException
	{
		driver.get(loadData().getProperty("url"));
		
	}*/
	
	
	@Test(groups = { "Functional" })
	public void RunAllTests() throws Throwable
	{	
		driver.get(loadData().getProperty("url"));
		ChildPage D = new ChildPage(driver);
		
		D.hoverOverProducts();
		D.clickOnAccounts();
		D.assertAccountPage(loadData().getProperty("AccountsPage"));
		
		//D.clickOnCreditCards();
		D.clickOnCreditCards();
		
		D.assertCreditCardsPage(loadData().getProperty("CreditCardsPage"));
	
	}
	

	
  
}
