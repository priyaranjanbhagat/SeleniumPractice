package BrokenLinks;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksConcept {

	public static void main(String... s) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("http://www.digitalfiverr.com/");

		// Capture all the links from website
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links : " + links.size());

		int noOfBrokenLinks = 0;
		for (WebElement linkElements : links) {

			String hrefAttvalue = linkElements.getAttribute("href");
			if (hrefAttvalue == null || hrefAttvalue.isEmpty()) {

				System.out.println(" href Attribute value is null/empty, so its not possible to check ");
				continue;
			}

			try {
				// Hit URL to the Server
				URL linkURL = new URL(hrefAttvalue); // converted href value from String to URL Format
				HttpURLConnection conn = (HttpURLConnection) linkURL.openConnection(); // Open connection to the Server
				conn.connect(); // Connect to server and sent request to server

				if (conn.getResponseCode() >= 400) {

					System.out.println(hrefAttvalue + " =====> Broken Link");
					noOfBrokenLinks++;
				} else {
					System.out.println(hrefAttvalue + " =====> Not a Broken Link ");
				}

			}

			catch (Exception e) {

			}

		}

		System.out.println(" Number of Broken Links : " + noOfBrokenLinks);

	}

}
