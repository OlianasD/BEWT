package tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class AddEmptyDiscountCodeTest extends BaseTest {
	
	@Test
	public void testExpressCartAddEmptyDiscountCodeNoPO() throws Exception {
		driver.get(appUrl+"/admin");
		WebElement emailField = driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[1]/input"));
		emailField.sendKeys("owner@test.com");
		WebElement pswField = driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[2]/input"));
		pswField.sendKeys("e2eW3Bt3s71nGB3nchM4rK");
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div[3]/div/div/form/button"));
		loginBtn.click();
		WebElement discountCodesLink = driver.findElement(By.xpath("/html/body/div[2]/div/nav/div/ul[2]/li[4]/a"));
		discountCodesLink.click();
		WebElement addDiscCode = driver.findElement(By.xpath("/html/body/div[2]/div/main/div/h2/div/a"));
		addDiscCode.click();
		WebElement addDiscountBtn = driver.findElement(By.xpath("/html/body/div[2]/div/main/form/div[1]/div/div/button"));
		addDiscountBtn.click();
		WebElement code = driver.findElement(By.xpath("/html/body/div[2]/div/main/form/div[2]/div"));
		WebElement value = driver.findElement(By.xpath("/html/body/div[2]/div/main/form/div[4]/div"));

		assertTrue(code.getAttribute("class").contains("has-error has-danger"));
		assertTrue(value.getAttribute("class").contains("has-error has-danger"));
		
		
	}



}
