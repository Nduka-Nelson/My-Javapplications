package packAuto1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import junit.framework.Assert;



public class WebTable {
	
	 static WebDriver driver;
	// private static By col = By.xpath("//div[class='rt-tbody']/div/div/div[3]");
	 

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe" );
		System.setProperty("webdriver.firefox.driver","C:\\SeleniumDrivers\\geckodriver.exe");
		
		LunchSite();
		FillTableForm();

	}
	static void LunchSite()
	 {
			
			driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.navigate().to("https://www.demoqa.com/webtables");
			driver.manage().window().maximize();
	 }
	 static void FillTableForm() throws InterruptedException
	 {
		 
		  WebElement a =driver.findElement(By.xpath("//button[@id='addNewRecordButton']"));
		  a.click();
		  WebElement RegForm = driver.findElement(By.xpath("//div[contains(text(),'Registration Form')]"));
		  String actualText = RegForm.getText();
		  String Exptext = "Registration Form";
		  
		 // Assert.assertEquals(expText, actualText);
		  WebElement FirstName =driver.findElement(By.xpath("//input[@id='firstName']"));
		  FirstName.sendKeys("Nelson");
		  WebElement LastName =driver.findElement(By.xpath("//input[@id='lastName']"));
		  LastName.sendKeys("Chad");
		  WebElement Email =driver.findElement(By.xpath("//input[@id='userEmail']"));
		  Email.sendKeys("jacobson34@gmail.com");
		  WebElement Age =driver.findElement(By.xpath("//input[@id='age']"));
		  Age.sendKeys("37");
		  WebElement Salary =driver.findElement(By.xpath("//input[@id='salary']"));
		  Salary.sendKeys("5000");
		  WebElement Dept =driver.findElement(By.xpath("//input[@id='department']"));
		  Dept.sendKeys("Quality Assurance");
		  WebElement Button =driver.findElement(By.xpath("//button[@id='submit']"));
		  Button.submit();
		 
		  Thread.sleep(1000);
		  System.out.println("The size of the table");
		  List<WebElement>Row = driver.findElements(By.xpath("//div[@role='row']"));
		  int len = Row.size();
		  
		  System.out.println(len);
		  Thread.sleep(3000);
		  
		  Thread.sleep(1000);
		  for (int i =1; i<=len-1; i++ )
		  {
			  if(Row.isEmpty())
			  {
				  
				  break;
				  
			  }
			  else {
				  
				  String val = Row.get(i).getText();
				  System.out.println("|"+val);
				  
			  }
		  }
		 Thread.sleep(1000);
		System.out.println("extract the values in age coulmn ");
		List<WebElement> ages = driver.findElements(By.xpath("//div[@class='rt-tbody']/div/div/div[3]"));
		Thread.sleep(1000);
		for(WebElement e: ages)
		{
			  if(!e.getText().equalsIgnoreCase(null))
			  {
				  
				  System.out.println(e.getText()); 
			  }
				 
				
			 
			 
			
		}
		 
		
		 
		 
		
		 
		 
		 
		


	
		 
			  
		
			  
			  
			  
			  
			  
			  
		  
		 
	
	}
	 
	
	
	
	
	
	

}
