package JavaScriptExecutorConcept;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickAndSendData {

	public static void main(String... s) {

		WebDriver driver = new ChromeDriver();
		// ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement inputBox = driver.findElement(By.xpath("//input[@id='name']"));

		// Passing the text into input box -- alternate of sendKeys()
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// JavascriptExecutor js = driver;
		js.executeScript("arguments[0].setAttribute('value', 'John')", inputBox);

		//clicking on element -- alternate of click()
		WebElement selectGender = driver.findElement(By.xpath("//input[@id='female']"));
		js.executeScript("arguments[0].click()", selectGender);
	}

}
