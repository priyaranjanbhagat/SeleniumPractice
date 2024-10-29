package WebTables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaginationTable {

	public static void main(String... s) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.opencart.com/admin/index.php");

		WebElement userName = driver.findElement(By.name("username"));
		userName.clear();
		userName.sendKeys("demo");

		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.clear();
		password.sendKeys("demo");

		Thread.sleep(3000);

		WebElement loginButton = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		loginButton.click();
		Thread.sleep(3000);
		if (loginButton.isDisplayed()) {
			loginButton.click();
		}

		Thread.sleep(7000);
		driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();
		driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();

		String text = driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
		System.out.println("Text available having total pages is : " + text);

		int totalPages = Integer.parseInt(text.substring(text.indexOf("(") + 1, text.indexOf("Pages") - 1));
		System.out.println("Total number of pages is : " + totalPages);

		for (int page = 2; page < 5; page++) {

			if (page > 1) {

				System.out.println("Hi");

				WebElement activePages = driver
						.findElement(By.xpath("//ul[@class='pagination']//*[text()=" + page + "]"));
				activePages.click();
				Thread.sleep(3000);
			}

			// reading data from the page

			int noOfRows = driver
					.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();

			for (int row = 1; row <= noOfRows; row++) {

				String customerName = driver
						.findElement(By.xpath(
								"//table[@class='table table-bordered table-hover']//tbody//tr[" + row + "]//td[2]"))
						.getText();
				String customerEmail = driver
						.findElement(By.xpath(
								"//table[@class='table table-bordered table-hover']//tbody//tr[" + row + "]//td[3]"))
						.getText();
			}

		}

	}

}
