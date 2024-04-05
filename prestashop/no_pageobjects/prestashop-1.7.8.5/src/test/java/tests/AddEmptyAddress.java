package tests;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;




public class AddEmptyAddress extends BaseTest {
	
	@Test
	public void test_add_empty_address(){
		driver.findElement(By.name("email")).sendKeys(adminMail);
		driver.findElement(By.name("passwd")).sendKeys(adminPsw);
		driver.findElement(By.name("submitLogin")).click();
		driver.findElement(By.id("subtab-AdminParentCustomer")).click();
		driver.findElement(By.id("subtab-AdminAddresses")).click();
		driver.findElement(By.id("page-header-desc-configuration-add")).click();
		driver.findElement(By.id("save-button")).click();
		
		
		assertTrue(driver.findElement(By.id("customer_address_customer_email"))
				.getAttribute("validationMessage").contains("Compila questo campo."));
	}
}
