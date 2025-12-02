package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class AddEmptyReviewTest extends BaseTest {
	
	@Test
	public void testExpressCartAddEmptyReview() throws Exception {
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
		WebElement addRev = driver.findElement(By.xpath("/html/body/div[7]/div/div/div[3]/button[2]"));
		addRev.click();
		Thread.sleep(1000);

		WebElement errorMsg = driver.findElement(By.xpath("/html/body/div[4]"));
		assertEquals("Please supply a review title", errorMsg.getText());
	}



}
