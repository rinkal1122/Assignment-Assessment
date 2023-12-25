package MODUL_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/*
 * W.A.J. Script To perform the radio button to select one by one in loop
 */
public class QUSTION_7 {
public static void main(String[] args) throws InterruptedException {

	 System.setProperty("webdriver.edge.driver", "D:\\SELENINUM\\msedgedriver.exe");
		
		WebDriver driver= new EdgeDriver();
	
		driver.manage().window().maximize();
		
		 driver.get("https://demo.guru99.com/test/radio.html/");
		 
		Thread.sleep(2000);
		
//		driver.findElement(By.id("vfb-7-1")).click();
		
		for (int i =1; i <=3 ; i++) {
			driver.findElement(By.id("vfb-7-"+i)).click();
			Thread.sleep(2000);
			
		}
		
		driver.close();
		
		
		
}
}
