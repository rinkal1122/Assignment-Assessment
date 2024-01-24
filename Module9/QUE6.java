package Module9;

import java.net.MalformedURLException;
import java.net.URL;

/*
 *  Write an Appium Program to connect with emulator and open APIdemo.
 * app application on your emulator
 * 
 */
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class QUE6 {
	@Test
public void emulator() throws MalformedURLException, InterruptedException {

		UiAutomator2Options options=new UiAutomator2Options();
		options.setDeviceName("OPPO CPH2531");
		options.setApp("D:\\\\APK file\\\\apk file\\\\Apidemos-debug.apk");
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		Thread.sleep(3000);
		driver.quit();
}
}
