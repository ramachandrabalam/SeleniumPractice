package BasicPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exersizecalander_1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Java files\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
		driver.findElement(By.id("txtJourneyDate")).click();
		System.out.println(driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText());
		//boolean my = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText().contains("September");
		while (!driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText().contains("August")) {
			driver.findElement(By.xpath("//a[@title='Next']")).click();
			Thread.sleep(3000L);
		}
		int date=driver.findElements(By.cssSelector(".ui-state-default")).size();
		for(int i=0; i<date;i++) {
			 
				String day= driver.findElements(By.cssSelector(".ui-state-default")).get(i).getText();
				if(day.contains("23")) {
					driver.findElements(By.cssSelector(".ui-state-default")).get(i).click();
				}
				
			
			
		}
		
	}

}
