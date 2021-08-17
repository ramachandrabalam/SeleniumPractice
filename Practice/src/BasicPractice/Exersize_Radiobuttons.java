package BasicPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exersize_Radiobuttons {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\\\Java files\\\\SeleniumDrivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		int rad_count=driver.findElements(By.xpath("//input[@type='radio']")).size();
		System.out.println(rad_count);
		
		for(int i=1; i<rad_count-2; i++) {
			driver.findElements(By.xpath("//input[@type='radio']")).get(i).click();
			Thread.sleep(2000L);
		}
		Thread.sleep(5000L);
		driver.findElement(By.id("MultiCityModelAlert")).click();
		driver.close();

	}

}
