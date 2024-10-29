package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Locators
	
	By userName_Loc = By.xpath("//input[@placeholder='Username']");
	By pass_Loc = By.xpath("//input[@placeholder='Password']");
	By btnLogin_Loc = By.xpath("//button[normalize-space()='Login']");
	
	
	//Action Methods
	
	public void setUserName(String userName) {
		
		driver.findElement(userName_Loc).sendKeys(userName);
	}
	
	public void setPassword(String pwd) {
		
		driver.findElement(pass_Loc).sendKeys(pwd);;
	}

	public void clickLogin() {
		
		driver.findElement(btnLogin_Loc).click();
	}
}
