package POMselinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	static WebDriver driver;

	public static WebDriver BrowserOption(String browserName, String url) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Savita\\Desktop\\selenium aotomation\\POMinsSelenium\\SeleniumBrowserJars\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Savita\\Desktop\\selenium aotomation\\POMinsSelenium\\SeleniumBrowserJar\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.get(url);
		return driver;

	}

}
