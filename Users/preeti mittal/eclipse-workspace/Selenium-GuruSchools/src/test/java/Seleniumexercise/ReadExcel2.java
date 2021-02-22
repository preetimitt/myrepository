package Seleniumexercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("C:\\Users\\preeti mittal\\Downloads\\AutomationData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis); //class obj = new class("filename");
		
		XSSFSheet sheet = workbook.getSheet("Selenium"); //workbook.getSheetAt(2);
		XSSFRow row = sheet.getRow(6);
		XSSFCell cell = row.getCell(0);	
		System.out.println("Value of 6,0 "+ cell); // 6th row & 1st column -> (6,0)
		
		System.out.println("Rows "+ sheet.getPhysicalNumberOfRows());
		System.out.println("Columns "+ sheet.getRow(2).getLastCellNum());

		int rows= sheet.getPhysicalNumberOfRows();
         int columns= sheet.getRow(6).getLastCellNum();
		
		String celldata=null;
		for(int i=0;i<rows;i++)  //Rows
		{
			for(int j=0;j<columns;j++) { //Columns
				
				celldata = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(celldata+"\t");
				
				//System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
			}
			System.out.println();
	}

}
}