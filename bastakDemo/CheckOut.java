package bastakDemo;

public class CheckOut {
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
	 42 changes: 42 additions & 0 deletions42  
	project/BstackDemo_Signin.java
	@@ -0,0 +1,42 @@
	package com.project;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.edge.EdgeDriver;

	public class BstackDemo_Signin {
	public static void main(String[] args) throws InterruptedException {

		   System.setProperty("webdriver.edge.driver", "D:\\SELENINUM\\msedgedriver.exe");

			WebDriver driver= new EdgeDriver();

			 driver.get("https://bstackdemo.com/signin");

			driver.manage().window().maximize();

			 System.out.println("url is :"+ driver.getCurrentUrl());
			 System.out.println(" title is :"+ driver.getTitle());

			 Thread.sleep(2000);

			driver.findElement(By.id("username")).click();
			Thread.sleep(5000);

			driver.findElement(By.xpath("//div[text()='demouser']")).click();

			Thread.sleep(5000);

			driver.findElement(By.id("password")).click();

		driver.findElement(By.xpath("//div[text()='testingisfun99']")).click();

			Thread.sleep(5000);

			driver.findElement(By.class("buy-btn")).click();
			Thread.sleep(5000);

			 driver.close();

	}
}
