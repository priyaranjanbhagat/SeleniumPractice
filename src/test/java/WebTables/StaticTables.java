package WebTables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTables {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.get("http://www.testautomationpractice.blogspot.com");

		/* Find total number of rows in Multiple Table */
		int totalRowsInMultipleTable = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("Total row count in multiple table is : " + totalRowsInMultipleTable);

		/* Find total number of rows in Single table */
		int totalRowsInSingletable = driver.findElements(By.tagName("tr")).size();
		System.out.println("Total row count in a Single table is : " + totalRowsInSingletable);

		/* Find total number of columns in Single table */
		int totalColumnInSingleTable = driver.findElements(By.tagName("th")).size();
		System.out.println("Total column count in Single table is : " + totalColumnInSingleTable);

		/* Find total number of column in Multiple table */
		int totalColumnInMultipleTable = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("Total column count in multiple table is : " + totalColumnInMultipleTable);

		/* Read data from specific Row and Column (ex: 5th row and 2nd column) */
		WebElement data = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[2]"));
		String data5Row2Column = data.getText();
		System.out.println("Data From 5th Row and 2nd Column is : " + data5Row2Column);

		/* Read data from all the rows and columns */
		for (int r = 2; r <= totalRowsInMultipleTable; r++) {

			for (int c = 1; c <= totalColumnInMultipleTable; c++) {

				String allValues = driver
						.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[" + c + "]")).getText();
				System.out.print(allValues + "\t");
			}

			System.out.println();
		}

		/* Print Book Name whose Author is Mukesh */
		for (int r = 2; r <= totalRowsInMultipleTable; r++) {

			String author = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[2]")).getText();
			// System.out.println("Author name is : " + author);

			if (author.equals("Mukesh")) {
				String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[1]"))
						.getText();
				System.out.println("Author name is : " + author + "\t Book name is : " + bookName);
			}

		}

		/* Find total prices of all the books */
		int totalPrice = 0;
		for (int r = 2; r <= totalRowsInMultipleTable; r++) {

			String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[4]")).getText();
			totalPrice = totalPrice + Integer.parseInt(price);

		}

		System.out.println("Total Price of the All Book is : " + totalPrice);
	}

}
