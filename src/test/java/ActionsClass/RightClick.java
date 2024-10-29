package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	
	public static void main(String...s) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightClickBtn = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		//Perform right click option
		Actions action = new Actions(driver);
		action.contextClick(rightClickBtn).build().perform();
		
		Thread.sleep(3000);
		
		//click on Copy btn
		driver.findElement(By.xpath("//li//span[contains(text(),'Copy')]")).click();
		
		//Switch to alert and accept 
		driver.switchTo().alert().accept();
		
	
	}

}
