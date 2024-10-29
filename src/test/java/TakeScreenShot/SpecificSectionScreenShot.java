package TakeScreenShot;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpecificSectionScreenShot {

	public static void main(String...s) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.digitalfiverr.com");
		
		WebElement servicesSection = driver.findElement(By.xpath("//body/div[@class='main-wrapper']/section[2]/div[1]"));
		File sourceFile = servicesSection.getScreenshotAs(OutputType.FILE);
		File targetFile = new File(System.getProperty("user.dir")+"\\screenshots\\servicesSection.png");
		sourceFile.renameTo(targetFile);
		
	}
	
}
