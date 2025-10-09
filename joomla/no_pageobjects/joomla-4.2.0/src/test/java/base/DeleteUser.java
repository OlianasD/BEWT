package base;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;

import org.junit.Test;
import org.openqa.selenium.By;

public class DeleteUser extends BaseTest {
	
	@Test
	public void deleteUser() throws InterruptedException {
		String user = "Test User";
		String expectedAlert = "User deleted.";
		
		driver.findElement(By.linkText("Author Login")).click();
		driver.findElement(By.id("username")).sendKeys("administrator");
		driver.findElement(By.id("password")).sendKeys(rootPassword);
		driver.findElement(By.className("btn-primary")).click();
		driver.findElement(By.linkText("Site Administrator")).click();
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver = driver.switchTo().window(tabs2.get(1));
		driver.findElement(By.id("mod-login-username")).clear();
		driver.findElement(By.id("mod-login-username")).sendKeys("administrator");
		driver.findElement(By.id("mod-login-password")).clear();
		driver.findElement(By.id("mod-login-password")).sendKeys(rootPassword);
		driver.findElement(By.id("btn-login-submit")).click();
		driver.findElement(By.xpath("//*[@id=\"cpanel-modules\"]/div/div/div[1]/div/div[2]/nav/ul/li[1]/ul/li[1]/a")).click();
		driver.findElement(By.id("cb1")).click();
		driver.findElement(By.xpath("//*[@id=\"toolbar-status-group\"]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"status-group-children-delete\"]/button")).click();
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
		Thread.sleep(500);
		
		assertEquals(expectedAlert, driver.findElement(By.className("alert-message")).getText());
		assertFalse(driver.findElement(By.id("userList")).getText().contains(user));
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div[2]/div[2]/div/button/div[2]")).click();
		driver.findElement(By.linkText("Log out")).click();
		tabs2 = new ArrayList<String> (driver.getWindowHandles());
		driver.close();
	    driver = driver.switchTo().window(tabs2.get(0));
	    driver.findElement(By.linkText("Log out")).click();
		driver.findElement(By.className("btn-primary")).click();
		
		
	}
}