package DataDrivenConcept;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDynamicDataIntoExcel {

	public static void main(String... s) throws IOException {

		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\testdata\\writingdynamicdata.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Student Record");

		Scanner sc = new Scanner(System.in);
		System.out.print("How many rows need : ");
		int noOfRows = sc.nextInt();

		System.out.print("How many cells need : ");
		int noOfCells = sc.nextInt();

		for (int r = 0; r <= noOfRows; r++) {

			XSSFRow currentRow = sheet.createRow(r);

			for (int c = 0; c < noOfCells; c++) {
				
				XSSFCell cell = currentRow.createCell(c);
				System.out.println("Enter the cell value " + c);
				cell.setCellValue(sc.next());
			}
		}

		workbook.write(file);
		workbook.close();
		file.close();

		System.out.println("File is created successfully........");

	}

}
