package utils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterTest;


import io.github.bonigarcia.wdm.WebDriverManager;

public class TdHelper {
  
  
  protected static WebDriver driver;
	
	
  public Properties loadData() throws IOException
  {
	  
	 Properties props = new Properties();
	  File f =  new File(System.getProperty("user.dir")+"\\src\\propertyfiles\\Td.properties");
	  FileReader Obj = new FileReader(f);
	  props.load(Obj);
	return props; 
  }
  
  public static void OpenBrowser(String browser) throws InterruptedException
  {
	Map<String,Object>prefs = new HashMap<String,Object>();	//disable notifications
	prefs.put("profile.default_content_setting_values.notifications",2);
	ChromeOptions options = new ChromeOptions();
	options.setExperimentalOption("prefs", prefs);
	
	
	//System.setProperty("webdriver.chrome.driver",path+"\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe" );
	//System.setProperty("webdriver.firefox.driver","C:\\SeleniumDrivers\\geckodriver.exe");
	Thread.sleep(2000);
	//cross browser testing
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
  @AfterTest
	public void CloseBrowser() 
	{
//	if (driver==null) {
		driver.quit();

	}
  public WebDriver getDriver() {
		return driver;
	}
 
  
  
  
}
