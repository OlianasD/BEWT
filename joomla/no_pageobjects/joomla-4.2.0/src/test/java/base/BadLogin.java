package base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;

public class BadLogin extends BaseTest {
	
	@Test
	public void badLogin() {
		driver.findElement(By.linkText("Author Login")).click();
		driver.findElement(By.id("username")).sendKeys("administrator");
		driver.findElement(By.id("password")).sendKeys("wrongpassword");
		driver.findElement(By.className("btn-primary")).click();
		
		assertEquals("Username and password do not match or you do not have an account yet.", driver.findElement(By.className("alert-message")).getText());
	}
}