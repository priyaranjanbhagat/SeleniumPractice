package TestNGConcept;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {
	
	@Test
	void hardAssertionTest() {
		
		System.out.println("Testing.........");
		System.out.println("This will be printing Testing.........");
		
		Assert.assertEquals(1, 2); //HardAssertion will not execute rest statement
		
		System.out.println("This will not print if use hard assertion, Testing.........");
		System.out.println("Testing.........");
		
		
	}

}
