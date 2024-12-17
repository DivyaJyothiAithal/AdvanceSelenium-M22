package Generic_Utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	public WebDriver driver;

	@BeforeSuite
	public void BefSuite()
	{
		System.out.println("Database connection Successful");
	}
	
	@BeforeTest
	public void BefTest()
	{
		System.out.println("Parallel Execution Started");
	}
	

	@BeforeClass
	public void BefClass() throws Throwable // (String browser)throws Throwable
	{	
		//String BROWSER=System.getProperty("browser");
		String BROWSER="edge";
		if(BROWSER.equalsIgnoreCase("edge"))
		driver=new EdgeDriver();
		
		
	}
	
	
	@BeforeMethod
	public void BefMethod()throws Throwable
	{

		System.out.println("Before Method started");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://localhost:8888/");
		
//		String UNAME=System.getProperty("uname");
//		String PASS=System.getProperty("pwd");
		
		String UNAME="admin";
		String PASS="admin";
		driver.findElement(By.name("user_name")).sendKeys(UNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASS);
		driver.findElement(By.id("submitButton")).click();

	}

	@AfterMethod
	public void AftMethod()
	{
		System.out.println("After Method started");
	}
	
	@AfterClass
	public void AftClass() throws Throwable
	{
		System.out.println("After class started");
		driver.quit();
	}

	@AfterTest
	public void AftTest()
	{
		System.out.println("Parallel Execution Closed");
		
	}
	
	@AfterSuite
	public void AftSuite()
	{
		System.out.println("Database connection Closed");
	}

}
