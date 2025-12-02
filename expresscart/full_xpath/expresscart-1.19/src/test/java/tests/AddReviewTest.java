package tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class AddReviewTest extends BaseTest {
	
	@Test
	public void testExpressCartAddReviewNoPO() throws Exception {
		driver.get(appUrl);
		WebElement accountBtn = driver.findElement(By.xpath("/html/body/nav/div/ul/li[1]/a"));
		accountBtn.click();
		WebElement emailField = driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[1]/input"));
		emailField.sendKeys("test@test.com");
		WebElement pswField = driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[2]/input"));
		pswField.sendKeys("e2eW3Bt3s71nGB3nchM4rK");
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div[3]/div/div/form/button"));
		loginBtn.click();
		Thread.sleep(1000);
		driver.get(appUrl);
		WebElement firstProductLink = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div[1]/div/div/a/h3"));
		firstProductLink.click();
		WebElement addReviewBtn = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/div[2]/div/div[4]/button"));
		addReviewBtn.click();
		Thread.sleep(500);
		WebElement revTitle = driver.findElement(By.xpath("/html/body/div[7]/div/div/div[2]/div[1]/input"));
		revTitle.sendKeys("Review000");
		Thread.sleep(500);
		WebElement revDescr = driver.findElement(By.xpath("/html/body/div[7]/div/div/div[2]/div[2]/textarea"));
		revDescr.sendKeys("Description000");
		Thread.sleep(500);
		WebElement revRating = driver.findElement(By.xpath("/html/body/div[7]/div/div/div[2]/div[3]/input"));
		revRating.sendKeys("5");
		Thread.sleep(500);
		WebElement addRev = driver.findElement(By.xpath("/html/body/div[7]/div/div/div[3]/button[2]"));
		addRev.click();
		Thread.sleep(2500);
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
