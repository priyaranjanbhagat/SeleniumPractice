package TestNGConcept;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsConcept {

	@Test
	void titleTest() {

		String exp_title = "Opencart";
		String act_title = "OpenShop";
/*
		if (exp_title.equals(act_title)) {
			System.out.println("Title Test Pass");
		}

		else {
			System.out.println("Title Test failed");
		}
*/
		
		Assert.assertEquals(exp_title, act_title);
		
		System.out.println("Test should be failed");
		
	}

}
