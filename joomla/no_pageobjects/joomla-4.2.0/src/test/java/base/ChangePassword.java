package base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;


public class ChangePassword extends BaseTest {
	
	@Test
	public void changePassword() {
		String username = "tuser01";
		String oldPassword = "tpassword";
		String password = "newpassword01";
		
		driver.findElement(By.linkText("Author Login")).click();
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(oldPassword);
		driver.findElement(By.className("btn-primary")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/ul/li/a")).click();
		driver.findElement(By.id("jform_password1")).sendKeys(password);
		driver.findElement(By.id("jform_password2")).sendKeys(password);
		driver.findElement(By.className("btn-primary")).click();
		
		assertEquals("Profile saved.", driver.findElement(By.className("alert-message")).getText());
		driver.findElement(By.linkText("Author Login")).click();
		driver.findElement(By.className("btn-primary")).click();
		
	}
}