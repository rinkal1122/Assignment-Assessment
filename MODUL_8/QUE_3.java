package MODUL_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class QUE_3 {
	WebDriver  driver;
	@BeforeTest
	public void beforesetup() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\SELENINUM\\msedgedriver.exe");
		
		 driver= new EdgeDriver();
		
		 driver.get("https://www.saucedemo.com");
		 
		driver.manage().window().maximize();
		System.out.println("url is :"+ driver.getCurrentUrl());
		 System.out.println(" title is :"+ driver.getTitle());
		 
		 Thread.sleep(2000);
		 
	}
	@Test(priority = 0)
	   public void test() throws InterruptedException {
		

		 driver.findElement(By.id("user-name")).sendKeys("standard_user");
		 Thread.sleep(5000);
	}
	@Test(priority = 1)
		 public void password() throws InterruptedException {
			
		
		 driver.findElement(By.id("password")).sendKeys("secret_sauce");
		 Thread.sleep(5000);
		 }
		 @Test(priority = 2)
		 public void loginButton() throws InterruptedException {
			
		
		
		 driver.findElement(By.id("login-button")).click();
		 Thread.sleep(5000);
		 }
		 @Test(priority = 3)

		 public void clickMenu() throws InterruptedException {
			 driver.findElement(By.id("react-burger-menu-btn")).click();
			 Thread.sleep(5000);
		}
		 @Test(priority = 4)

		 public void clicklogout() throws InterruptedException {
			 driver.findElement(By.id("logout_sidebar_link")).click();
			 Thread.sleep(5000);
		}

		 
	
	  @AfterTest
		public void aftersetup() {
			System.out.println("BYE BYE");
			driver.close();
		
	}

}


