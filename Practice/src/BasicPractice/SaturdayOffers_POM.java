package BasicPractice;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObject.Saturday_homepage;

public class SaturdayOffers_POM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Java files\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saturdayofferday.com/");
		
		Saturday_homepage shome= new Saturday_homepage(driver);
		
		shome.SearchBox().sendKeys("testing");
		shome.Searchbutton().click();
		shome.Loginlink().sendKeys(Keys.ENTER);
		

	}

}
