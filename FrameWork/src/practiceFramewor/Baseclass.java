package practiceFramewor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Baseclass {
	public static WebDriver driver = null;
	public static Properties prop = null;
	static FileInputStream fis = null;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		prop=new Properties();
		fis = new FileInputStream("F:\\Selenium\\FrameWork\\src\\practiceFramewor\\base.properties");
		prop.load(fis);
		if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.firefox.driver", "firefox drivers path");
			driver = new FirefoxDriver();
		}else if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "F:\\Java files\\SeleniumDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}else {
			System.setProperty("webdriver.ie.driver", "internet explorer drivers path");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		
		
	
		
	}

}
