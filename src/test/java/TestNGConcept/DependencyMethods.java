package TestNGConcept;

import org.testng.Assert;
import org.testng.annotations.*;

public class DependencyMethods {

	@Test(priority = 1)
	void openApp() {

		Assert.assertTrue(false);
	}

	@Test(priority = 2, dependsOnMethods = { "openApp" })
	void loginApp() {
		Assert.assertTrue(true);
	}

	@Test(priority = 3, dependsOnMethods = { "loginApp" })
	void searchApp() {
		Assert.assertTrue(true);
	}

	@Test(priority = 4, dependsOnMethods = { "loginApp", "searchApp" })
	void advSearchApp() {

		Assert.assertTrue(true);
	}

	@Test(priority = 5, dependsOnMethods = { "loginApp" })
	void logoutApp() {
		Assert.assertTrue(true);
	}

}
