package BasicPractice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exersize_links {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Java files\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		Thread.sleep(3000L);
		WebElement footer = driver.findElement(By.cssSelector("._2NHqR1.row"));
		int footerLinks=footer.findElements(By.tagName("a")).size();
		System.out.println(footerLinks);
		WebElement column=footer.findElement(By.xpath("(//div[@class='_3qd5C5'])[1]"));
		System.out.println(column.findElements(By.tagName("a")).size());
		for(int i =0; i<column.findElements(By.tagName("a")).size();i++) {
			column.findElements(By.tagName("a")).get(i).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
			Thread.sleep(2000L);
		}
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
while(it.hasNext()) {
	driver.switchTo().window(it.next());
	Thread.sleep(3000L);
	System.out.println(driver.getTitle());
	
}
			
		
		

	}

}
