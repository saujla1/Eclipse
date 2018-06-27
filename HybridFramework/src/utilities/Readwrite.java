package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import constantvalues.Constantvalues;

public class Readwrite {

	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow r;
	public static XSSFCell c;
	
	public static void setexcelpath(String pathname) throws Exception {
		File f = new File(pathname);
		FileInputStream fis = new FileInputStream(f);
		wb = new XSSFWorkbook(fis);
	}
	
	public static String readvalues(String sheetname, int rownumber, int columnnumber) {
		ws = wb.getSheet(sheetname);
		c = ws.getRow(rownumber).getCell(columnnumber);
		
		if (c.getCellType()==c.CELL_TYPE_NUMERIC) {
			String str = NumberToTextConverter.toText(c.getNumericCellValue());
			return str;
		} else {
			String cellValue = c.getStringCellValue();
			return cellValue;
		}
	}
	
	public static void writeinexcel(String sheetname, int rownumber, int columnnumber, String value) throws Exception {
		ws = wb.getSheet(sheetname);
		c = ws.getRow(rownumber).getCell(columnnumber);
		c.setCellValue(value);
		
		FileOutputStream fos = new FileOutputStream(Constantvalues.excelpath);
		wb.write(fos);
		fos.close();
		
		FileInputStream fis = new FileInputStream(Constantvalues.excelpath);
		wb = new XSSFWorkbook(fis);
	}
	
//	public static void main(String[] args) throws Exception {
//		setexcelpath("C:\\26MayWeekEnd\\DatadrivenFramework\\Test.xlsx");
//		System.out.println(readvalues("TestData", 17, 3));
//		System.out.println(readvalues("TestData", 19, 3));
//	}
}
