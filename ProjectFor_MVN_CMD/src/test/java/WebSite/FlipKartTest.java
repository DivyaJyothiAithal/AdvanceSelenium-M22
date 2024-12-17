package WebSite;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;

//import GeneralUtilities.BaseClass;

public class FlipKartTest extends BaseClass
{


	
	@Test(priority = 1)
	public void OpenFlipKartT()       
	
	{
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.flipkart.com/");
	}
	
	@Test(priority = 2)
	public void SearchIphone()
	{
		driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("iphone16",Keys.ENTER);
	}
	
	@Test(priority = 3)
	public void closeFlipKartT() throws Throwable
	{
		Thread.sleep(3000);
		driver.quit();
	}

}
