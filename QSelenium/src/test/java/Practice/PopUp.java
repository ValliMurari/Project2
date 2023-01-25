package Practice;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



import io.github.bonigarcia.wdm.WebDriverManager;

public class PopUp {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		
		//Program of FRAME
		//ChromeOptions option=new ChromeOptions();
		//option.addArguments("incognito");
		//WebDriver driver=new ChromeDriver(option);
		//driver.manage().window().maximize();
		//driver.get("some URL which contains frame in it");
		//Thread.sleep(2000);
		//driver.switchTo.frame(0);
		//driver.findElement(By.xpath("//input[@id='t2']")).sendKeys("AADYA");
		//driver.switchTo().parentFrame();
		//driver.switchTo().defaultContent();	
		
		//Resize a Browser
		
		//Authentication POPUP
		ChromeOptions option=new ChromeOptions();
		option.addArguments("incognito");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/nlogin/login");
		Thread.sleep(2000);
		String parent_id = driver.getWindowHandle();
		System.out.println(parent_id);
		Set<String> allids = driver.getWindowHandles();
		int count= allids.size();
		System.out.println(count);
		Thread.sleep(2000);
		for(String a:allids)
		{
			System.out.println(a);
		}
		driver.close();
		//BrowserPOP
		//driver.get("https://www.naukri.com/registration/createAccount");
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//a[.='Register for Free']")).click();
		//WebElement ele = driver.findElement(By.xpath("//button[.='Upload Resume']"));
		//ele.click();
		//Thread.sleep(3000);
		//ele.sendKeys("C:\\Users\\Owner\\Desktop\\New folder\\Cover Letter.docx");
		//driver.findElement(By.xpath("//input[@id='file-upload']")).click();
		
		//Hidden division POPUP
		//driver.get("https://www.redbus.in/");
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("(//input[@type='text'])[3]")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//td[.='24']")).click();
		
		//Alert POPUP
		//driver.get("http://www.javascriptkit.com/javatutors/alert2.shtml");
		//driver.findElement(By.xpath("//input[@value='Click here for output>>']")).click();
		//Thread.sleep(2000);
		//Alert a= driver.switchTo().alert();
		//a.accept();
		//a.dismiss();
		
		

	}

}