package tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;




public class AddEmptyManufacturer extends BaseTest {
	
	@Test
	public void test_add_empty_manufacturer(){
		driver.findElement(By.name("email")).sendKeys(adminMail);
		driver.findElement(By.name("passwd")).sendKeys(adminPsw);
		driver.findElement(By.name("submitLogin")).click();
		driver.findElement(By.xpath("//*[@id=\"subtab-AdminCatalog\"]/a")).click();
		driver.findElement(By.id("subtab-AdminParentManufacturers")).click();
		driver.findElement(By.id("page-header-desc-configuration-add_manufacturer")).click();
		driver.findElement(By.xpath("//*[@id=\"main-div\"]/div/div[1]/div/div[2]/div/form/div/div[2]/button")).click();
		
		assertTrue(driver.findElement(By.id("manufacturer_name"))
				.getAttribute("validationMessage").contains("Compila questo campo."));
	}
}
