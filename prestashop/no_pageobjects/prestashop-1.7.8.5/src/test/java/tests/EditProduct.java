package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;

public class EditProduct extends BaseTest {

	@Test
	public void test_edit_product() throws InterruptedException {
		driver.findElement(By.name("email")).sendKeys(adminMail);
		driver.findElement(By.name("passwd")).sendKeys(adminPsw);
		driver.findElement(By.name("submitLogin")).click();
		driver.findElement(By.xpath("//*[@id=\"subtab-AdminCatalog\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"subtab-AdminProducts\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"product_catalog_list\"]/div[2]/div/div/table/tbody/tr/td[11]/div/div/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("form_step1_name_1")).clear();
		driver.findElement(By.id("form_step1_name_1")).sendKeys("Deep Blue Jacket");
		driver.findElement(By.id("submit")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("product_form_save_go_to_catalog_btn")).click();
		Thread.sleep(2000);

		assertEquals("Deep Blue Jacket",
				driver.findElement(By.xpath("//*[@id=\"product_catalog_list\"]/div[2]/div/div/table/tbody/tr/td[4]/a"))
						.getText());

	}

}
