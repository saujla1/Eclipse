package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWrite {
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow r;
	public static XSSFCell c;
	
	public static void setexcelpath(String pathname) throws Exception{
		File f = new File(pathname);
		FileInputStream fis = new FileInputStream(f);
		wb=new XSSFWorkbook(fis);
		
		
		
	}
	
	public static String readvalues(String sheetname, int rownumber, int columnnumber) {
		ws=wb.getSheet(sheetname);
		c=ws.getRow(rownumber).getCell(columnnumber);
		String cellvalue= c.getStringCellValue();
		return cellvalue;
		
	}
	
	public static void writeinexcel(String sheetname, int rownumber, int columnnumber, String value) throws Exception {
		ws=wb.getSheet(sheetname);
		c=ws.getRow(rownumber).getCell(columnnumber);
		c.setCellValue(value);
		
		FileOutputStream fos= new FileOutputStream("D:\\Eclipse\\test_types.xlsx");
		wb.write(fos);
		fos.close();
		
		FileInputStream fis= new FileInputStream("D:\\Eclipse\\test_types.xlsx");
		wb=new XSSFWorkbook(fis);
		
					
	}
	public static void main(String[] args) throws Exception{
		
		setexcelpath("D:\\Eclipse\\test_types.xlsx");
		String name=readvalues("sheet1", 1, 4);
		System.out.println(name);
		
		writeinexcel("Sheet1", 1, 5, "PASS");
		writeinexcel("Sheet1", 2, 5, "FAIL");
		writeinexcel("Sheet1", 3, 5, "PASS");
		
		
	}

}
