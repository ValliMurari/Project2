package Practice;

import java.time.Duration;
import java.util.ResourceBundle.Control;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Verifiers {
   public static void main(String[] args) throws InterruptedException {
	   
	   WebDriverManager.chromedriver().setup();
	   WebDriver driver=new ChromeDriver();
	   //driver.get("https://www.facebook.com/");
	   driver.navigate().to("https://www.facebook.com/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   //String value=driver.findElement(By.xpath("//input[@name='email']")).getAttribute("aria-label");
	   WebElement value=driver.findElement(By.xpath("//input[@name='email']"));
	   //String font = value.getCssValue("font-size");
	   //System.out.println(font);
	   //Point loc = value.getLocation();
	   //System.out.println(loc);
	   //int x = loc.getX();
	   //int y = loc.getY();
	   //System.out.println(x);
	   //System.out.println(y);
	   //WebElement ele = driver.findElement(By.xpath("//input[@type='text']"));
	   //ele.sendKeys("abcdefg");
	   //Thread.sleep(2000);
	   //ele.sendKeys(Keys.CONTROL+"a");
	   //ele.sendKeys(Keys.DELETE);//Clears the data
	   //ele.sendKeys(Keys.CONTROL+"a");
	  // ele.sendKeys(Keys.CONTROL+"c");
	   //WebElement ele1 = driver.findElement(By.xpath("//input[@type='password']"));
	   //ele1.sendKeys(Keys.CONTROL+"v");
	   //WebElement ele = driver.findElement(By.xpath("//a[.='Google']"));
	   //ele.sendKeys(Keys.ENTER);
	}
}
