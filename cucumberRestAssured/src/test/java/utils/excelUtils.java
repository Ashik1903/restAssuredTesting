package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelUtils {
	
	public void getCellData() {
		
		String path = "./data/testData.xlxs";
		try {
			XSSFWorkbook workbook = new XSSFWorkbook(path);
			XSSFSheet sheet = workbook.getSheet("sheet1");
			
			
			
		//	int rowCount = sheet.getPhysicalNumberOfRows();
			
			
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}

}
