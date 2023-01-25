package Practice;

import java.io.File;

import javax.swing.text.Element;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions1 {

	public static void main(String[] args) throws Throwable{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.kalkifashion.com/");
		//WebElement ele = driver.findElement(By.xpath("(//a[.='Indo Western'])[2]"));
        //Actions actions=new Actions(driver);
        //actions.moveToElement(ele).perform();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest= new File("C:\\Users\\Owner\\Pictures\\Screenshots\\facebook.png");
		FileUtils.copyFile(src, dest);
		//driver.get("https://www.flipkart.com/");
		//Thread.sleep(3000);
		//JavascriptExecutor js=(JavascriptExecutor) driver;
		//Thread.sleep(3000);
		//for(int i=0;i<3;i++)
		//{
		//js.executeScript("window.scrollBy(0,500)");
		//}
		//Thread.sleep(3000);
		//for(int i=0;i<3;i++)
		//{
		//js.executeScript("window.scrollBy(0,-500)");
		//}
		//WebElement ele = driver.findElement(By.xpath("//div[1]/input[1]"));
	    //WebElement dest = driver.findElement(By.xpath("//div[.='Denmark']"));
	    //Actions act=new  Actions(driver);
	    //act.click(ele).perform();
	    //act.dragAndDrop(src, dest).perform();
	    
	}

}
