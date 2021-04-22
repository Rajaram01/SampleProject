package org.Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Smple {
	
	

	public static void main(String[] args) throws IOException   {
		File f=new File("C:\\Users\\Raja ram Aruchamy\\Desktop\\raja-excel.xlsx");
		
		FileInputStream fin=new FileInputStream(f);
		
		Workbook w=new XSSFWorkbook(fin);
		
		Sheet sheet = w.getSheet("Sheet1");
		
		Row row=sheet.getRow(1);
		
		Cell cell=row.getCell(0);
		
		System.out.println(cell);
	}

}
