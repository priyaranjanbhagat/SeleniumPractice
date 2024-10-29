package DataDrivenConcept;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {

		/*---------Excel --- Workbook --- Sheet --- Row --- Cell ----------*/

		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\testdata\\readingdata.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(file);

		XSSFSheet sheet = workbook.getSheet("Sheet1");
		// XSSFSheet sheet = workbook.getSheetAt(0);

		int totalrows = sheet.getLastRowNum();
		int totalCells = sheet.getRow(1).getLastCellNum();

		System.out.println("Total rows is : " + totalrows); // Rows starting from 0 index
		System.out.println("Total cell is : " + totalCells); // Cells starting from 1 index

		for (int row = 0; row <= totalrows; row++) {

			XSSFRow currentRow = sheet.getRow(row);

			for (int cell = 0; cell < totalCells; cell++) {

				XSSFCell cellValue = currentRow.getCell(cell);

				System.out.print(cellValue.toString() + "\t");

			}

			System.out.println(" ");

		}

		workbook.close();
		file.close();

	}

}
