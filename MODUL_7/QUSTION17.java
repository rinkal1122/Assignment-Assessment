package MODUL_7;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
/*
 * W.a. TestNG program to check gmail login using with
 * @beforetest,@aftertest,@Test
 */

public class QUSTION17 {
	WebDriver  driver;
	@Before
	public void beforesetup() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\SELENINUM\\msedgedriver.exe");
		
		 driver= new EdgeDriver();
		
		 driver.get("https://www.saucedemo.com");
		 
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
}
	@Test
	public void Createaccount() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Create account']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='For my personal use']")).click();
	    Thread.sleep(1000);
	}
	@Test
    public void username() throws InterruptedException {
    	driver.findElement(By.name("firstName")).sendKeys("tiku");
        Thread.sleep(1000);
        driver.findElement(By.name("lastName")).sendKeys("chaudhari");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='Next']")).click();
    	Thread.sleep(1000);
	}
	@Test
    public void personalinfo() throws InterruptedException {
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
	}
    @Test
    public void idname() throws InterruptedException {
    	driver.findElement(By.id("selectioni2")).click();
    	Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='Next']")).click();
    	Thread.sleep(1000);
	}
	@Test
	public void password() throws InterruptedException {
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("tiku1432");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[name='PasswdAgain']")).sendKeys("tiku1432");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(1000);
	}
	@Test
	private void number() throws InterruptedException {
		driver.findElement(By.cssSelector("input[type='tel']")).sendKeys("9664714123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(1000);	
	}
	@After   
	public void aftersetup() {
		System.out.println("byeee byeee .....");
		driver.close();
	}	
}