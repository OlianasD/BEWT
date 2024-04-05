package tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;


public class OutOfStockValidity extends BaseTest {

	@Test
	public void test_outofstockNoPO() throws InterruptedException {
		driver.findElement(By.name("email")).sendKeys(adminMail);
		driver.findElement(By.name("passwd")).sendKeys(adminPsw);
		driver.findElement(By.name("submitLogin")).click();
		driver.findElement(By.id("subtab-AdminParentOrders")).click();
		driver.findElement(By.id("subtab-AdminOrders")).click();
		driver.findElement(By.id("page-header-desc-configuration-add")).click();
		driver.findElement(By.id("customer-search-input")).sendKeys("John");
		driver.findElement(By.xpath("//*[@id=\"customer-search-block\"]/div/div[4]/div/div/div/div/div[3]/button[1]"))
				.click();
		driver.findElement(By.id("product-search")).sendKeys("Blue");
		driver.findElement(By.id("quantity-input")).clear();
		driver.findElement(By.id("quantity-input")).sendKeys("4");
		driver.findElement(By.id("add-product-to-cart-btn")).click();
		Thread.sleep(1000);

		assertTrue(driver.findElement(By.id("js-cart-error-block")).getText()
				.contains("There are not enough products in stock."));

	}
}
