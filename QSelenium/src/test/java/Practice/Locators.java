package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Owner/Downloads/Practice.html");
		//driver.findElement(By.tagName("a")).click();
		//driver.findElement(By.name("email")).sendKeys("abcdeg");
		//driver.findElement(By.id("pass")).sendKeys("hijkl");
		//driver.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy")).click();
		driver.findElement(By.partialLinkText("Goo")).click();
		//driver.findElement(By.linkText("Google")).click();
		//driver.findElement(By.)
	}

}
