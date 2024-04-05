package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


public class AddNewProductWithTax extends BaseTest {

	@Test
	public void test_add_new_product_with_tax() throws InterruptedException {
		driver.findElement(By.name("email")).sendKeys(adminMail);
		driver.findElement(By.name("passwd")).sendKeys(adminPsw);
		driver.findElement(By.name("submitLogin")).click();
		driver.findElement(By.xpath("//*[@id=\"subtab-AdminCatalog\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"subtab-AdminProducts\"]/a")).click();
		driver.findElement(By.id("page-header-desc-configuration-add")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("tab_step2")).click();
		driver.findElement(By.xpath("//*[@id=\"step2\"]/div/div/div/div/div[3]/div/div[1]/span")).click();
		driver.findElement(By.xpath("/html/body/span[4]/span/span[1]/input")).sendKeys("IT Standard Rate (22%)");
		driver.findElement(By.xpath("/html/body/span[4]/span/span[1]/input")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("form_step2_price")).clear();
		driver.findElement(By.id("form_step2_price")).sendKeys("10");

		assertEquals("€12.20", driver.findElement(By.id("final_retail_price_ti")).getText());

	}
}
