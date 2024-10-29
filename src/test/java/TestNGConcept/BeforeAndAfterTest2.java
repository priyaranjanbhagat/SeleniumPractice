package TestNGConcept;

import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAndAfterTest2 {
	
	@BeforeTest
	void afterTest() {
		System.out.println("This is BeforeTest method, will execute Before every test in XML file");
	}
	
	@Test
	void search() {
		Reporter.log("Search method 1 -- @test");
		System.out.println("Search method 2 -- @Test");
	}
	
	@Test
	void advanceSearch() {
		Reporter.log("Advance Search Method  2 -- @Test");
		System.out.println("Advance Search Method 2 -- @Test");
	}

}
