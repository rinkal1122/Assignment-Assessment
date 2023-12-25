package MODUL_7;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*
 *  W.a. TestNG program to perform test with webdriver to login process of facebook
 */

public class QUSTION16 {
	WebDriver  driver=null;
	@BeforeTest
	public void beforesetup() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\SELENINUM\\msedgedriver.exe");
		
		 driver= new EdgeDriver();
		
		 driver.get("https://www.facebook.com/");
		 
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
}
	@Test
	public void enterUsername() throws InterruptedException {
      driver.findElement(By.id("email")).sendKeys("tikuchaudhari@gmail.com");
      Thread.sleep(2000);
	}
	@Test
	public void enterpassword() throws InterruptedException {
      driver.findElement(By.id("pass")).sendKeys("1234");
      Thread.sleep(2000);	
	}
	@Test
	public void loginbutton() throws InterruptedException {
      driver.findElement(By.name("login")).click();
      Thread.sleep(2000);
	}
	@AfterTest
	public void after() {
		System.out.println("it's done dude...");
		driver.close();
	}
}