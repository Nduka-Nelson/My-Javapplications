package tests;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import utils.helper;



public class hooks {

	 helper help;

@BeforeTest
	public void initializeTest() throws IOException {
		help = new helper();
		Properties p = helper.loadData();
		try {
			 String ob = p.getProperty("browser");
			 helper.OpenBrowser(ob);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@AfterTest
	public void killTest() {
       help.CloseBrowser();
	}
}
