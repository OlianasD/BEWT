package tests;


import static org.junit.Assert.assertFalse;

import org.junit.Test;
import org.openqa.selenium.By;


public class DeleteReviewTest extends BaseTest {

	@Test
	public void testExpressCartDeleteReview() throws Exception {
		driver.get(appUrl+"/admin");
		driver.findElement(By.id("email")).sendKeys("owner@test.com");
		driver.findElement(By.id("password")).sendKeys("e2eW3Bt3s71nGB3nchM4rK");
		driver.findElement(By.id("loginForm")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/nav/div/ul[1]/li[8]/a")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/main/div[3]/ul/li[2]/div/div[4]/a")).click();
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/nav/div/ul[1]/li[8]/a")).click();
		
		assertFalse(driver.findElement(By.xpath("/html/body/div[2]/div/main/div[3]/ul/li[2]/div/div[1]/div")).getText().contains("Review000"));
		
	}
}
