import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart1 {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@loading='lazy' and @alt='Mobiles']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more' and @type='text']")).sendKeys("iphone");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more' and @type='text']")).sendKeys("Keys.Enter");
		Thread.sleep(3000);
		driver.findElement(By.name("APPLE iPhone 14 (Starlight, 128 GB)")).click();
		driver.findElement(By.xpath("//div[.='_30jeq3 _16Jk6d']"));
		driver.close();

	}

}
