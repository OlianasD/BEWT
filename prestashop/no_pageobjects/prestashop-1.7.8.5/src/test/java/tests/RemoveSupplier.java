package tests;

import static org.junit.Assert.assertTrue;


import org.junit.Test;
import org.openqa.selenium.By;


public class RemoveSupplier extends BaseTest {
	
	@Test
	public void test_remove_supplier(){
		driver.findElement(By.name("email")).sendKeys(adminMail);
		driver.findElement(By.name("passwd")).sendKeys(adminPsw);
		driver.findElement(By.name("submitLogin")).click();
		driver.findElement(By.xpath("//*[@id=\"subtab-AdminCatalog\"]/a")).click();
		driver.findElement(By.id("subtab-AdminParentManufacturers")).click();
		driver.findElement(By.id("subtab-AdminSuppliers")).click();
		driver.findElement(By.xpath("//*[@id=\"supplier_grid_table\"]/tbody/tr[1]/td[7]/div/div/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"supplier_grid_table\"]/tbody/tr[1]/td[7]/div/div/div/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"supplier-grid-confirm-modal\"]/div/div/div[3]/button[2]")).click();
		
		
		assertTrue(driver.findElement(By.className("alert-text")).getText().contains("Successful deletion"));
	}
}