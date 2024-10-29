package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String... s) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");

		driver.switchTo().frame("iframeResult");

		Thread.sleep(3000);
		WebElement box1 = driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement box2 = driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement copyButton = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));

		box1.clear();
		box1.sendKeys("Hello! Priyaranjan");
		String enteredValue = box1.getAttribute("value");
		System.out.println("Entered value is : "+enteredValue);

		Actions action = new Actions(driver);
		action.doubleClick(copyButton).build().perform();

		String copiedValue = box2.getAttribute("value");
		System.out.println("Copied value is : " + copiedValue);

		if (copiedValue.equals(enteredValue)) {

			System.out.println("Text copied successfully");
		} else {
			System.out.println("Text not copied properly");
		}

	}

}
