package TestNGConcept;

import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BeforeAndAfterTest1 {
	
	@AfterTest
	void afterTest() {
		System.out.println("This is AfterTest method, will execute after every test in XML file");
	}
	
	@Test
	void search() {
		Reporter.log("Search method -- @test");
		System.out.println("Search method -- @Test");
	}
	
	@Test
	void advanceSearch() {
		Reporter.log("Advance Search Method -- @Test");
		System.out.println("Advance Search Method -- @Test");
	}
	
	@BeforeSuite
	void beforeSuite() {
		System.out.println("This is BeforeSuite Method-- Will run once in a xml before every suite");
	}
	
	@AfterSuite
	void afterSuite() {
		System.out.println("This is AfterSuite method --  will run once in xml after every suite");
	}

}
