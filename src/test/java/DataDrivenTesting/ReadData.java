package DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {
public static void main(String[] args) throws IOException {
	File f = new File("C:\\Users\\NEVEDHA\\eclipse2-workspace\\Batch18_20\\src\\test\\resources\\ReadData.xlsx");
	
	FileInputStream is = new FileInputStream(f);
	
	XSSFWorkbook w = new XSSFWorkbook(is);
	
	XSSFSheet s = w.getSheet("Sheet1");
	
	for(int i =0; i<s.getPhysicalNumberOfRows(); i++)
	{
		XSSFRow r = s.getRow(i);
		
		for(int j=0; j<r.getPhysicalNumberOfCells(); j++)
		{
			XSSFCell c = r.getCell(j);
			System.out.println(c);
		}
	}
}
}
