package com.assement;

import java.io.File;
import java.sql.Driver;

import org.checkerframework.checker.units.qual.degrees;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Que1 {
	
	WebDriver driver;
	@Test
	public void beforesetup() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		 
		driver.manage().window().maximize();
		System.out.println("url is :"+ driver.getCurrentUrl());
		 System.out.println(" title is :"+ driver.getTitle());
		 
		 Thread.sleep(2000);
		 
	}	
	@Test
	public void test() throws InterruptedException {
		
		driver.findElement(By.id("firstName")).sendKeys("Rinkal");
		Thread.sleep(2000);
		
		driver.findElement(By.id("lastName")).sendKeys("Chaudhari");
	
		Thread.sleep(2000);
	}
		@Test
		public void test1() throws InterruptedException {
			
			driver.findElement(By.id("userEmail")).sendKeys("tiku@gmail.com");
			Thread.sleep(2000);
			
		}
			@Test
			public void test2() throws InterruptedException {
				
	driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label"))
	.click();
	Thread.sleep(2000);
	
	
			}
			@Test
			public void test3() throws InterruptedException {
				
				driver.findElement(By.id("userNumber")).sendKeys("9664714123");
				Thread.sleep(2000);
		
				}
			@Test
				public void test4() throws InterruptedException {
					
					driver.findElement(By.id("dateOfBirthInput")).click();
					driver.findElement(By.xpath("//option[text()='March']")).click();
				    driver.findElement(By.className("react-datepicker__year-select")).
				    sendKeys("2000");
				    driver.findElement(By.xpath("//div[text()='3']")).click();
				    Thread.sleep(2000);
			}	 			
				    @Test
					public void test5() throws InterruptedException {
						
						driver.findElement(By.id("subjectsInput")).
						sendKeys("softer testing ");
						Thread.sleep(2000);
						
				    }	 			
				    @Test
					public void test6() throws InterruptedException {
						
			driver.findElement(By.xpath("//lable[text()='Reading']")).click();
			driver.findElement(By.xpath("//lable[text()='Music']")).click();
										Thread.sleep(2000);
										
				    }	 			
				    @Test
					public void test7() throws InterruptedException {
						
			driver.findElement(By.id("currentAddress")).sendKeys("Dindoli");
			Thread.sleep(2000);								
			
			}
			    @Test
				public void test8() throws InterruptedException {
					
		driver.findElement(By.id("state")).click();
		driver.findElement(By.xpath("//div[text()='NCR']")).click();
		driver.findElement(By.id("city")).click();
		driver.findElement(By.xpath("//Div[text()='Delhi']")).click();
		Thread.sleep(2000);	
		
			    }
		 @AfterTest
			public void test9() throws InterruptedException {
				
	driver.findElement(By.id("submit")).click();
	Thread.sleep(3000);								
	driver.close();
	}
		
	}
	
