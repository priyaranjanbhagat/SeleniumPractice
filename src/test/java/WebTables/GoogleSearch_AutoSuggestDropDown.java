package WebTables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch_AutoSuggestDropDown {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();	
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		int eleSize = list.size();
		System.out.println("Element sizi is : " + eleSize);
		
		for(int i=0; i<list.size(); i++) {
			
			String eleList = list.get(i).getText();
			System.out.println(eleList);
			
			if(eleList.equals("selenium webdriver")) {
				list.get(i).click();
				break;
			}
			
		}
		
		
	
//		driver.close();
	}

}
