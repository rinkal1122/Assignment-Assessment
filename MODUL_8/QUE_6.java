package MODUL_8;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class QUE_6 {
	@DataProvider(name = "tiku")
	public Object[][] readExcel () throws InvalidFormatException, IOException {
		Object[][] data= null;
			String filepath= "D:\\SELENINUM\\read_data.xlsx";
				File file = new File(filepath);
					XSSFWorkbook workbook =new XSSFWorkbook(file);
					
						Sheet sheet =workbook.getSheet("Sheet3");
						
					int nrow = sheet.getPhysicalNumberOfRows();
		System.out.println("no of row is :"+nrow);
		
		
		data= new Object [nrow][];
		
		for (int i = 0; i < data.length; i++) {
			
					Row row = sheet.getRow(i);
					
			
			int n_coll = row.getPhysicalNumberOfCells();
			
			
					data [i] = new Object [n_coll];
			
			for (int j = 0; j < data[i].length; j++) {
							Cell cell =row.getCell(j);
				cell.setCellType(CellType.STRING);
				data [i][j]= cell.getStringCellValue();
				
			}
			
		}
		
		return data;
		
	}
WebDriver driver =null;
	@Test(dataProvider = "tiku")
	public void test(String keyword) throws InvalidFormatException, IOException, InterruptedException {
		Object[][] data= readExcel();
		  
			System.setProperty("webdriver.edge.driver", "D:\\SELENINUM\\msedgedriver.exe");
			
			if (keyword.equals("Open Browser")) {
				 driver= new EdgeDriver();
				 driver.manage().window().maximize();
			}
			
			else if (keyword.equals("Enter Url")) {
				 driver.get("https://www.saucedemo.com");
				 
					
					System.out.println("url is :"+ driver.getCurrentUrl());
					 System.out.println(" title is :"+ driver.getTitle());
					 
					 Thread.sleep(2000);
			}
			
			else if (keyword.equals("Enter Username")) {

				 driver.findElement(By.id("user-name")).sendKeys("standard_user");
				 Thread.sleep(5000);
			
			}
			else if (keyword.equals("Enter Password")) {
				 driver.findElement(By.id("password")).sendKeys("secret_sauce");
				 Thread.sleep(5000);
			}	
			
			else if (keyword.equals("Click Login ")) {
				 driver.findElement(By.id("login-button")).click();
				 Thread.sleep(5000);
			}
			 
			else if (keyword.equals("Click Menu")) {
							 driver.findElement(By.id("react-burger-menu-btn")).click();
				 Thread.sleep(5000);
			}

			else if (keyword.equals("Click LogOUt")) {

				 driver.findElement(By.id("logout_sidebar_link")).click();
		
				System.out.println("BYE BYE");
				driver.close();
			}
			
	
		
	}
}
