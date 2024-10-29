package GroupingConceptInTestNG;

import org.testng.annotations.Test;

public class SignupTest {

	@Test(priority = 1, groups = { "sanity" })
	void signupByEmail() {
		System.out.println("This is Signup By Email.........");
	}

	@Test(priority = 2, groups = { "regression", "sanity" })
	void signupByfacebook() {
		System.out.println("This is Signup By Facebook.........");
	}

	@Test(priority = 3, groups = { "regression" })
	void signupByTwitter() {
		System.out.println("This is Signup By Twitter.........");
	}

}
