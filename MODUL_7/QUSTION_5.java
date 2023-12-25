package MODUL_7;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/*
 * W.A.J. script to use different methods to manage pop ups.
 */
public class QUSTION_5 {
public static void main(String[] args) throws InterruptedException {
	

	 System.setProperty("webdriver.edge.driver", "D:\\SELENINUM\\msedgedriver.exe");
		
		WebDriver driver= new EdgeDriver();
	
		driver.manage().window().maximize();
		
		 driver.get("http://demo.guru99.com/popup.php");
		 
		Thread.sleep(2000);
		
		String main_w= driver.getWindowHandle();
		System.out.println("main window is :"+main_w);
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Here")).click();
		
		Thread.sleep(2000);

		
		Set<String> all_w= driver.getWindowHandles();
		Iterator<String> i1 = all_w.iterator();
		
		while (i1.hasNext()) {
			System.out.println(i1.next());
			String child_w=i1.next();
			if (! main_w.equals(child_w)) {
				driver.switchTo().window(child_w);
				driver.findElement(By.name("emailid")).
				sendKeys("rinkekchudhari@gmail.com");
				Thread.sleep(2000);
				driver.findElement(By.name("btnLogin")).click();
				driver.close();
		
			}
			driver.switchTo().window(main_w);
			Thread.sleep(2000);
			System.out.println("current window :"+child_w);
			Thread.sleep(2000);
			driver.close();
		}
		
	
	
}
}
