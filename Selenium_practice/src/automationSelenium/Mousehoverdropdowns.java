package automationSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Mousehoverdropdowns {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\RamachandraInterview\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://automationpractice.com/index.php?id_category=5&controller=category");
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("(//a[@class='sf-with-ul'])[4]"))).build().perform();
		Thread.sleep(3000L);
		List<WebElement> options = driver.findElements(By.xpath("//ul[@class='submenu-container clearfix first-in-line-xs']/li/a"));
		for(WebElement option : options) {
			
			if(option.getText().equalsIgnoreCase("Casual Dresses")) {
				option.click();
			}
		}

	}

}
