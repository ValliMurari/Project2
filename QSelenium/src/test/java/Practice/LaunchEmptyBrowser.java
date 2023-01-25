package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchEmptyBrowser {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//System.out.println("title of the page is:" +driver.getTitle());
		//System.out.println("Current URL of the page is:" +driver.getCurrentUrl());
        //System.out.println("Page source :" +driver.getPageSource());
        driver.get("https://www.flipkart.com/");
        driver.navigate().back();
        driver.navigate().forward();
		driver.navigate().refresh();        //driver.quit();
        }

}
 