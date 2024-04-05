package tests;

import static org.junit.Assert.assertFalse;

import org.junit.Test;
import org.openqa.selenium.By;

public class DeleteUserTest extends BaseTest {
	
	@Test
	public void deleteUser() {
		driver.findElement(By.id("jsusername")).sendKeys(username);
		driver.findElement(By.id("jspassword")).sendKeys(password);
		driver.findElement(By.name("save")).click();
		driver.findElement(By.linkText("Users")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/table/tbody/tr[2]/td[1]/a")).click();
		driver.findElement(By.id("nav-security-tab")).click();
		driver.findElement(By.id("jsdeleteUserAndDeleteContent")).click();
		
		assertFalse(driver.findElement(By.tagName("body")).getText().contains("usertest"));
		
	}
}