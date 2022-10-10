package testrunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestRunner {
	
	private WebDriver launch(String browser, String url) {
		
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in/ref=nav_logo");
			System.out.println("Chrome Launched");
		} if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.amazon.in/ref=nav_logo");
			System.out.println("FireFox Launched");
		} else {
			System.out.println("No browser Launched");
		}
		
		return null;

	}

}

