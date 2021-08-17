package SaturdayOffers.EcommerceWeb;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass {
	static FileInputStream fis=null;
	static Properties prop = null;
	static WebDriver driver = null;
	public static void baseClass() throws IOException {
		fis = new FileInputStream("F:\\Selenium\\EcommerceWeb\\src\\main\\java\\SaturdayOffers\\EcommerceWeb\\data.properties");
		prop = new Properties();
		prop.load(fis);
		
		 
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "F:\\Java files\\SeleniumDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver", "F:\\Java files\\SeleniumDrivers\\chromedriver.exe");
			driver = new FirefoxDriver();
		}else {
			System.setProperty("webdriver.chrome.driver", "F:\\Java files\\SeleniumDrivers\\chromedriver.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		
	}

}
