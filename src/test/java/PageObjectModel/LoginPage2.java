package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {

	WebDriver driver;

	LoginPage2(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Locators
	@FindBy(how=How.XPATH, using="//input[@placeholder='Username']")//This is another flavour to find webelemnt
	WebElement userName1;
	
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement userName;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement pass;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement loginButton;
	
	
	//Action Methods
	
	public void setUserName(String user) {
		
		userName.sendKeys(user);
	}
	
	public void setPassword(String pwd) {
		
		pass.sendKeys(pwd);
	}

	public void clickLogin() {
		
		loginButton.click();
	}
}
