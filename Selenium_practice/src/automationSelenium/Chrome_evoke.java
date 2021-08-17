package automationSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_evoke {

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
		Thread.sleep(10000);
		//driver.findElement(By.cssSelector(".menu_btn.organisations-menu")).click();
		
		//driver.findElement(By.cssSelector(".cursor-pointer.signout")).click();
		driver.findElement(By.cssSelector(".blue-btn-type.ml-3")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@value='5f9fedadedf4b816f06796da']")).click();
		driver.findElement(By.xpath("//div[@class='input_box']/input")).sendKeys("Annual day");
	}

}
