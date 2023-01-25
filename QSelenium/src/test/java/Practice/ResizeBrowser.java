package Practice;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ResizeBrowser {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("incognito");
		WebDriver driver=new ChromeDriver(option);
		
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/nlogin/login");
		Thread.sleep(2000);
		Dimension d=new Dimension(100,200);
		driver.manage().window().setSize(d);
		Point p=new Point(200, 300);
		driver.manage().window().setPosition(p);
		driver.manage().window().maximize();
		

	}

}
