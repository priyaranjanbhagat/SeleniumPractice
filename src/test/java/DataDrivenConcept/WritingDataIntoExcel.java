package DataDrivenConcept;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoExcel {

	public static void main(String[] args) throws IOException {

		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\testdata\\writingdata.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("BookData");
		
		XSSFRow row1 = sheet.createRow(0);		
			row1.createCell(0).setCellValue("BookName");
			row1.createCell(1).setCellValue("PurchaseDate");
			row1.createCell(2).setCellValue("Amount");
			row1.createCell(3).setCellValue("Location");
			
		XSSFRow row2 = sheet.createRow(1);
			row2.createCell(0).setCellValue("Java");
			row2.createCell(1).setCellValue("10 Oct 2024");
			row2.createCell(2).setCellValue("200 INR");
			row2.createCell(3).setCellValue("India");
			
		workbook.write(file);
		workbook.close();
		file.close();
		
		
	}

}
