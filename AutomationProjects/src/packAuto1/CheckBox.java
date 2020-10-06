package packAuto1;

import java.util.HashMap;

import java.util.List;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;




public class CheckBox {

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
		driver.get("https://www.demoqa.com/checkbox");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement a = driver.findElement(By.xpath("//button[@class='rct-collapse rct-collapse-btn']")); 
		
		a.click();
		String b = driver.findElement(By.xpath("//label/span[@class='rct-title']")).getText();
		String Exp ="Home";
		if(b.equals(Exp))
		{
			System.out.println("test passed");
			
		}
		else
		{
			
			System.out.println("Test failed");
		}
		

		Assert.assertEquals(b, Exp);
		
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)");
		
	    // toggle desktop only	
		WebElement z= driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/button"));	
	    z.click();  
	    //z.clear();
	   Thread.sleep(10000);
	    //check document form only no toggle
	   	WebElement el= driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/span/label/span[3]"));	
	   	el.click();
	   	Assert.assertEquals( false,el.isSelected());
	   	System.out.println("Document is selcted,Assert is paased");
	   	//el.clear();
	   	Thread.sleep(10000);
	    //toggle and check  document folder 
	    WebElement x=  driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/span/button"));
	    x.click();
	     
	    
	    Thread.sleep(10000);
	   
	    
	    //toggle download only
	    WebElement y =  driver.findElement(By.xpath("//li[3]//span[1]//button[1]//*[local-name()='svg']"));	
	    y.click();
	    //y.clear();
	    
	    Thread.sleep(3000);
	    // to check  all download folders only
	    WebElement ele= driver.findElement(By.xpath("//li[3]//span[1]//label[1]//span[3]"));	
	    ele.click();
	    //ele.clear();
	    
	    
	    
	   
	    //WebElement e= driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/label/span[3]"));	
	    //e.click();
	   //e.clear();
	  
	    Thread.sleep(3000);
	  
	    /*List<WebElement> Obj =  driver.findElements(By.tagName("span"));
	    for (WebElement K : Obj)
	    {
	    	
	    	String Z = K.getText();
	    	System.out.println(Z);
	    	
	    }*/
		
	    WebElement j =driver.findElement(By.xpath("//span[contains(text(),'Documents')]"));
	    String real = j.getText();
	   	String  expt = "Documents";
	   	Assert.assertEquals( null,expt, real);
	   	System.out.println("Test passed: "+real);
	   	Thread.sleep(2000);
	   	
	    WebElement k =driver.findElement(By.xpath("//span[contains(text(),'Desktop')]"));
	    String act = k.getText();
	   	String  exp = "Desktop";
	   	Assert.assertEquals( null,exp, act);
	   	System.out.println("Test passed:"+ " "+act);
	   	
	   	Thread.sleep(3000);
	   	WebElement n =driver.findElement(By.xpath("//span[contains(text(),'Downloads')]"));
	    String m = n.getText();
	   	String  expted = "Downloads";
	   	Assert.assertEquals( null,expted, m);
	   	System.out.println("Test passed:"+ " "+expted);
	   	
	   	Thread.sleep(3000);
	    
	   	WebElement p = driver.findElement(By.xpath("//span[contains(text(),'Home')]"));
	    String q = p.getText();
	   	String  ex = "Home";
	   	Assert.assertEquals(null,ex, q);
	   	System.out.println("Test passed:"+ " "+ex);
	   	Thread.sleep(3000);
	   	
	   	WebElement note =driver.findElement(By.xpath("//span[contains(text(),'Notes')]"));
	    String actualnote = note.getText();
	   	String  exptnote = "Notes";
	   	Assert.assertEquals(exptnote, actualnote);
	   	System.out.println("Test passed:"+ " "+actualnote);
	   	Thread.sleep(3000);
		WebElement com =driver.findElement(By.xpath("//span[contains(text(),'Commands')]"));
	    String actualcom = com.getText();
	   	String  exptcom = "Commands";
	   	Assert.assertEquals(exptcom, actualcom);
	   	System.out.println("Test passed:"+ " "+actualcom);
	   
	   	Thread.sleep(3000);
	   	//files in Home
	   	List<WebElement>All = driver.findElements(By.xpath("//span[@class ='text-success']"));
	   	int len = All.size();
	   	System.out.println(len);
	   	System.out.println("Folders in Home");
	   	for(int i = 0; i<len;i++)
	   	{
	   		WebElement val = All.get(i);
	   		 String lo = val.getText();
	   		 System.out.println(lo);
	   	}
	
	   	Thread.sleep(3000);
	   	WebElement foot = driver.findElement(By.xpath("//span[contains(text(),'© 2013-2020 TOOLSQA.COM |"
	   			+ " ALL RIGHTS RESERVED.')]	"));
	   	 
	   	String actfoot = foot.getText();
	   	String exptfoot ="© 2013-2020 TOOLSQA.COM | ALL RIGHTS RESERVED.";
	   	Assert.assertEquals(exptfoot, actfoot);
	   	System.out.println("The test Passed: "+actfoot);
	   			
	   	
	   	
	   	
	   	
	   	
	   	//driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/label/span[2]"
	   	
	  	//+ "/svg")).clear();
	  
	   	Thread.sleep(5000);

	   	driver.close();	
	   	
	}

}
