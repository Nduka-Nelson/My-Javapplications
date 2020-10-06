package packAuto1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TextBox {

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
		driver.get("https://www.demoqa.com/text-box");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//username
		WebElement el= driver.findElement(By.xpath("//input[@id='userName']"));
		if(el.isEnabled())
		{
			
			el.sendKeys("eluemeln");
		}
		//email
		WebElement e= driver.findElement(By.xpath("//input[@id='userEmail']"));
		if(e.isEnabled()&& e.isEnabled())
		{
			e.sendKeys("ndk996@yahoo.ca");
		}
		//current address
		WebElement a= driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		if(a.isEnabled())
		{
			
			a.sendKeys("3236"+" "+"Urn"+" "+"Road Toronto");
		}
		//permanent address
		WebElement b= driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
		if(b.isEnabled())
		{
			b.sendKeys("323"+" "+"Manitoba"+" "+"Road Ottawa");
			
		}
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)");
		WebElement c= driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
		if(c.isDisplayed()&& c.isEnabled())
		{
			c.click();
			
		}
		//String y = el.getText();
		
		List<WebElement>PItems = driver.findElements(By.tagName("p"));
		//for(WebElement w:PItems)
		WebElement res;
		for(int i = 0;i<PItems.size();i++)
		{
			
			 res = PItems.get(i);
			 String val = res.getText();
			 if (val.equals("Name:eluemeln"))
			 {
				 System.out.println("test Passed");
				 
				 
			 }
			
			 else
			 {
				 System.out.println("test failed");
			 }
			
			
		} 
		
		
		 Thread.sleep(5000);
		driver.close();

	}

}
