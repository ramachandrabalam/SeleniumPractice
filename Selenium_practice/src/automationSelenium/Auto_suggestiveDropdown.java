package automationSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_suggestiveDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Java files\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.get("https://www.yatra.com/");
		WebElement origin=driver.findElement(By.id("BE_flight_origin_city"));
		origin.click();
		origin.sendKeys("ah");
		List<WebElement> opts=driver.findElements(By.cssSelector(".ac_cityname span"));
		for(int i=0; i<opts.size();i++) {
			if(driver.findElements(By.cssSelector(".ac_cityname span")).get(i).getText().equalsIgnoreCase("Ahmedabad")){
				driver.findElements(By.cssSelector(".ac_cityname span")).get(i).click();
				break;
				
			}
			////String dest=driver.findElement(By.cssSelector(".ac_cityname span")).getText();
			//if(dest.equalsIgnoreCase("Ahmedabad")) {
				
			//}
		//}

	for(WebElement option : opts) {
		if(option.getText().equalsIgnoreCase("Ahmedabad")) {
			option.click();
			break;
		}
	}
		}
	}
}
		
	


