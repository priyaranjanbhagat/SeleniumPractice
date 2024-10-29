package GroupingConceptInTestNG;

import org.testng.annotations.Test;

public class PaymentTest {

	@Test(priority = 1, groups = { "sanity", "regression" })
	void paymentInRupees() {
		System.out.println("This is Payment in Rupees.........");
	}

	@Test(priority = 2, groups = { "sanity" })
	void paymentInDollar() {
		System.out.println("This is Payment in Dollar.........");
	}

	@Test(priority = 3, groups = { "regression" })
	void paymentInEuro() {
		System.out.println("This is Payment in Euro.........");
	}
}
