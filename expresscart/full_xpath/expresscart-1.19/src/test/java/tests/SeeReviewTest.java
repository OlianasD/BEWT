package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class SeeReviewTest extends BaseTest {
	
	@Test
	public void testExpressCartSeeReview() throws Exception {
		driver.get(appUrl);
		WebElement firstProductLink = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div[1]/div/div/a/h3"));
		firstProductLink.click();
		WebElement recentRevsLink = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/div[2]/div/div[4]/a"));
		recentRevsLink.click();
		Thread.sleep(1000);
		WebElement displayedTitle = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/div[2]/div/div[5]/ul/li/p[3]"));
		WebElement displayedDescr = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/div[2]/div/div[5]/ul/li/p[4]"));
		WebElement displayedRating = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/div[2]/div/div[5]/ul/li/p[2]"));

		assertEquals(displayedTitle.getText(), "Title: Review000");
		assertEquals(displayedDescr.getText(), "Description: Description000");
		assertEquals(displayedRating.getText(), "Rating: 5");
		
		
		
	}


}
