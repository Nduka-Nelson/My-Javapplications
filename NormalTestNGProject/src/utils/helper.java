package utils;

import java.io.File;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Reporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import tests.hooks;

public class helper extends hooks {
	 protected static WebDriver driver;
	
	public static Properties loadData() throws IOException
	  {
		 Properties properties = new Properties();
		  File f =  new File(System.getProperty("user.dir")+"\\src\\property\\Tdtest.properties");
		  FileReader Obj =new FileReader(f);
		
		  properties.load(Obj);
	
		return properties;
	  }
	 
	public static void OpenBrowser(String browser) throws InterruptedException
	{
		Map<String,Object>prefs = new HashMap<String,Object>();	//disable notification
		prefs.put("profile.default_content_setting_values.notifications",2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		
		
		//System.setProperty("webdriver.chrome.driver",path+"\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe" );
		//System.setProperty("webdriver.firefox.driver","C:\\SeleniumDrivers\\geckodriver.exe");
		
		// Cross Browser testing 
		Thread.sleep(2000);
		if(browser.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(options);
		
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
	
			driver = new FirefoxDriver();
		}
		
		else if(browser.equalsIgnoreCase("ie"))
		{
			WebDriverManager.iedriver().setup();
		
			driver = new InternetExplorerDriver();
		}
		
		else if(browser.equalsIgnoreCase("opera"))
		{
			WebDriverManager.operadriver().setup();
		
			driver = new OperaDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
		
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
				
	}
	
	
	
	public void CloseBrowser() {
//		if (driver==null) {
			driver.quit();
			Reporter.log("=====Browser Session End=====", true);
	}
	//   constructor class for driver instantiation
	public WebDriver getDriver() {
		return driver;
	}
	
 
}
