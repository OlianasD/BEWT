package mediawiki;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class SearchPageTest extends BaseTest {
	
	@Test
	public void searchPage() throws InterruptedException {
		driver.findElement(By.id("searchInput")).sendKeys("Software testing");
		Thread.sleep(500);
		driver.findElement(By.id("searchInput")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		assertEquals("Software testing", driver.findElement(By.xpath("//*[@id=\"firstHeading\"]")).getText());
		assertEquals("According to the IEEE/ANSI 1059 definition, software testing is the process of analyzing a software item to detect the differences between existing and required conditions (that is defects/errors/bugs) and to evaluate the features of the software item.",
				driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]")).getText());
	}
	
}