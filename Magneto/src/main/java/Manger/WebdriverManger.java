package Manger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import configReader.ConfigReaderMagneto;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverManger {
	
	static String browser=ConfigReaderMagneto.ReadTheConfigfile("browser");
	static String url=ConfigReaderMagneto.ReadTheConfigfile("url");
	protected static WebDriver driver;
	public static WebDriver setTheDriver() {
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
		}
		else if(browser.equalsIgnoreCase("IE")) {
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
			driver.manage().window().maximize();
		}
		return driver;
	}
	
	public static void setTheURL() {
		driver.get(url);
	}

}
