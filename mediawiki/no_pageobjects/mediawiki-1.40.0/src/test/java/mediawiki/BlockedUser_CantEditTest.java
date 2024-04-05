package mediawiki;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;


public class BlockedUser_CantEditTest extends BaseTest {
	
	@Test
	public void blockedUser_CantEdit() throws InterruptedException {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("wpName1")).clear();
		driver.findElement(By.id("wpName1")).sendKeys("User001");
		driver.findElement(By.id("wpPassword1")).clear();
		driver.findElement(By.id("wpPassword1")).sendKeys("Password001");
		driver.findElement(By.id("wpLoginAttempt")).click();
		driver.findElement(By.linkText("User001")).click();
		driver.findElement(By.linkText("Edit")).click();
		Thread.sleep(500);
		
		
		assertEquals("You do not have permission to edit this page, for the following reason:",
				driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div/p")).getText());
		assertTrue(driver.findElement(By.className("permissions-errors")).getText().contains("Your username or IP address has been blocked"));
	}
	
}