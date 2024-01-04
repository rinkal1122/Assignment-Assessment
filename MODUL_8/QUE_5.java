package MODUL_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class QUE_5 {
	@DataProvider(name = "tiku")
	public Object input() {
		return new Object[][] {{ "standard_user","secret_sauce"}
				,{"problem_user","secret_sauce"}};
	}
	@Test(dataProvider = "tiku")
		 public void f(String  username, String password ) throws InterruptedException {
		  WebDriver  driver;
			System.setProperty("webdriver.edge.driver", "D:\\SELENINUM\\msedgedriver.exe");
			 driver= new EdgeDriver();
			 driver.get("https://www.saucedemo.com");
				driver.manage().window().maximize();
				System.out.println("url is :"+ driver.getCurrentUrl());
				 System.out.println(" title is :"+ driver.getTitle());
				  Thread.sleep(2000);
				 
				 driver.findElement(By.id("user-name")).sendKeys(username);
				 Thread.sleep(5000);
			
				 driver.findElement(By.id("password")).sendKeys(password);
				 Thread.sleep(5000);
				 
				 driver.findElement(By.id("login-button")).click();
				 Thread.sleep(5000);
				 
					 driver.findElement(By.id("react-burger-menu-btn")).click();
					 Thread.sleep(5000);
				
					 driver.findElement(By.id("logout_sidebar_link")).click();
			
					System.out.println("BYE BYE");
					driver.close();
				
			}

}
