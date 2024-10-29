package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {
	
	public static void main(String...s) {
		
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		Actions action = new Actions(driver);
		
		WebElement minSlider = driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
		System.out.println("Default location of the Slider is : "+ minSlider.getLocation()); //(59, 250)
		
	    action.dragAndDropBy(minSlider, 100, 250).build().perform();
		System.out.println("Min Slider loction after moving : " + minSlider.getLocation());
		
		
		WebElement maxSlider = driver.findElement(By.xpath("//div[@class='price-range-block']//span[2]"));
		System.out.println("Default location of the Max SLider : " + maxSlider.getLocation());
		
		action.dragAndDropBy(maxSlider, -100, 249).perform(); //reduce -100 from maxSlider x coordinate 
		System.out.println("Max Slider location after moving : " + maxSlider.getLocation());
		
	}

}
