package OptionsClass;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessMode {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.digitalfiverr.com");
		String title = driver.getTitle();
		System.out.println("Title of the page is : " + title);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		
		//File targetFile = new File("D:\\Automation\\com.selenium.practice\\screenshots\\fullpage.png");
		File targetFile = new File(System.getProperty("user.dir")+"\\screenshots\\fullpage1.png");
		
		sourceFile.renameTo(targetFile);
	}

}
