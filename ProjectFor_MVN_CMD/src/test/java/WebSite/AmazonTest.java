package WebSite;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;

//import GeneralUtilities.BaseClass;




public class AmazonTest extends BaseClass
{
	WebDriver driver=new ChromeDriver();
	
	@Test(priority = 1)
	public void OpenAmazon()       
	
	{
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//driver.get("https://www.amazon.in/");
	}
	
	@Test(priority = 2)
	public void SearchIphone()
	{
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone16",Keys.ENTER);
	}
	
	@Test(priority = 3)
	public void closeAmazon() throws Throwable
	{
		Thread.sleep(3000);
		driver.quit();
	}

}
