package MODUL_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

/*
 *  W.A.J.Script for Selecting multiple items in a drop dropdown
 */
public class QUSTION_3 {
public static void main(String[] args) throws InterruptedException {
	
	 System.setProperty("webdriver.edge.driver", "D:\\SELENINUM\\msedgedriver.exe");
		
		WebDriver driver= new EdgeDriver();
	
		driver.manage().window().maximize();
		
		 driver.get("https://output.jsbin.com/osebed/2");
		 
		Thread.sleep(2000);

   WebElement ele=driver.findElement(By.id("fruits"));
		
	    Select option =new Select(ele);
	    
	    option.selectByValue("apple");
	    Thread.sleep(2000);
	    
	    option.selectByIndex(0);
	    Thread.sleep(2000);
	    
	    option.selectByVisibleText("Grape");
	    Thread.sleep(2000);
	    
	    driver.close();
}
}
