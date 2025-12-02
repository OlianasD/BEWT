package tests;


import static org.junit.Assert.assertFalse;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class DeleteReviewTest extends BaseTest {

	@Test
	public void testExpressCartDeleteReview() throws Exception {
		driver.get(appUrl+"/admin");
		WebElement emailField = driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[1]/input"));
		emailField.sendKeys("owner@test.com");
		WebElement pswField = driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[2]/input"));
		pswField.sendKeys("e2eW3Bt3s71nGB3nchM4rK");
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div[3]/div/div/form/button"));
		loginBtn.click();
		WebElement reviewsLink = driver.findElement(By.xpath("/html/body/div[2]/div/nav/div/ul[1]/li[8]/a"));
		reviewsLink.click();
		WebElement deleteReview = driver.findElement(By.xpath("/html/body/div[2]/div/main/div[3]/ul/li[2]/div/div[4]/a"));
		deleteReview.click();
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
		WebElement secondReviewsLink = driver.findElement(By.xpath("/html/body/div[2]/div/nav/div/ul[1]/li[8]/a"));
		secondReviewsLink.click();
		WebElement firstReview = driver.findElement(By.xpath("/html/body/div[2]/div/main/div[3]/ul/li[2]/div/div[1]/div"));
		assertFalse(firstReview.getText().contains("Review000"));
		
	}
}
