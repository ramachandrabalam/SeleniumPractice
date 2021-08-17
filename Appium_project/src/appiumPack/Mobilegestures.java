package appiumPack;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Mobilegestures extends OpenApp{

	
	public static void main(String[] args) throws MalformedURLException, InterruptedException{
		AndroidDriver<AndroidElement>driver = openApp();
		
		TouchActions t = new TouchActions(driver);
		Actions a = new Actions(driver);
		Thread.sleep(2000L);
		WebElement App = driver.findElement(By.xpath("//android.widget.TextView[@text='App']"));
		a.click(App).perform();
		//WebElement ExpandableLists = driver.findElement(By.xpath("//android.widget.TextView[@text='Expandable Lists']"));
		//t.singleTap(ExpandableLists).perform();
		
	}
}
