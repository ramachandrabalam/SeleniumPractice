package BasicPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exersize_StaticDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Java files\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		for(int a=0; a<=3; a++) {
			Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
			s.selectByIndex(a);
			Thread.sleep(2000L);
		} 
		
		driver.close();
		

	}

}
