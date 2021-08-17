package appiumPack;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class OpenApp {

	public static  AndroidDriver<AndroidElement> openApp() throws MalformedURLException {
		
		File f = new File("src");
		File fs = new File(f, "ApiDemos-debug.apk");
		
		DesiredCapabilities cap = new DesiredCapabilities(); // Create an object for the desired capabilities class
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "RamaNexus");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 120000); //Default new command timeout will be 60 sec i.e. 60000 milli sec
		// Need to create the object for android driver class
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL ("http://127.0.0.1:4723/wd/hub"),cap);
		return driver;
		

	}

}
