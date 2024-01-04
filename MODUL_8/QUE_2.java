package MODUL_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class QUE_2 {
	WebDriver  driver;
	@BeforeClass
	public void beforesetup() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\SELENINUM\\msedgedriver.exe");
				 driver= new EdgeDriver();
				 driver.get("https://www.saucedemo.com");
		 		driver.manage().window().maximize();
		System.out.println("url is :"+ driver.getCurrentUrl());
		 System.out.println(" title is :"+ driver.getTitle());
		 		 Thread.sleep(2000);
		 	}
	@Test
	   public void test() throws InterruptedException {
		 driver.findElement(By.id("user-name")).sendKeys("standard_user");
		 Thread.sleep(5000);
		 driver.findElement(By.id("password")).sendKeys("secret_sauce");
	   	   Thread.sleep(2000);
		   driver.findElement(By.id("login-button")).click();
		   Thread.sleep(2000);
		}
		@AfterClass   
		public void aftersetup() {
			System.out.println("byeee byeee .....");
			driver.close();
		}
	
	}	
