package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * Helper Class containing methods to SetUp, Launch and Quit Browser Driver
 */
public class Helper {

//	public WebDriver driver;

	// Constructor method to instantiate the driver in all dependent test classes
//	public WebDriver getDriver() {
//		return driver;
//	}
	protected  WebDriver driver;

	// method to read a properties file
	public Properties propLoader() {
		Properties props = new Properties();
		String PATH = System.getProperty("user.dir") + "\\src\\properties\\data.properties";
		System.out.println(PATH);
		try {
			FileInputStream propsFile = new FileInputStream(PATH);
			props.load(propsFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return props;
	}

	// method to launch the browser
	public void browserLauncher(String typeOfBrowser) {
		if (typeOfBrowser.equals("chrome")) {
			WebDriverManager.chromedriver().setup(); // <-- Setting up chrome
			driver = new ChromeDriver();
		} else if (typeOfBrowser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();// <-- Setting up firefox
			driver = new FirefoxDriver();
		}
	}

	public void browserCloser() {
		if (driver != null) {
			driver.quit();
		}
	}

}
