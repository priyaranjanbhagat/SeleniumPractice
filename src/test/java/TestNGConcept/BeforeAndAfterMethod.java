package TestNGConcept;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 * Login -- @BeforeMethod
 * Search-- @test
 * logout-- @AfterMethod
 * login
 * advanced search -- @test
 * logout
 */

public class BeforeAndAfterMethod {
	
	@BeforeMethod
	void login() {
		Reporter.log("Login metod -- @BeforeMethod");
	}
	
	@AfterMethod
	void logout() {
		Reporter.log("Logout method -- @AfterMethod");
	}
	
	@Test
	void search() {
		Reporter.log("Search method -- @test");
	}
	
	@Test
	void advanceSearch() {
		Reporter.log("Advance Search Method -- @Test");
	}
}
