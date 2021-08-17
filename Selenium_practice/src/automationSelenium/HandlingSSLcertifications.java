package automationSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HandlingSSLcertifications {
 static WebDriver driver = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DesiredCapabilities ch = DesiredCapabilities.chrome();
		ch.setBrowserName("chrome");
		ch.setVersion("90.0.4430.212");
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		ChromeOptions c = new ChromeOptions();
		c.merge(ch);
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\RamachandraInterview\\chromedriver.exe");
		driver = new ChromeDriver(c);
		driver.get("https://the-internet.herokuapp.com/");
		

	}

}
