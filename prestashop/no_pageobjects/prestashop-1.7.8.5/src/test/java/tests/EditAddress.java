package tests;

import static org.junit.Assert.assertTrue;


import org.junit.Test;
import org.openqa.selenium.By;



public class EditAddress extends BaseTest {

	
	
	@Test()
	public void test_edit_addressNoPO(){
		driver.findElement(By.name("email")).sendKeys(adminMail);
		driver.findElement(By.name("passwd")).sendKeys(adminPsw);
		driver.findElement(By.name("submitLogin")).click();
		driver.findElement(By.id("subtab-AdminParentCustomer")).click();
		driver.findElement(By.id("subtab-AdminAddresses")).click();
		driver.findElement(By.xpath("//*[@id=\"address_grid_table\"]/tbody/tr[1]/td[9]/div/div/a[1]")).click();
		driver.findElement(By.id("customer_address_first_name")).clear();
		driver.findElement(By.id("customer_address_first_name")).sendKeys("Bob");
		driver.findElement(By.id("save-button")).click();
		
		
		assertTrue(driver.findElement(By.className("alert-text")).getText().contains("Update successful"));
		
		
	}
}
