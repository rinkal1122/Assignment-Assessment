package com.assement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Quse3 {
	WebDriver driver=null;
	@BeforeTest
	public void demo() {
	
		WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
			
	driver.get("https://demoqa.com/webtables");
	
	driver.manage().window().maximize();
	
	}
	@Test
	public void Edit() throws InterruptedException {
		driver.findElement(By.id("addNewRecordButton")).click();
		Thread.sleep(2000);
	}
	@Test
	public void name() throws InterruptedException {
		driver.findElement(By.id("firstName")).sendKeys("rinkal");
		driver.findElement(By.id("lastName")).sendKeys("chaudhari");
		driver.findElement(By.id("userEmail")).sendKeys("rinkalchaudhari@gmail.com");
		driver.findElement(By.id("age")).sendKeys("23");
		driver.findElement(By.id("salary")).sendKeys("25000");
		driver.findElement(By.id("department")).sendKeys("QA");
		Thread.sleep(2000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(5000);
	}
	@Test
		public void test() throws InterruptedException {
			
		
		driver.findElement(By.xpath("//*[@id=\"delete-record-2\"]")).click();
		Thread.sleep(2000);
	
		driver.close();
		System.out.println("Thanks");
		
		driver.close();
}
}
