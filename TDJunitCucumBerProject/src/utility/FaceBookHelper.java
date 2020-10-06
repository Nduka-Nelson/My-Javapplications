package utility;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FaceBookHelper {
	static String url = "https://www.facebook.com/";
	static By email = By.xpath("//input[@id='email']");
	static By pswd =  By.xpath("//input[@id='pass']");
	static By LogB = By.xpath("//button[@name='login']");
	 
	 
	static WebDriver driver;
	public  static void OpenBrowser()
	{	
		Map<String,Object>prefs = new HashMap<String,Object>();	
		prefs.put("profile.default_content_setting_values.notifications",2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe" );
		System.setProperty("webdriver.firefox.driver","C:\\SeleniumDrivers\\geckodriver.exe");
	
	
		driver = new ChromeDriver(options);
		
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
	  
	}
	 public static void LunchSite()
	 {
		 
		 if ( url.isEmpty())
		 {
			 
			 driver.close();
		 }
		 driver.get(url);
		 
	 }
	 public static void Getemail() 
	 {
		 
		 WebElement myemail= driver.findElement(email);
		 if(myemail.isEnabled())
		 {
			 
			 myemail.sendKeys("ndk996@yahoo.ca");
			  
		 } 
		 
	 }
	 
	 public static void  GetPassword()
	 {
		 
		 WebElement pd = driver.findElement(pswd);
		 if(pd.isEnabled())
		 {
			 
			 pd.sendKeys("Ca");
			 
			 
		 }
		 
	 }
	
	public static void Login() throws InterruptedException
	
	{
		
		 WebElement Bt = driver.findElement(LogB);
		 if(Bt.getText().equalsIgnoreCase("Log In")&& Bt.isEnabled())
		 {
			 Bt.click();
			 
			 
		 }
		 
		 Thread.sleep(4000);
		 driver.close();
		
	}

	  
	
	
	
	
}
