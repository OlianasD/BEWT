package tests;
import static org.junit.Assert.assertTrue;


import org.junit.Test;
import org.openqa.selenium.By;



public class AddNewAddress extends BaseTest {
	
	@Test
	public void test_add_address() throws InterruptedException {
		driver.findElement(By.name("email")).sendKeys(adminMail);
		driver.findElement(By.name("passwd")).sendKeys(adminPsw);
		driver.findElement(By.name("submitLogin")).click();
		driver.findElement(By.id("subtab-AdminParentCustomer")).click();
		driver.findElement(By.id("subtab-AdminAddresses")).click();
		driver.findElement(By.id("page-header-desc-configuration-add")).click();
		driver.findElement(By.id("customer_address_customer_email")).sendKeys("anonymous@psgdpr.com");
		driver.findElement(By.id("customer_address_alias")).sendKeys("Test");
		driver.findElement(By.id("customer_address_first_name")).clear();
		driver.findElement(By.id("customer_address_first_name")).sendKeys("John");
		driver.findElement(By.id("customer_address_last_name")).clear();
		driver.findElement(By.id("customer_address_last_name")).sendKeys("DOE");
		driver.findElement(By.id("customer_address_address1")).sendKeys("Via Torino");
		driver.findElement(By.id("customer_address_postcode")).sendKeys("12345");
		driver.findElement(By.id("customer_address_phone")).sendKeys("123456789");
		driver.findElement(By.id("customer_address_phone_mobile")).sendKeys("987654321");
		driver.findElement(By.id("customer_address_city")).sendKeys("Bologna");
		driver.findElement(By.id("save-button")).click();
		Thread.sleep(1000);
		
		assertTrue(driver.findElement(By.className("alert-text")).getText().contains("Successful creation"));
	}
}
