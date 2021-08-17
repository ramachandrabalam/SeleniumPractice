package automationSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Organization {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Java files\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.get("https://organiser.newnorm.one/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".mr-1.white_btn")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".blue_btn.mt-0.mb-0.max_width_100")).click();
		driver.findElement(By.xpath("//*[@name='email_address']")).sendKeys("qa35@yopmail.com");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("itech@123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ladda-button.blue_btn.social_media_sign_up.mt-0.mb-0")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".white_btn")).click();
		driver.findElement(By.xpath("//div[@class='form-group signup-form mt-3']/input")).sendKeys("Space stem");
		driver.findElement(By.xpath("//div[@class='form-group signup-form']/textarea")).sendKeys("This is a test orgnaization created by Space stem QA");
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/form/div[4]/button")).click();	
	}

}
