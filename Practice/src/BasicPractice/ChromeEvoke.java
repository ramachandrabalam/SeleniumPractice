package BasicPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeEvoke {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Java files\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String url= driver.getCurrentUrl();
		String title = driver.getTitle();

		System.out.println(url);
		System.out.println(title);
	}

}
