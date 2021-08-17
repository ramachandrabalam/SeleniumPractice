package BasicPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Exersize_All_UI {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Java files\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goindigo.in/");
		driver.manage().window().maximize();
		boolean trip= driver.findElement(By.xpath("//input[@id='oneWayTrip']")).isSelected();
		Assert.assertTrue(trip);
		driver.findElement(By.xpath("(//input[@placeholder='Departure Date'])[1]")).click();
		Thread.sleep(2000L);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
		Thread.sleep(2000L);
		driver.close();

	}

}
