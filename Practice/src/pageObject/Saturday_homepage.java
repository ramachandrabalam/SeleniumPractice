package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Saturday_homepage {
	WebDriver driver;
	
	public Saturday_homepage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	By Loginlink=By.linkText("Log in");
	By Searchbox=By.xpath("//input[@id='small-searchterms']");
	By Searchbutton=By.xpath("//div[@class='input-group-append']");
	
	public WebElement SearchBox() {
		return driver.findElement(Searchbox);
		
	}
	
	public WebElement Searchbutton() {
		return driver.findElement(Searchbutton);
		
	}
	public WebElement Loginlink() {
		return driver.findElement(Loginlink);
		
	}

}
