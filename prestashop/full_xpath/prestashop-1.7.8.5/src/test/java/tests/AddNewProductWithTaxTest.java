package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class AddNewProductWithTaxTest extends BaseTest {

	@Test
	public void test_add_new_product_with_tax() throws InterruptedException {
		WebElement emailField = driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div[1]/form/div[1]/input"));
		emailField.sendKeys(adminMail);
		WebElement pswField = driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div[1]/form/div[2]/input"));
		pswField.sendKeys(adminPsw);
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div[1]/form/div[3]/button"));
		loginBtn.click();
		WebElement catalog = driver.findElement(By.xpath("/html/body/nav/div/ul/li[4]/a"));
		catalog.click();
		WebElement products = driver.findElement(By.xpath("/html/body/nav/div/ul/li[4]/ul/li[1]/a"));
		products.click();
		WebElement newProduct = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/a[1]"));
		newProduct.click();
		Thread.sleep(2000);
		WebElement pricing = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/form/div[3]/div[1]/ul/li[4]/a"));
		pricing.click();
		WebElement taxRule = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/form/div[3]/div[2]/div[4]/div/div/div/div/div[3]/div/div[1]/span"));
		taxRule.click();
		WebElement taxRuleInput = driver.findElement(By.xpath("/html/body/span[4]/span/span[1]/input"));
		taxRuleInput.sendKeys("IT Standard Rate (22%)");
		taxRuleInput.sendKeys(Keys.ENTER);
		WebElement preTaxRetail = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/form/div[3]/div[2]/div[4]/div/div/div/div/div[2]/div/div[1]/div/input"));
		preTaxRetail.clear();
		preTaxRetail.sendKeys("10");
		WebElement finalPrice = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/form/div[3]/div[2]/div[4]/div/div/div/div/div[3]/div/div[4]/div/div/div/p/strong/span"));
		assertEquals("€12.20", finalPrice.getText());

	}
}
