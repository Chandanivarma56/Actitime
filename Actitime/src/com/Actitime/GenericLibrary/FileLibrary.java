package com.Actitime.GenericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLibrary {
	public String readDataFromPropertyFile(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("./Testdata/Commondata.property");
		Properties p=new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
		}
	public String readDataFromExcel(String Sheetname,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis1=new FileInputStream("./TestData/Automation.xlsx");
		Workbook wb = WorkbookFactory.create(fis1);
		String value = wb.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
		return value;
		
	}
	
}
	
