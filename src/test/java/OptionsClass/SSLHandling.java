package OptionsClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLHandling {
	
	public static void main(String...s) {
		
		ChromeOptions option = new ChromeOptions();
		option.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://expired.badssl.com/");
		
		String title = driver.getTitle();
		
		System.out.println("Title of the page is : " + title);
	}

}
