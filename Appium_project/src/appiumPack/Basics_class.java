package appiumPack;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Basics_class extends OpenApp {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		//OpenApp oa = new OpenApp();
		AndroidDriver<AndroidElement> driver = openApp();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
	}

}
