package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;


public class AddEmptyReviewTest extends BaseTest {
	
	@Test
	public void testExpressCartAddEmptyReview() throws Exception {
		driver.get(appUrl);
		driver.findElement(By.xpath("//*[@id=\"navbarText\"]/ul/li[1]/a")).click();
		driver.findElement(By.id("email")).sendKeys("test@test.com");
		driver.findElement(By.id("password")).sendKeys("e2eW3Bt3s71nGB3nchM4rK");
		driver.findElement(By.id("customerloginForm")).click();
		Thread.sleep(1000);
		driver.get(appUrl);
		driver.findElement(By.linkText("NewProduct000")).click();
		driver.findElement(By.id("add-review")).click();
		Thread.sleep(500);
		driver.findElement(By.id("addReview")).click();
		Thread.sleep(1000);
		
		assertEquals("Please supply a review title", driver.findElement(By.id("notify_message")).getText());
	}



}
