package tests;


import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;




public class RegisterEmployee_NoName extends BaseTest {
	
	@Test
	public void test_register_employee_no_name(){
		driver.findElement(By.name("email")).sendKeys(adminMail);
		driver.findElement(By.name("passwd")).sendKeys(adminPsw);
		driver.findElement(By.name("submitLogin")).click();
		driver.findElement(By.id("subtab-AdminAdvancedParameters")).click();
		driver.findElement(By.id("subtab-AdminParentEmployees")).click();
		driver.findElement(By.id("page-header-desc-configuration-add")).click();
		driver.findElement(By.id("employee_email")).sendKeys("smith@gmail.com");
		driver.findElement(By.id("employee_password")).sendKeys("abcd!@#$23");
		driver.findElement(By.id("save-button")).click();
		
		assertTrue(driver.findElement(By.id("employee_firstname"))
				.getAttribute("validationMessage").contains("Compila questo campo."));
	 }
}
