package TestNGConcept;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

	@Test
	void softAssertionTest() {
		
		System.out.println("This statement will print -- Testing.............");
		System.out.println("Testing.............");
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(1, 2);		
		
		System.out.println("Soft assertion will fail the test, but execute all the statement");
		
		sa.assertAll(); // This statement is mandatory to fail the test else it will pass the test
		
	}

}
