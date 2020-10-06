package packAuto1;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAllert {

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
		driver.get("https://www.demoqa.com/alerts");
		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();
		Thread.sleep(1000);
		//Actions builder = new Actions(driver);
		
	    ((JavascriptExecutor) driver).executeScript("scroll(0,300)");
	    
		WebElement element= driver.findElement(By.xpath("//button[@id='alertButton']"));
		element.click();
		Thread.sleep(1000);
		Alert alert = driver.switchTo().alert();
		String alertMessage= driver.switchTo().alert().getText();		
 		
	        // Displaying alert message		
	    System.out.println(alertMessage);	
	    Thread.sleep(3000);
	        		
	        // Accepting alert		
	    alert.accept();		
	    Thread.sleep(3000);
	    WebElement ele =driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		ele.click();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		 
        // Wait for Alert to be present
 
        Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());
 
        System.out.println("Either Pop Up is displayed or it is Timed Out");
        String Message= driver.switchTo().alert().getText();
        System.out.println(Message);	
 
        // Accept the Alert
        Thread.sleep(2000);
 
        myAlert.accept();
 
        System.out.println("Alert Accepted");
        
		Thread.sleep(1000);
		WebElement el = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		el.click();
		Thread.sleep(1000);
		Alert allert = driver.switchTo().alert();
		String alertMsg= driver.switchTo().alert().getText();		
 		
	        // Displaying alert message		
	    System.out.println(alertMsg);
	    
	    Thread.sleep(1000);
	    allert.accept();
	    
	 
	    Thread.sleep(1000);
	    
	    WebElement MyElement = driver.findElement(By.xpath("//button[@id='promtButton']"));
	    MyElement.click();
	    Thread.sleep(5000);
	    
	    Alert Dalert = driver.switchTo().alert();
		String alerttext= Dalert.getText();		
 		
	        // Displaying alert message		
	    System.out.println(alerttext);
	    Dalert.sendKeys("Nduka");
	    Thread.sleep(1000);
	    Dalert.accept();
	    Thread.sleep(5000);
	    driver.close();		

	}

}
