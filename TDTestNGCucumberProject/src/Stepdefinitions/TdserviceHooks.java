package Stepdefinitions;

import java.io.IOException;
import java.util.Properties;



import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.TdHelper;


public class TdserviceHooks  {
  
  

	TdHelper helper;

	@Before(order = 1)
	public void initializeTest() throws IOException {
		helper = new TdHelper();
		Properties p = helper.loadData();
		try {
			TdHelper.OpenBrowser(p.getProperty("browser"));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@After
	public void killTest() {
     helper.CloseBrowser();;
	}
}
