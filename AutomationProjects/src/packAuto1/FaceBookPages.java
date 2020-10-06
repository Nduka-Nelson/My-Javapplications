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
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class FaceBookPages {
	
	static WebDriver driver;
	@Test
	(groups = { "Regression" })
	
	//String Browser;

	public static void Facebookpage() throws InterruptedException {
		// TODO Auto-gen
		
		Map<String,Object>prefs = new HashMap<String,Object>();	
		prefs.put("profile.default_content_setting_values.notifications",2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe" );
		System.setProperty("webdriver.firefox.driver","C:\\SeleniumDrivers\\geckodriver.exe");
		
		
		driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ndk996@yahoo.ca");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Calgary36!");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//button[@name='login']")).click();
		//driver.findElement(By.xpath("//span[contains(text(),'Logout')]")).click();
		driver.findElement(By.partialLinkText("Log Out")).click();
		Thread.sleep(1000);

		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		WebElement b= driver.findElement(By.xpath("//div[contains(text(),'Sign Up')]"));
		String a =b.getText();
		String x = "Sign Up";
		if(a.equalsIgnoreCase(x))
		{
			System.out.println("test passed");
		}
		else {
			
			System.out.println("test failed");
		}
		System.out.println(a);
		System.out.println();
		Thread.sleep(1000);

		WebElement c= driver.findElement(By.xpath("//div[contains(text(),'s quick and easy.')]"));
		String y =c.getText();
		String z = "It's quick and easy";
		if(y.equalsIgnoreCase(z))
		{
			System.out.println("test passed");
			
		}
		else {
			
			System.out.println("test failed");
		}
		System.out.println(y);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("John");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Does");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("John178@yahoo.ca");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("John178@yahoo.ca");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Abcde56");
		
		
		
		Select select = new Select(driver.findElement(By.xpath("//select[@id='month']")));
		select.selectByVisibleText("Jun");
		
		Select sel = new Select(driver.findElement(By.xpath("//select[@id='day']")));
		sel.selectByIndex(18);
		
		Select let = new Select(driver.findElement(By.xpath("//select[@id='year']")));
		let.selectByValue("1995");
		
		//WebElement b = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
	    // Conclude a test
	    
		 List<WebElement> GenderList = driver.findElements(By.name("sex"));
		  String Value;
		  for(int i=0;i<GenderList.size();i++)
		  {
		    Value = GenderList.get(i).getAttribute("value");
		    
		    if(Value.equals("2"))
		      GenderList.get(i).click();
		
		  }
		  
		  driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		  Thread.sleep(3000);
		  
		  driver.findElements(By.xpath("//*[@id=\"checkpointBottomBar\"]/div[1]/button")).clear();
		  //driver.getWindowHandle();
		  Thread.sleep(5000);
		  //driver.switchTo().
		  driver.close();

	}

}
