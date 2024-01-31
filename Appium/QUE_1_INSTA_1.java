package com.Assement.Appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class QUE_1_INSTA_1 {
	@Test
	public void loginfail() throws MalformedURLException, InterruptedException {
			
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
		 
			driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button"))
			.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
					+ "android.widget.LinearLayout/android.widget.FrameLayout/"
					+ "android.widget.FrameLayout/android.widget.FrameLayout/"
					+ "android.view.ViewGroup[2]/android.view.ViewGroup[4]/android.view.View"))
			.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
					+ "android.widget.LinearLayout/android.widget.FrameLayout/"
					+ "android.widget.FrameLayout/android.widget.FrameLayout/"
					+ "android.view.ViewGroup[3]/android.view.ViewGroup[3]/android.view.View"))
			.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
					+ "android.widget.LinearLayout/android.widget.FrameLayout/"
					+ "android.widget.FrameLayout/android.widget.FrameLayout/"
					+ "android.view.ViewGroup[3]/android.widget.MultiAutoCompleteTextView[1]"))
			.sendKeys("tiri_123");
			Thread.sleep(1000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
					+ "android.widget.LinearLayout/android.widget.FrameLayout/"
					+ "android.widget.FrameLayout/android.widget.FrameLayout/"
					+ "android.view.ViewGroup[3]/android.widget.MultiAutoCompleteTextView[2]")).
			sendKeys("t@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
					+ "android.widget.LinearLayout/android.widget.FrameLayout/"
					+ "android.widget.FrameLayout/android.widget.FrameLayout/"
					+ "android.view.ViewGroup[3]/android.view.ViewGroup[4]/android.view.ViewGroup"))
			.click();
			Thread.sleep(8000);
						driver.quit();
					}
}