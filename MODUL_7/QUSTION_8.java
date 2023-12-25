package MODUL_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/*
 * W.A.J. script To write the script for image of logo facebook using xpath.
 */
public class QUSTION_8 {
public static void main(String[] args) throws InterruptedException {
	
	
	 System.setProperty("webdriver.edge.driver", "D:\\SELENINUM\\msedgedriver.exe");
		
		WebDriver driver= new EdgeDriver();
	
		driver.manage().window().maximize();
		
		 driver.get("https://www.facebook.com/");
		 
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("rinkal");
	    Thread.sleep(2000);
		   
	    driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("123");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.name("login")).click();
	    Thread.sleep(2000);
				
	    driver.close();
	    
		
	
}
}
