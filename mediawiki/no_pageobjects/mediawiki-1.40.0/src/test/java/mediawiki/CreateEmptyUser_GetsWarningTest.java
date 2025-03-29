package mediawiki;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;


public class CreateEmptyUser_GetsWarningTest extends BaseTest {
	
	@Test
	public void createEmptyUser_GetsWarning() {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("wpName1")).clear();
		driver.findElement(By.id("wpName1")).sendKeys("admin");
		driver.findElement(By.id("wpPassword1")).clear();
		driver.findElement(By.id("wpPassword1")).sendKeys("Password001");
		driver.findElement(By.id("wpLoginAttempt")).click();
		driver.findElement(By.linkText("Special pages")).click();
		driver.findElement(By.linkText("Create account")).click();
		driver.findElement(By.id("wpCreateaccount")).click();
		
		assertEquals("Please fill in this field.", driver.findElement(By.id("wpName2")).getAttribute("validationMessage"));
	}
	
}
