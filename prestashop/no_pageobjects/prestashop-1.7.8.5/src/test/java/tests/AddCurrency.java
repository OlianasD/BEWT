package tests;
import static org.junit.Assert.assertTrue;


import org.junit.Test;
import org.openqa.selenium.By;


public class AddCurrency extends BaseTest {
	
	@Test
	public void test_add_currency() throws InterruptedException {
		driver.findElement(By.name("email")).sendKeys(adminMail);
		driver.findElement(By.name("passwd")).sendKeys(adminPsw);
		driver.findElement(By.name("submitLogin")).click();
		driver.findElement(By.xpath("//*[@id=\"subtab-AdminInternational\"]/a/span")).click();
		driver.findElement(By.id("subtab-AdminParentLocalization")).click();
		driver.findElement(By.id("subtab-AdminCurrencies")).click();
		driver.findElement(By.id("page-header-desc-configuration-add")).click();
		driver.findElement(By.xpath("//*[@id=\"currency_form\"]/div/div[2]/div/div[2]/div")).click();
		driver.findElement(By.id("currency_names_1")).sendKeys("Something");
		driver.findElement(By.id("currency_iso_code")).sendKeys("STH");
		driver.findElement(By.id("currency_exchange_rate")).clear();
		driver.findElement(By.id("currency_exchange_rate")).sendKeys("10");
		driver.findElement(By.id("save-button")).click();
		Thread.sleep(1000);
		assertTrue(driver.findElement(By.className("alert-text")).getText().contains("Successful creation"));
		
	}
}
