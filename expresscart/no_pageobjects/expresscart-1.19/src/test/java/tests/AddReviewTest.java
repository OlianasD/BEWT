package tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;


public class AddReviewTest extends BaseTest {
	
	@Test
	public void testExpressCartAddReviewNoPO() throws Exception {
		driver.get(appUrl);
		driver.findElement(By.xpath("//*[@id=\"navbarText\"]/ul/li[1]/a")).click();
		driver.findElement(By.id("email")).sendKeys("test@test.com");
		driver.findElement(By.id("password")).sendKeys("test");
		driver.findElement(By.id("customerloginForm")).click();
		Thread.sleep(1000);
		driver.get(appUrl);
		driver.findElement(By.linkText("NewProduct000")).click();
		driver.findElement(By.id("add-review")).click();
		Thread.sleep(500);
		driver.findElement(By.id("review-title")).sendKeys("Review000");
		Thread.sleep(500);
		driver.findElement(By.id("review-description")).sendKeys("Description000");
		Thread.sleep(500);
		driver.findElement(By.id("review-rating")).sendKeys("5");
		Thread.sleep(500);
		driver.findElement(By.id("addReview")).click();
		Thread.sleep(2500);
		driver.findElement(By.linkText("Recent reviews")).click();
		Thread.sleep(1000);
		
		assertEquals(driver.findElement(By.xpath("//*[@id=\"collapseReviews\"]/li/p[3]")).getText(), "Title: Review000");
		assertEquals(driver.findElement(By.xpath("//*[@id=\"collapseReviews\"]/li/p[4]")).getText(), "Description: Description000");
		assertEquals(driver.findElement(By.xpath("//*[@id=\"collapseReviews\"]/li/p[2]")).getText(), "Rating: 5");
	}



}
