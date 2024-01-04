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
import org.testng.annotations.Test;

public class QUE_4 {
	public String[][] readExcel () throws InvalidFormatException, IOException {
		String[][] data= null;
		String filepath= "D:\\SELENINUM\\read_data.xlsx";
			File file = new File(filepath);
		XSSFWorkbook workbook =new XSSFWorkbook(file);
		Sheet sheet =workbook.getSheet("Sheet1");
		int nrow = sheet.getPhysicalNumberOfRows();
		System.out.println("no of row is :"+nrow);
		data= new String [nrow][];
		for (int i = 0; i < data.length; i++) {
		Row row = sheet.getRow(i);
		int n_coll = row.getPhysicalNumberOfCells();
		data [i] = new String [n_coll];
		for (int j = 0; j < data[i].length; j++) {
							Cell cell =row.getCell(j);
				cell.setCellType(CellType.STRING);
				data [i][j]= cell.getStringCellValue();
}
}
				return data;
			}
	@Test
	public void test() throws InvalidFormatException, IOException, InterruptedException {
		String[][] data= readExcel();
		  WebDriver  driver;
		System.setProperty("webdriver.edge.driver", "D:\\SELENINUM\\msedgedriver.exe");
		for (int i = 0; i < data.length; i++) {
		driver= new EdgeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		System.out.println("url is :"+ driver.getCurrentUrl());
	 System.out.println(" title is :"+ driver.getTitle());
			 Thread.sleep(2000);
		 driver.findElement(By.id("user-name")).sendKeys(data [i][0]);
			 Thread.sleep(5000);
			 
		driver.findElement(By.id("password")).sendKeys(data [i][1]);
			 Thread.sleep(5000);
			 
			 driver.findElement(By.id("login-button")).click();
			 Thread.sleep(5000);
			 
				 driver.findElement(By.id("react-burger-menu-btn")).click();
				 Thread.sleep(5000);
			
				 driver.findElement(By.id("logout_sidebar_link")).click();
		
				System.out.println("BYE BYE");
				driver.close();
		
	}
	}

}
