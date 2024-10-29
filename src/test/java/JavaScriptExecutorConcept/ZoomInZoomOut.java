package JavaScriptExecutorConcept;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomInZoomOut {

	public static void main(String... s) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.digitalfiverr.com");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.manage().window().minimize();
		
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//Zoom in browser window to 70%
		js.executeScript("document.body.style.zoom='70%'");
	}

}
