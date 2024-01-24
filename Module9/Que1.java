package Module9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

/*
 * 
 * Write an Appium Program to connect with emulator wit ecommerce based application using
 * Generalstore.app to perform locators like name, dropdown etc
 */
public class Que1  extends bastest1{
	@Test
public void name() throws InterruptedException {
	
	driver.findElement(AppiumBy.accessibilityId("Views")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
	Thread.sleep(2000);
			WebElement source=driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
	drapnDrop(source);
	String msg=driver.findElement(By.id("io.appium.android.apis:id/drag_result_text")).getText();
		assertEquals(msg, "Dropped!");
		}
private void assertEquals(String msg, String string) {
	// TODO Auto-generated method stub
	
}
}
