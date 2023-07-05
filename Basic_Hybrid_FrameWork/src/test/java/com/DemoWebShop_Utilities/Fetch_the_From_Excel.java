package com.DemoWebShop_Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_the_From_Excel  implements Frame_Work_Constants{

	public String excel(String sheet_name,int row_no,int cell_no) throws EncryptedDocumentException, IOException
	{
	FileInputStream fis=new FileInputStream(Excel_path);
	Workbook book = WorkbookFactory.create(fis);
	Sheet sheet = book.getSheet(sheet_name);
	Row row = sheet.getRow(row_no);
	Cell cell = row.getCell(cell_no);
	String value = cell.getStringCellValue();
	return value;	
	}
	}
