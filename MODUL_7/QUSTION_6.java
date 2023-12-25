package MODUL_7;
/*
 * W.A.J.script to register your self in Gmail
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class QUSTION_6 {
public static void main(String[] args) throws InterruptedException {
	

	 System.setProperty("webdriver.edge.driver", "D:\\SELENINUM\\msedgedriver.exe");
		
		WebDriver driver= new EdgeDriver();
	
		driver.manage().window().maximize();
		
driver.get("https://accounts.google.com/v3/signin/identifier?continue=https:"
				+ "//mail.google.com/mail/&service"
				+ "=mail&theme=glif&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
				 
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Create account']")).click();
		Thread.sleep(1000);
        
		driver.findElement(By.xpath("//span[text()='For my personal use']")).click();
	    Thread.sleep(1000);
	    
	    driver.findElement(By.name("firstName")).sendKeys("tiku");
	    Thread.sleep(1000);
	    driver.findElement(By.name("lastName")).sendKeys("chaudhari");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(1000);
	    
		driver.findElement(By.id("month")).click();
		driver.findElement(By.xpath("//option[text()='March']")).click();
		driver.findElement(By.id("day")).sendKeys("23");
		Thread.sleep(1000);
		driver.findElement(By.id("year")).sendKeys("2000");
	    Thread.sleep(1000);
	    driver.findElement(By.id("gender")).click();
	    driver.findElement(By.xpath("//option[text()='Female']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("selectioni2")).click();
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input[type='password']"))
		.sendKeys("tiku@1432");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[name='PasswdAgain']"))
		.sendKeys("tiku@1432");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input[type='tel']"))
		.sendKeys("9664714123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(1000);
		
		
	    driver.close();
}
}
