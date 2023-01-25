package Practice;
import java.awt.event.KeyEvent;

//import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Robot {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("incognito");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/nlogin/login");
		Thread.sleep(2000);
		Robot r=new Robot();
		r.KeyPress(KeyEvent.VK_ENTER);
		r.KeyRelease(KeyEvent.VK_ENTER);
		r.KeyPress(KeyEvent.VK_COPY);
		r.KeyRelease(KeyEvent.VK_PASTE);
	}

}
