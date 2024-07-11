package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.digitalfiverr.com/");

		Thread.sleep(5000);

		WebElement hoverEle = driver.findElement(By.xpath("//*[@id='nav']/li[3]/a"));

		Actions action = new Actions(driver);
		action.moveToElement(hoverEle).build().perform();
		
		driver.findElement(By.linkText("Android App Development")).click();
	}

}
