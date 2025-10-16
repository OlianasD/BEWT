package tests;

import static org.junit.Assert.assertTrue;


import org.junit.Test;
import org.openqa.selenium.By;


public class EditEmployee extends BaseTest {
	
	@Test
	public void test_update_employeeNoPO() throws InterruptedException {
		driver.findElement(By.name("email")).sendKeys(adminMail);
		driver.findElement(By.name("passwd")).sendKeys(adminPsw);
		driver.findElement(By.name("submitLogin")).click();
		driver.findElement(By.id("subtab-AdminAdvancedParameters")).click();
		driver.findElement(By.id("subtab-AdminParentEmployees")).click();
		driver.findElement(By.xpath("//*[@id=\"employee_grid_table\"]/tbody/tr[2]/td[8]/div/div/a[1]")).click();
		driver.findElement(By.id("employee_lastname")).sendKeys("Main Admin");
		driver.findElement(By.id("save-button")).click();
		Thread.sleep(1000);
		assertTrue(driver.findElement(By.className("alert-text")).getText().contains("Successful update"));
	}	
}
