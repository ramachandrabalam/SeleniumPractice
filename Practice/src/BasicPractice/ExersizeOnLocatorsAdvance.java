package BasicPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExersizeOnLocatorsAdvance {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Java files\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mi.com/in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@data-stat-id='16f4466790747cd3']")).click();
		driver.findElement(By.cssSelector("#username")).sendKeys("987554445212");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("e-5565656565");
		driver.findElement(By.cssSelector(".btnadpt")).click();
		//driver.close();

	}

}
