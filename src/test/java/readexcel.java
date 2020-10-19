import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readexcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("C:\\Users\\rohit\\Desktop\\demodata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = workbook.getSheetAt(0);
		
		String data0 = sheet1.getRow(1).getCell(1).getStringCellValue();
		
		String.valueOf(sheet1.getRow(1).getCell(1).getNumericCellValue());
						
		System.out.println(data0);
		
	}

}
