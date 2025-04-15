package mediawiki;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;


public class ChangePassword_OKTest extends BaseTest {
	
	@Test
	public void changePassword_OK() throws InterruptedException {
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
		driver.findElement(By.name("password")).sendKeys("Newe2eW3Bt3s71nGB3nchM4rK");
		driver.findElement(By.name("retype")).sendKeys("Newe2eW3Bt3s71nGB3nchM4rK");
		driver.findElement(By.id("change_credentials_submit")).click();
		Thread.sleep(1000);
		assertEquals("Your credentials have been changed.", driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]")).getText());
		
	}
	
}