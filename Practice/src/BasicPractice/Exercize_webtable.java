package BasicPractice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercize_webtable {


	public static void main(String[] args) {
		int a=0;
		System.setProperty("webdriver.chrome.driver", "F:\\Java files\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://qaclickacademy.com/practice.php");
		int count =driver.findElements(By.cssSelector("#product tr :nth-child(3)")).size();
		
		for(int i=1; i<count; i++) {
			String before =driver.findElements(By.cssSelector("#product tr :nth-child(3)")).get(i).getText();
			//System.out.println(before);
			int value= (Integer.parseInt(before));	
			a= a+value;		
		}
		System.out.println(a);
		
		
		//System.out.println(Integer.parseInt("before"));
		driver.close();
		

	}

}
