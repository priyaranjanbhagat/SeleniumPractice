package ParametrizationInTestNG;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderConcept {

	WebDriver driver;

	@BeforeClass
	void launchApplication() {

		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test(dataProvider="dp")
	void testLogin(String email, String pwd) throws InterruptedException {
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		Thread.sleep(3000);
		boolean status = driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
		if (status == true) {
			System.out.println("Login successfully completed and My Account page is visible");
			driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
			Assert.assertTrue(true);
		}

		else {

			Assert.fail();
		}
	}

	@AfterClass
	void tearDown() {
		driver.close();
	}

	@DataProvider(name="dp")
	Object[][] loginData() {

		Object[][] data = { 	
								{ "abc@gmail.com", "123Tyru" }, 
								{ "absgsdc@gmail.com", "123Tysddkdsru" },
								{ "pavanol123@gmail.com", "test@123" }, 
								{ "xyz@gmail.com", "123@hdgyru" },
								{ "mkkbc@gmail.com", "12dsds3Tyru" }, 
						   };

		return data;
	}

}
