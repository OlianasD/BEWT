package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;



public class SeeReviewTest extends BaseTest {
	
	@Test
	public void testExpressCartSeeReview() throws Exception {
		driver.get(appUrl);
		driver.findElement(By.linkText("NewProduct000")).click();
		driver.findElement(By.linkText("Recent reviews")).click();
		Thread.sleep(1000);
		
		assertEquals(driver.findElement(By.xpath("//*[@id=\"collapseReviews\"]/li/p[3]")).getText(), "Title: Review000");
		assertEquals(driver.findElement(By.xpath("//*[@id=\"collapseReviews\"]/li/p[4]")).getText(), "Description: Description000");
		assertEquals(driver.findElement(By.xpath("//*[@id=\"collapseReviews\"]/li/p[2]")).getText(), "Rating: 5");
		
		
		
	}


}
