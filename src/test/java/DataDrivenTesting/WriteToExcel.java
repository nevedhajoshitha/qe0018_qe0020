package DataDrivenTesting;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToExcel {
public static void main(String[] args) throws IOException, InvalidFormatException {
	File f = new File("C:\\Users\\NEVEDHA\\eclipse2-workspace\\Batch18_20\\src\\test\\resources\\WriteData.xlsx");
	
	XSSFWorkbook w = new XSSFWorkbook();
	
	XSSFSheet s = w.createSheet("NewSheet");
	
	XSSFRow r = s.createRow(3);
	
	//XSSFCell c = r.createCell(2);
	
	//c.setCellValue("Welcome");
	
	r.createCell(2).setCellValue("welcome");
	
	FileOutputStream os = new FileOutputStream(f);
	
	w.write(os);
	
}
}
