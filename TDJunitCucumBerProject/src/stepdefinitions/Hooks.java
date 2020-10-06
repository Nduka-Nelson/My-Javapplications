package stepdefinitions;

import java.io.IOException;
import java.util.Properties;


import cucumber.api.java.Before;
import utility.TDhelper;

public class Hooks {
	

	TDhelper helper;

	@Before(order = 1)
	public void initializeTest() throws IOException {
		helper = new TDhelper();
		Properties p = helper.loadData();
		try {
			TDhelper.OpenBrowser(p.getProperty("browser"));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public void killTest() {
       helper.CloseBrowser();;
	}
}
