package TestNGConcept;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*
 * Login method -- @BeforeClass
 * Search method -- @Test
 * AdvanceSearch -- @test
 * Logout method -- @AfterClass
 */

public class BeforeAndAfterClass {
	
	@BeforeClass
	void login() {		
		System.out.println("Login method -- @BeforeClass");
	}
	
	@Test
	void search() {
		System.out.println("Search method -- @Test");
	}
	
	@Test
	void advanceSearch() {
		System.out.println("Advance Search method -- @Test");
	}
	
	@AfterClass
	void logout() {
		System.out.println("Logout method -- @AfterClass");
	}

}
