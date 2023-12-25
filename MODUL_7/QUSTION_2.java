package MODUL_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
/*
 * 
 *  W.A.J.Script for Locating links by partialLinkText()
 *  
 *  
 */
public class QUSTION_2 {
public static void main(String[] args) throws InterruptedException {
	
	 System.setProperty("webdriver.edge.driver", "D:\\SELENINUM\\msedgedriver.exe");
		
		WebDriver driver= new EdgeDriver();
	
		driver.manage().window().maximize();
		
		 driver.get("https://www.facebook.com/");
		 
		Thread.sleep(2000);

		driver.findElement(By.partialLinkText("He")).click();
		
		Thread.sleep(2000);
		driver.close();
	
}
}
