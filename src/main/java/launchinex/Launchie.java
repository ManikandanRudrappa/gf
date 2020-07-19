package launchinex;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Launchie 
{
	@Test
	public void test() 
	{
		System.setProperty("webdriver.ie.driver", "./driver/IEDriverServer.exe");  
		   WebDriver driver=new InternetExplorerDriver();
		   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

//		   driver.get("https://www.air.irctc.co.in/");
//		   driver.findElement(By.xpath("(//label[@class='custom-control-label'])[2]")).click();
//		   driver.findElement(By.xpath("(//button[@class='btn btn-md blue-gradient btn-rounded waves-effect waves-light m-0 font-14'])[4]")).click();
			
			
			driver.get("https://www.amazon.in/");
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone11");
	}

}
	
