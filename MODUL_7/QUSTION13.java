package MODUL_7;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


/*
 * W.a. junit program to perform test with webdriver to login process of facebook
 */

public class QUSTION13 {

	WebDriver  driver;
	@Before
	public void beforesetup() {
		System.setProperty("webdriver.edge.driver", "D:\\SELENINUM\\msedgedriver.exe");
		
		 driver= new EdgeDriver();
		
		 driver.get("https://www.saucedemo.com/v1/");
		 
		driver.manage().window().maximize();
		
	}
	@Test
	   public void test() throws InterruptedException {
		

		 System.out.println("url is :"+ driver.getCurrentUrl());
		 System.out.println(" title is :"+ driver.getTitle());
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.id("password")).sendKeys("secret_sauce");
		 Thread.sleep(2000);
		
		 driver.findElement(By.id("login-button")).click();
		 Thread.sleep(2000);
		 
	}
	  @After
		public void aftersetup() {
			System.out.println("BYE BYE");
			driver.close();
	
		}
	
}
