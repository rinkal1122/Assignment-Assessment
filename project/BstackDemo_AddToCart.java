package com.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class BstackDemo_AddToCart {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.edge.driver", "D:\\SELENINUM\\msedgedriver.exe");
	
	WebDriver driver= new EdgeDriver();
	
	 driver.get("https://bstackdemo.com/");
	 
	driver.manage().window().maximize();
	
	 System.out.println("url is :"+ driver.getCurrentUrl());
	 System.out.println(" title is :"+ driver.getTitle());
	 
	 Thread.sleep(1000);

	 
	 driver.findElement(By.className("shelf-item__buy-btn")).click();
	 Thread.sleep(2000);
	 
	 driver.close();
     
}
}
