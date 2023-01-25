package Practice;
import org.apache.commons.exec.LogOutputStream;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ann {
	WebDriver driver;
	@BeforeSuite
	public void db()
	{
		System.out.println("Connect to database");
	}
	@BeforeClass
		public void openBrowser()
		{
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
		}
	@BeforeMethod
	public void launchApp()
	{
		driver.get("URL");
		//login.click();
	}
	@AfterMethod
	public void closeApp()
	{
		//logout.click();
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
	@AfterSuite
	public void closedb()
	{
		System.out.println("CLose the database");
	}
	}


