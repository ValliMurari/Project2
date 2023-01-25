package Practice;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Script2 {
 public static void main(String[] args) throws InterruptedException {
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 //Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	 driver.findElement(By.xpath("//button[.=' Login ']")).click();
	 String ele= driver.findElement(By.xpath("//h6[.='Dashboard']")).getText();
	 System.out.println(ele);
	 if (ele.equalsIgnoreCase("Dashboard"))
	 {
		 System.out.println("Home page is displayed");
	 }
	 else {
		 {
			 System.out.println("Home page is not displayed"); 
		 }
	      }
	}
}
