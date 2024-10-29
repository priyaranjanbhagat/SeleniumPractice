package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsVsAction {

	public static void main(String...s) {
		
	

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	
	WebElement rightClickBtn = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
	
	Actions action = new Actions(driver); //class, used to perform mouse action
	
	Action act = action.contextClick(rightClickBtn).build(); //interface, used to store created actions
	
	act.perform(); //performing an action
	
	}
}
