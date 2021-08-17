package BasicPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExersizeOnLocators_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Java files\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.salesforce.com/in/?ir=1");
        driver.findElement(By.xpath("/html/body/header/div[2]/div[2]/div/div/div/nav/div[1]/div/div[3]/div[1]/div[6]/div/a")).click();
        driver.findElement(By.id("username")).sendKeys("testusername");
        driver.findElement(By.id("password")).sendKeys("testpassword");
        driver.findElement(By.id("Login")).click();
        String error=driver.findElement(By.id("error")).getText();
        System.out.println(error);
        driver.close();
	}

}
