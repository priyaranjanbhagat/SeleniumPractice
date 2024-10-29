package TakeScreenShot;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FullPageScreenShot {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.digitalfiverr.com");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		
		//File targetFile = new File("D:\\Automation\\com.selenium.practice\\screenshots\\fullpage.png");
		File targetFile = new File(System.getProperty("user.dir")+"\\screenshots\\fullpage1.png");
		
		sourceFile.renameTo(targetFile);
		
	}

}
