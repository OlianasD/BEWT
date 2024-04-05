package base;

import static org.junit.Assert.assertFalse;

import org.junit.Test;
import org.openqa.selenium.By;
import utils.Strings;

public class DeleteUserTest extends BaseTest {
	
	@Test
	public void deleteUser() {
		String userName = "username001";

		driver.findElement(By.linkText(Strings.manage)).click();
		driver.findElement(By.linkText(Strings.manageUsers)).click();
		driver.findElement(By.linkText(userName)).click();
		driver.findElement(By.xpath("//*[@id=\"manage-user-delete-form\"]/fieldset/span/input")).click();
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[2]/div[2]/div/div/div[2]/form/input[4]")).click();
		driver.findElement(By.linkText(Strings.contin)).click();
		
		assertFalse(driver.findElement(By.tagName("BODY")).getText().contains(userName));
		
		driver.findElement(By.className("user-info")).click();
		driver.findElement(By.xpath("//*[@id=\"navbar-container\"]/div[2]/ul/li[3]/ul/li[4]/a")).click();
		
	}
	
}