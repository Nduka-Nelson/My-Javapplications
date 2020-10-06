package packAuto1;

import java.sql.Driver;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wigets {
	static WebDriver driver;
	@BeforeTest
	(groups = { "Smoke" })
	@Parameters("Browser")
	//String Browser;
	public static void SetUpBrowser() throws InterruptedException
	{
		
		Map<String,Object>prefs = new HashMap<String,Object>();	
		prefs.put("profile.default_content_setting_values.notifications",2);
		  ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		
        
		//System.setProperty("webdriver.chrome.driver",path+"\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe" );
		//System.setProperty("webdriver.firefox.driver","C:\\SeleniumDrivers\\geckodriver.exe");
		Thread.sleep(2000);
		if(BrowserType.CHROME.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(options);
		
		}
		else if(BrowserType.FIREFOX.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
	
			driver = new FirefoxDriver();
		}
		
		
	
		
	}
	@Test
	(groups = { "Integration" })
	
	public static void  GetWidget() throws InterruptedException
	{
		
		 //setup the chromedriver using WebDriverManager
        
		//System.setProperty("webdriver.chrome.driver",path+"\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe" );
		//System.setProperty("webdriver.firefox.driver","C:\\SeleniumDrivers\\geckodriver.exe");
		Thread.sleep(2000);
		
		
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.navigate().to("https://www.demoqa.com/auto-complete");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("scroll(0,300)");
			WebElement Auto = driver.findElement(By.xpath("//input[@id='autoCompleteMultipleInput']"));
		//Thread.sleep(2000);
			Auto.sendKeys(Keys.ENTER+"R");
			Auto.click();
			Thread.sleep(2000);
	
			WebElement SingleAuto = driver.findElement(By.xpath("//input[@id='autoCompleteSingleInput']"));
			SingleAuto.sendKeys("R",Keys.ENTER);
		
		
	}
	

	
	
	

}
