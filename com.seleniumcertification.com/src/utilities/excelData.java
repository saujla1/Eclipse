package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFEvaluationWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import constantValues.constantvalues;


public class excelData {
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow r;
	public static XSSFCell c;
	
	public static void setExvelPath(String path) throws Exception {
		File f=new File(constantvalues.excelpath);
		FileInputStream fis=new FileInputStream(f);
		wb=new XSSFWorkbook(fis);
		
	}
	public static String readvalues(String sheetname, int rownumber, int columnnumber) {
		ws=wb.getSheet(sheetname);
		c=ws.getRow(rownumber).getCell(columnnumber);
		if(c.getCellType()==c.CELL_TYPE_NUMERIC) {
			String str=NumberToTextConverter.toText(c.getNumericCellValue());
			return str;
		}
		else {
			String cellvalue=c.getStringCellValue();
			return cellvalue;
			
		}
		
		
	}
	public static void writevalues(String sheetname, int rownumber, int columnnumber, String value) throws Exception {
		ws=wb.getSheet(sheetname);
		c=ws.getRow(rownumber).getCell(columnnumber);
		c.setCellValue(value);
		FileOutputStream fos=new FileOutputStream(constantvalues.excelpath);
		wb.write(fos);
		fos.flush();
		fos.close();
	}
	

}
