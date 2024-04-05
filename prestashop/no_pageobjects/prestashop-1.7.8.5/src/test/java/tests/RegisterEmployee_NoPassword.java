package tests;


import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;



public class RegisterEmployee_NoPassword extends BaseTest {
	
	@Test
	public void test_register_employee_no_passsword(){
		driver.findElement(By.name("email")).sendKeys(adminMail);
		driver.findElement(By.name("passwd")).sendKeys(adminPsw);
		driver.findElement(By.name("submitLogin")).click();
		driver.findElement(By.id("subtab-AdminAdvancedParameters")).click();
		driver.findElement(By.id("subtab-AdminParentEmployees")).click();
		driver.findElement(By.id("page-header-desc-configuration-add")).click();
		driver.findElement(By.id("employee_firstname")).sendKeys("John");
		driver.findElement(By.id("employee_lastname")).sendKeys("Smith");
		driver.findElement(By.id("employee_email")).sendKeys("smith@gmail.com");
		driver.findElement(By.id("save-button")).click();
		
		assertTrue(driver.findElement(By.id("employee_password"))
				.getAttribute("validationMessage").contains("Compila questo campo."));
	 }
}
