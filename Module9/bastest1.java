package Module9;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class bastest1 {
	public 	AndroidDriver driver;
	AppiumDriverLocalService service;

	@BeforeClass
public void test() throws MalformedURLException, InterruptedException {
		
		service=new AppiumServiceBuilder()
				.withAppiumJS(
						new File(" C:\\Users\\Dell\\AppData\\Roaming\\"
								+ "npm\\node_modules\\appium\\build\\lib\\main.js"))
								.withIPAddress("127.0.0.1")
				.withTimeout(Duration.ofSeconds(20))
				.usingPort(4723)
				.build();
		service.start();
	
		
		
	UiAutomator2Options options=new UiAutomator2Options();
	options.setDeviceName("OPPO CPH2531");
	options.setApp("D:\\APK file\\apk file\\ApiDemos-debug.apk");
	//options.setApp("D:\\Appium\\apk file\\General-Store.apk");

 driver=new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
 Thread.sleep(2000);
} 
	public void longPressAction(WebElement ele)
	{
		((JavascriptExecutor)driver).executeScript("mobile: longClickGesture",
				ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(),
						"duration",2000));
	}
	public void swipeAction(WebElement ele,String direction)
	{
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
				"elementId", ((RemoteWebElement)ele).getId(),
			 
			    "direction", direction,
			    "percent", 0.75
			));		
	}
public void drapnDrop(WebElement source) {
	((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
		    "elementId", ((RemoteWebElement) source).getId(),
		    "endX", 619,
		    "endY", 560
		));

	
}
	
	@AfterClass
	public void teardown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
		service.stop();
		 
}
}
