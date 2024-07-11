package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10)); // Wait for page fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // wait for element fully loaded

		driver.get("https://jqueryui.com/droppable/");

		driver.switchTo().frame(0); // switch to frame

		WebElement src = driver.findElement(By.id("draggable"));
		WebElement des = driver.findElement(By.id("droppable"));

		Actions action = new Actions(driver);

		// we can use following code to drag and drop concept

//		action.clickAndHold(src).dragAndDrop(src, des).build().perform();
//		action.dragAndDrop(src, des).build().perform();
		action.clickAndHold(src).moveToElement(des).release().build().perform();

	}

}
