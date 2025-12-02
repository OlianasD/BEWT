package tests;


import static org.junit.Assert.assertFalse;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.XpathGenerator;


public class DeleteDiscountCodeAmountTest extends BaseTest {

	@Test
	public void testExpressCartDeleteDiscountCodeAmount() throws Exception {
		driver.get(appUrl+"/admin");
		WebElement emailField = driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[1]/input"));
		emailField.sendKeys("owner@test.com");
		WebElement pswField = driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[2]/input"));
		pswField.sendKeys("e2eW3Bt3s71nGB3nchM4rK");
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div[3]/div/div/form/button"));
		loginBtn.click();
		WebElement discountCodesLink = driver.findElement(By.xpath("/html/body/div[2]/div/nav/div/ul[2]/li[4]/a"));
		discountCodesLink.click();
		WebElement deleteBtn = driver.findElement(By.xpath("/html/body/div[2]/div/main/div/ul/li[5]/div/div[4]/button"));
		deleteBtn.click();
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
		WebElement secondDiscountCodesLink = driver.findElement(By.xpath("/html/body/div[2]/div/nav/div/ul[2]/li[4]/a"));
		secondDiscountCodesLink.click();
		WebElement discCodesList = driver.findElement(By.xpath("/html/body/div[2]/div/main/div/ul"));

		assertFalse(discCodesList.getText().contains("Code:  discount000"));
	}

}
