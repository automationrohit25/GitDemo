import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datadriven {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("C:\\Users\\rohit\\eclipse-workspace\\ExcelDriven\\data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		int sheets = workbook.getNumberOfSheets();
		System.out.println(sheets);
//		for (int i =0; i < sheets; i++) {
//			
//			if (workbook.getSheetName(i).equalsIgnoreCase("Sheet1")) {
				
				XSSFSheet sheet = workbook.getSheet("Sheet1");
				int rowcount = sheet.getLastRowNum();
				System.out.println(rowcount);
				XSSFRow row = sheet.getRow(2);
				int colcount = row.getLastCellNum();
				System.out.println(colcount);
				
				double data = row.getCell(2).getNumericCellValue();
				System.out.println(data);
				sheet.getRow(4).getCell(2).setCellValue(" ");
				
				fis.close();
				FileOutputStream fos = new FileOutputStream("C:\\Users\\rohit\\eclipse-workspace\\ExcelDriven\\data.xlsx");
				workbook.write(fos);
				fos.close();
				System.out.println(sheet.getRow(4).getCell(2).getNumericCellValue());
			    
				
			}
			
//		}
	}


