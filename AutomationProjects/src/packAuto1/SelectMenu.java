package packAuto1;

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
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class SelectMenu {

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
		driver.get("https://www.demoqa.com/select-menu");
		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();
		Thread.sleep(1000);
		//Actions builder = new Actions(driver);
		
	    ((JavascriptExecutor) driver).executeScript("scroll(0,150)");
	   // Select let = new Select(driver.findElement(By.xpath("//select[@id='react-select-2-input']")));
	    //let.selectByVisibleText("Group 1, option 2");
	    Thread.sleep(2000);
	    Select ele = new Select(driver.findElement(By.xpath("//select[@id='oldSelectMenu']")));
		ele.selectByIndex(3);
	   // WebElement el=driver.findElement(By.xpath("//*[@id=\"withOptGroup\"]/div/div[1]"));
	    //Assert.assertTrue(message, condition);
	    //el.click();
	    
	    Thread.sleep(1000);
	    Select let = new Select(driver.findElement(By.xpath("//select[@id='cars']")));
		let.selectByValue("saab");
		
	    
	  //  driver.findElement(By.xpath("//*[@type ='text']")).click();
	   Thread.sleep(2000);
	  List< WebElement> col = driver.findElements(By.xpath("//div[@id ='selectOne']/div/div/div"));
	  (( JavascriptExecutor)driver).executeScript("arguments[0].scrollinto(true);", col.get(2));
	   
	   
	  
	  WebElement multi = driver.findElement(By.xpath("//div[@class='css-1rhbuit-multiValue']"));
	  multi.click();


	    
	    
	  
	  

	}

}
