package mediawiki;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;

public class CreateUserTest extends BaseTest {
	
	@Test
	public void createUser() {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("wpName1")).clear();
		driver.findElement(By.id("wpName1")).sendKeys("admin");
		driver.findElement(By.id("wpPassword1")).clear();
		driver.findElement(By.id("wpPassword1")).sendKeys("Password001");
		driver.findElement(By.id("wpLoginAttempt")).click();
		driver.findElement(By.linkText("Special pages")).click();
		driver.findElement(By.linkText("Create account")).click();
		driver.findElement(By.id("wpName2")).sendKeys("User001");
		driver.findElement(By.id("wpPassword2")).sendKeys("Password001");
		driver.findElement(By.id("wpRetype")).sendKeys("Password001");
		driver.findElement(By.id("wpRealName")).sendKeys("Real Name 001");
		driver.findElement(By.id("wpCreateaccount")).click();
		
		assertEquals("The user account for User001 (talk) has been created.", driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/p[1]")).getText());
	}
	
}