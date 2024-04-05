package base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import utils.Strings;

public class AddExistingUserFailsTest extends BaseTest {
	
	@Test
	public void addExistingUserFails() {
		String username = "username001";
		String realname = "username001";
		String email = "username@username.it";
		
		driver.findElement(By.linkText(Strings.manage)).click();
		driver.findElement(By.linkText(Strings.manageUsers)).click();
		driver.findElement(By.xpath("//*[@id=\"manage-user-div\"]/div[1]/a")).click();
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("realname")).clear();
		driver.findElement(By.name("realname")).sendKeys(realname);
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys(email);
		new Select(driver.findElement(By.name("access_level"))).selectByVisibleText(Strings.updater);
		driver.findElement(By.xpath("//*[@id=\"manage-user-create-form\"]/div/div[3]/input")).click();
		
		assertEquals(Strings.errorExistingUser, driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[2]/div[2]/div/div/div[2]/p[2]")).getText());
		
	}
	
}