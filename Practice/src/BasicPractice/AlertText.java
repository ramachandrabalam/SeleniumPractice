package BasicPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Java files\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goindigo.in/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		//a.moveToElement(driver.findElement(By.xpath("//label[@for='armedForces']"))).build().perform();
		//Thread.sleep(3000L);
        String message=driver.findElement(By.id("armedForces")).getAttribute("data-msg");
        System.out.println(message);
        
	}

}
