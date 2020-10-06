package packAuto1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LinkText {

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
		driver.get("https://www.demoqa.com/links");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		List<WebElement> texts = driver.findElements(By.tagName("p"));
		int len = texts.size();
		System.out.println("The total number of links is: "+len);
		System.out.println("The links are as  follows");
		for(WebElement w: texts)
		 {
			 String val = w.getText();
			 System.out.println(val);
		 } 
		 Thread.sleep(2000);
		// driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+ "t");
		 ArrayList<String>Tabs = new ArrayList<String>(driver.getWindowHandles());
		 driver.findElement(By.xpath("//*[@id=\"facebook\"]")).sendKeys(Keys.CONTROL+"t");
		 driver.switchTo().window(Tabs.get(1));
		 
		 
		 
		//*[@id="facebook"]
		 
		 
		 
		 
		 
		 
		 
		 
	
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 

	}
	
	
	
	

}
