package base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import utils.Strings;

public class UpdateUserEmptyTest extends BaseTest {
	
	@Test
	public void updateUserEmpty() {
		String originalName = "username001";
		
		driver.findElement(By.linkText(Strings.manage)).click();
		driver.findElement(By.linkText(Strings.manageUsers)).click();
		driver.findElement(By.linkText(originalName)).click();
		driver.findElement(By.id("edit-username")).clear();
		driver.findElement(By.xpath("//*[@id=\"edit-user-form\"]/div/div[2]/div[2]/input")).click();
		
		assertEquals(Strings.errorExistingUser, driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[2]/div[2]/div/div/div[2]/p[2]")).getText());
		
		driver.findElement(By.className("user-info")).click();
		driver.findElement(By.xpath("//*[@id=\"navbar-container\"]/div[2]/ul/li[3]/ul/li[4]/a")).click();
		
	}
	
}