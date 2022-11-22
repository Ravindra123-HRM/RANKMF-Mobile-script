package RankMFMobileAutomation.RankMFmobile;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	public static WebDriver driver;
	
	public static <MobileElement> WebDriver setup() throws MalformedURLException {
	File f=new File("MobileAutomationAppium");
	File fs=new File(f,"app-release.apk");
	
	
	DesiredCapabilities caps=new DesiredCapabilities();
	caps.setCapability("platformname", "ANDROID");
	caps.setCapability(CapabilityType.PLATFORM_NAME, "ANDROID");	
	caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
	caps.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
	//caps.setCapability(MobileCapabilityType.UDID, "");
	caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
	caps.setCapability(MobileCapabilityType.APP,"C:\\Users\\samco\\eclipse-workspace\\RankMFmobile\\app-release (3).apk");
	caps.setCapability(MobileCapabilityType.NO_RESET,true);
	AppiumDriver driver=new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
	//driver.manage().deleteAllCookies();


	
	//caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
	//AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
	
	return driver;
	
	
	}
}
