package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Iterator;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow r;
	public static XSSFCell c;
	
	public static void setexcelpath(String path) throws Exception {
		File src= new File(path);
		FileInputStream fis= new FileInputStream(src);
		wb= new XSSFWorkbook(fis);
		
	}
	
	public static String readvalues(String sheetnumber, int rownumber, int columnnumber) {
		ws=wb.getSheet(sheetnumber);
		c=ws.getRow(rownumber).getCell(columnnumber);
		if(c.getCellType()==c.CELL_TYPE_NUMERIC) {
			String str=NumberToTextConverter.toText(c.getNumericCellValue());
			return str;
		}
		else {
		String cellvalue=ws.getRow(rownumber).getCell(columnnumber).getStringCellValue();
			return cellvalue;
		}
		
	}
	public static void writevalues(String sheetnumber, int rownumber, int columnnumber, String value ) throws Exception {
		ws=wb.getSheet(sheetnumber);
		ws.getRow(rownumber).getCell(columnnumber).setCellValue(value);
		FileOutputStream fos= new FileOutputStream("D:\\Eclipse\\test_types.xlsx");
		wb.write(fos);
		
		//FileInputStream fis=new FileInputStream("D:\\Eclipse\\test_types.xlsx");
		//wb=new XSSFWorkbook(fis);
		
				}
	
	public static void main(String[] args) throws Exception {
		
//		setexcelpath("D:\\Eclipse\\test_types.xlsx");
//		String username=readvalues("Sheet1", 1,0);
//		System.out.println(username);
//			
//		int nrows=ws.getLastRowNum();
//		System.out.println(nrows);
//		for (int i = 0; i < nrows+1; i++) {
//			writevalues("Sheet1",i,2,"FAIL");
//			String results=readvalues("Sheet1",i,2);
//			System.out.println(results);
//			
		}
		
		

	}

