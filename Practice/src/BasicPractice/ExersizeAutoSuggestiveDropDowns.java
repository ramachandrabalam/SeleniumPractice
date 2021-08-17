package BasicPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExersizeAutoSuggestiveDropDowns {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Java files\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//label[@for='fromCity']")).click();
		WebElement from= driver.findElement(By.xpath("//input[@placeholder='From']"));
		from.sendKeys("amd");
		Thread.sleep(5000L);
		from.sendKeys(Keys.ARROW_DOWN);
		from.sendKeys(Keys.ENTER);
		
		WebElement to = driver.findElement(By.xpath("//input[@placeholder='To']"));
		to.sendKeys("hyd");
		Thread.sleep(5000L);
		to.sendKeys(Keys.ARROW_DOWN);
		to.sendKeys(Keys.ENTER);
		
		Thread.sleep(10000L);
		driver.close();

	}

}
