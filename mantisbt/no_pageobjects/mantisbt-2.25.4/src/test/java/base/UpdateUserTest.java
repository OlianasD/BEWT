package base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import utils.Strings;

public class UpdateUserTest extends BaseTest {
	
	@Test
	public void updateUser() {
		String originalName = "username001";
		String expectedName = "username002";
		
		driver.findElement(By.linkText(Strings.manage)).click();
		driver.findElement(By.linkText(Strings.manageUsers)).click();
		driver.findElement(By.linkText(originalName)).click();
		driver.findElement(By.id("edit-realname")).clear();
		driver.findElement(By.id("edit-realname")).sendKeys(expectedName);
		driver.findElement(By.xpath("//*[@id=\"edit-user-form\"]/div/div[2]/div[2]/input")).click();
		driver.findElement(By.linkText(Strings.contin)).click();
		
		assertEquals(expectedName, driver.findElement(By.id("edit-realname")).getAttribute("value"));
		
		driver.findElement(By.className("user-info")).click();
		driver.findElement(By.xpath("//*[@id=\"navbar-container\"]/div[2]/ul/li[3]/ul/li[4]/a")).click();
	}
	
}