package JavaScriptExecutorConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageScroll {

	public static void main(String... s) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://digitalfiverr.com/");
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Scroll down page by pixel number
		js.executeScript("window.scrollBy(0,1200)", " ");
		System.out.println(js.executeScript("return window.pageYOffset;"));

		// Scroll the page till element is visible
		WebElement techBlog = driver.findElement(By.xpath("//a[normalize-space()='Technical Blog']"));
		js.executeScript("arguments[0].scrollIntoView();", techBlog);
		System.out.println(js.executeScript("return window.pageYOffset;"));

		// Scroll page till end of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));

		// Scrolling up to initial position
		js.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
	}

}
