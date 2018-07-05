package utilities;

import java.io.File;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import constantValues.constantvalues;

public class screenshots {
	public static void takingscreensht(TakesScreenshot ts, String name) throws Exception {
		DateFormat df= new SimpleDateFormat("mmddyy@hh@mm@ss");
		Date d= new Date();
		File filesrc =new File(constantvalues.evidencesfolder + name + df.format(d)+".jpeg");
		File filetmp=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.moveFile(filetmp, filesrc);
	}
	
}
