package MODUL_7;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/*
 * W.a. junit program to check gmail login using with @before,@after,@Test
 */
public class QUSTION14 {
	
	WebDriver  driver;
	@Before
	public void beforesetup() {
		System.setProperty("webdriver.edge.driver", "D:\\SELENINUM\\msedgedriver.exe");
		
		 driver= new EdgeDriver();
			driver.get("https://accounts.google.com/v3/signin/identifier?"
					+ "continue=https://"
					+ "mail.google.com/mail/&service=mail&theme=glif&flowName="
					+ "GlifWebSignIn&flowEntry=ServiceLogin");
		 		driver.manage().window().maximize();
		
	}
	@Test
	public void test() throws InterruptedException {
	
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
	
	driver.findElement(By.cssSelector("input[type='password']")).sendKeys("123@123");
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("input[name='PasswdAgain']")).sendKeys("123@123");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.cssSelector("input[type='tel']")).sendKeys("9664714123");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	Thread.sleep(1000);
	
	}
@After   
public void aftersetup() {
	System.out.println("it's done dude...");
	driver.close();
}
	
	}
	
		

