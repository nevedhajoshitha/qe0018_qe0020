package DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base_Package.Base_Class;

public class WriteToWeb extends Base_Class{
public static void main(String[] args) throws IOException {
	Open("https://www.fb.com");
	WebElement user = driver.findElement(By.id("email"));
	WebElement pwd = driver.findElement(By.id("pass"));
	
	File f = new File("C:\\Users\\NEVEDHA\\eclipse2-workspace\\Batch18_20\\src\\test\\resources\\ReadData.xlsx");
	FileInputStream is = new FileInputStream(f);
	XSSFWorkbook w = new XSSFWorkbook(is);
	XSSFSheet s = w.getSheet("Sheet1");
	XSSFRow r = s.getRow(1);
	
	user.sendKeys(r.getCell(0).getStringCellValue());
	pwd.sendKeys(r.getCell(1).getStringCellValue());
	
	Close();
}
}
