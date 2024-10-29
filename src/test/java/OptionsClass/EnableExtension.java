package OptionsClass;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EnableExtension {

	public static void main(String[] args) {
	
		ChromeOptions option = new ChromeOptions();		
		File file = new File("D:\\Automation\\AutomationFile\\SelectorsHub-XPath-Helper-Chrome-Web-Store.crx");
		option.addExtensions(file);
		
		WebDriver driver = new ChromeDriver(option);	
		
		driver.get("https://www.digitalfiverr.com");
		String title = driver.getTitle();
		
		System.out.println("Title of the page is : " + title );
		

	}

}
