package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class DeletedDiscountCodeFailsPercentTest extends BaseTest {
	
	@Test
	public void testExpressCartDeletedDiscountCodeFailsPercent() throws Exception {
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
		WebElement addToCartBtn = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/div[2]/div/div[2]/button"));
		addToCartBtn.click();
		Thread.sleep(500);
		WebElement cart = driver.findElement(By.xpath("/html/body/nav/div/ul/li/a"));
		cart.click();
		Thread.sleep(500);
		WebElement checkoutBtn = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/a"));
		checkoutBtn.click();
		WebElement continueToShipping = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/form/div[2]/div/a[2]"));
		continueToShipping.click();
		WebElement proceedToPayment = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/a[2]"));
		proceedToPayment.click();
		WebElement discCode = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/div[1]/input"));
		discCode.sendKeys("discperc000");
		WebElement applyDiscCode = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/div[1]/div[1]/button"));
		applyDiscCode.click();
		Thread.sleep(1000);
		WebElement errorMsg = driver.findElement(By.xpath("/html/body/div[4]"));

		assertEquals("Discount code is invalid or expired", errorMsg.getText());
	}


}
