package packAuto1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Map<String,Object>prefs = new HashMap<String,Object>();	
		prefs.put("profile.default_content_setting_values.notifications",2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe" );
		System.setProperty("webdriver.firefox.driver","C:\\SeleniumDrivers\\geckodriver.exe");
		
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.demoqa.com/radio-button");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		 List<WebElement> Choice = driver.findElements(By.tagName("label"));
		 
		 System.out.println("You have selected : ");
		  for(int i=0;i<=Choice.size()-1;i++)
		  {
			  WebElement val = Choice.get(i);
			  if(val.isEnabled()&& val.isDisplayed())
			  {
				  
				  val.click();
				  String value = val.getText();
				  System.out.println(value);
				  break;
			  } 
			  //String value = val.getText();
			  //System.out.println(value);
		  }
		  Thread.sleep(5000);
		  driver.close();

	}

}
