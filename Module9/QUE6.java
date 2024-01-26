package Module9;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
/*
 *  Write an Appium Program to connect with emulator and open APIdemo.
 * app application on your emulator
 * 
 */
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class QUE6 {
	@Test
public void emulator() throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "OPPO CPH2531");
		cap.setCapability("udid", "KR69JRD6HEDQ99EQ");
		cap.setCapability("platformName","Android");
		cap.setCapability("platformverson","14.0");
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		cap.setCapability("automationName", "UIAutomator2");
		
				URL url=new URL("http://127.0.0.1:4723/");
				
				AppiumDriver driver=new AppiumDriver(url,cap);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 Thread.sleep(2000);
		 
		 
		 
		 
		 
}
}