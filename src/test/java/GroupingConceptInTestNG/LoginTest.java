package GroupingConceptInTestNG;

import org.testng.annotations.*;

public class LoginTest {

	@Test(priority = 1, groups = { "regression" })
	void loginByEmail() {
		System.out.println("This is login By Email.........");
	}

	@Test(priority = 2, groups = "sanity")
	void loginByFacebook() {
		System.out.println("This is login By Facebook.........");
	}

	@Test(priority = 3, groups = { "regression", "sanity" })
	void loginByTwitter() {
		System.out.println("This is login By twitter.........");
	}

}
