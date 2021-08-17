package BasicPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Exersize_synchronization {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Java files\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //implicit wait
		driver.get("https://access.trivago.in");
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//span[text()=\"Sign up\"]")).click();
		WebDriverWait d = new WebDriverWait(driver, 15);
		d.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()=\\\"Google\\\"]"))).click(); //explicit wait
		driver.findElement(By.xpath("//span[text()=\"Google\"]")).click();

		
	}

}
