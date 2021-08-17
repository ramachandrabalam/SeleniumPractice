package automationSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingtables {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Java files\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		JavascriptExecutor js =  (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,370)");
		Thread.sleep(3000L);
		List<WebElement> rank=driver.findElements(By.xpath("//td[5]"));
		int sum=0;
		for(int i=0;i<rank.size(); i++) {
			sum= sum+Integer.parseInt(rank.get(i).getText());	
		}
		System.out.println(sum);

	}

}
