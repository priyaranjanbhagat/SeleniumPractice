package TestNGConcept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHRM {

	/*
	 * Launch the application 
	 * Test the logo 
	 * Login to the application 
	 * Logout from the application
	 */

	WebDriver driver;

	@Test(priority=1)
	void launchApplication() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		System.out.println("Successfylly Launch the application");
	}

	@Test(priority=2)
	void testLogo() throws InterruptedException {

		Thread.sleep(3000);
		boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		if (status == true) {
			System.out.println("Logo is displayed successfully in the App");
		}

		else {

			System.out.println("Logo is not displayed successfully");
		}
	}
	
	@Test(priority=3)
	void loginApplicaiton() {
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		System.out.println("Successfully login to the Application");
	}
	
	@Test(priority=4)
	void logoutApplication() {
		driver.close();
		System.out.println("Logout successfully from the application");
	}

}
