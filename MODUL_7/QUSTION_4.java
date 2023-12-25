package MODUL_7;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class QUSTION_4 {

/*
 *  W.A.J. script to use different methods to manage the windows-alerts
 */

public static void main(String[] args) throws InterruptedException {
	

	 System.setProperty("webdriver.edge.driver", "D:\\SELENINUM\\msedgedriver.exe");
		
		WebDriver driver= new EdgeDriver();
	
		driver.manage().window().maximize();
		
		 driver.get("https://demo.guru99.com/test/delete_customer.php");
		 
		Thread.sleep(2000);
		
		driver.findElement(By.name("cusid")).sendKeys("123");
		Thread.sleep(2000);
		
		
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		
		Alert a1 =driver.switchTo().alert();
		System.out.println("alert message is :"+ a1.getText());
		
//		a1.dismiss();
		a1.accept();
		Thread.sleep(3000);
		
		Alert a2 = driver.switchTo().alert();
		System.out.println("alert message is :"+ a2.getText());
		a2.accept();
		Thread.sleep(2000);
		
		driver.close();
		

}
}
