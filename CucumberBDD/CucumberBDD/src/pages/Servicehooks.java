package pages;

import java.io.IOException;
import java.util.Properties;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import utility.Helper;

public class Servicehooks {
	
	Helper helper;

	@Before(order = 1)
	public void initializeTest() throws IOException {
		helper = new Helper();
		Properties p = helper.propLoader();
		helper.browserLauncher(p.getProperty("typeOfBrowser"));
	}

	@After
	public void killTest() {
       helper.browserCloser();
	}

}
