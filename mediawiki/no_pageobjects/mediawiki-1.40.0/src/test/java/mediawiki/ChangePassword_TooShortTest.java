package mediawiki;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;


public class ChangePassword_TooShortTest extends BaseTest {

	
	@Test
	public void changePassword_TooShort() throws InterruptedException {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("wpName1")).clear();
		driver.findElement(By.id("wpName1")).sendKeys("User001");
		driver.findElement(By.id("wpPassword1")).clear();
		driver.findElement(By.id("wpPassword1")).sendKeys("e2eW3Bt3s71nGB3nchM4rK");
		driver.findElement(By.id("wpLoginAttempt")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Special pages")).click();
		driver.findElement(By.linkText("Change credentials")).click();
		driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/dl/dd/a")).click();
		driver.findElement(By.name("password")).sendKeys("vznb");
		driver.findElement(By.name("retype")).sendKeys("vznb");
		driver.findElement(By.id("change_credentials_submit")).click();
		Thread.sleep(1000);
		
		assertEquals("Passwords must be at least 10 characters.", driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/form/div[1]/div[2]/div/span[2]")).getText());
		
	}
	
}