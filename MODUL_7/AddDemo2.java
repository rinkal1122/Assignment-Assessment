package MODUL_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AddDemo2 {
	public static void login(String username, String password) throws InterruptedException {
		
	
	 System.setProperty("webdriver.edge.driver", "D:\\SELENINUM\\msedgedriver.exe");
		
		WebDriver driver= new EdgeDriver();
	
		driver.manage().window().maximize();
		
		 driver.get("https://www.facebook.com/");
		 
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).sendKeys(username);
		Thread.sleep(2000);
		
		driver.findElement(By.id("pass")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(10000);
		
		System.out.println("bYe.. BYe..");
		driver.close();
}

	
		
	}
