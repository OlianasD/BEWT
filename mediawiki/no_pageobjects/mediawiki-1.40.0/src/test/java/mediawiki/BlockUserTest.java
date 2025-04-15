package mediawiki;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;


public class BlockUserTest extends BaseTest {
	
	@Test
	public void blockUser() throws InterruptedException {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("wpName1")).clear();
		driver.findElement(By.id("wpName1")).sendKeys("admin");
		driver.findElement(By.id("wpPassword1")).clear();
		driver.findElement(By.id("wpPassword1")).sendKeys("e2eW3Bt3s71nGB3nchM4rK");
		driver.findElement(By.id("wpLoginAttempt")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Special pages")).click();
		driver.findElement(By.linkText("Block user")).click();
		driver.findElement(By.name("wpTarget")).sendKeys("User001");
		driver.findElement(By.name("wpAutoBlock")).click();
		driver.findElement(By.name("wpExpiry-other")).sendKeys("indefinite");
		driver.findElement(By.xpath("//*[@id=\"ooui-php-27\"]/button")).click();
		Thread.sleep(1000);
		
		assertTrue(driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/p")).getText().contains("User001 has been blocked."));
	}
	
}