package base;

import static org.junit.Assert.assertFalse;

import org.junit.Test;
import org.openqa.selenium.By;
import utils.Strings;

public class DeleteMultipleUsersTest extends BaseTest {
	
	@Test
	public void deleteMultipleUsers() {
		String username = "username00%d";

		driver.findElement(By.linkText(Strings.manage)).click();
		driver.findElement(By.linkText(Strings.manageUsers)).click();
		
		for(int i=1; i<=3; i++) {
			driver.findElement(By.linkText(String.format(username, i))).click();
			driver.findElement(By.xpath("//*[@id=\"manage-user-delete-form\"]/fieldset/span/input")).click();
			driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[2]/div[2]/div/div/div[2]/form/input[4]")).click();
			driver.findElement(By.linkText(Strings.contin)).click();
			
			assertFalse(driver.findElement(By.tagName("BODY")).getText().contains(String.format(username, i)));
		}
	}
	
}