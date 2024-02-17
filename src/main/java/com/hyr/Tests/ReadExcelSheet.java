package com.hyr.Tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelSheet {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file = new File("C:\\eclipse-java-2023-12-R-win32-x86_64\\eclipse\\readData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(1);
		//sheet.getRow(0).getCell(0).setCellValue("Ashok");
		String cellValue = sheet.getRow(0).getCell(0).getStringCellValue();
		//System.out.println(cellValue);
		int rowCount = sheet.getPhysicalNumberOfRows();
		for(int i=0; i < rowCount; i++)
		{
			XSSFRow row = sheet.getRow(i);
			int cellCount = row.getPhysicalNumberOfCells();
			for(int j=0; j < cellCount; j++)
			{
				XSSFCell cell = row.getCell(j);
				
			}
		}
		
		workbook.close();
		fis.close();		
	}
	
	public void getCellValue(XSSFCell cell)
	{
	//switch	(cell.getCellType();
		
	}
	}

	
}
