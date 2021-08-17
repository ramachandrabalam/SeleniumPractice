package BasicPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exersize_dropdownWithLoops {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Java files\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		for(int i =0; i<4; i++) {		
			driver.findElement(By.id("hrefIncAdt")).click();
			Thread.sleep(2000L);
			System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		}

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.close();
	}

}
