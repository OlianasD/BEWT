package mediawiki;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;


public class PromoteToAdminTest extends BaseTest {
	
	@Test
	public void promoteToAdminNoPO() throws InterruptedException {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("wpName1")).clear();
		driver.findElement(By.id("wpName1")).sendKeys("admin");
		driver.findElement(By.id("wpPassword1")).clear();
		driver.findElement(By.id("wpPassword1")).sendKeys("e2eW3Bt3s71nGB3nchM4rK");
		driver.findElement(By.id("wpLoginAttempt")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Special pages")).click();
		driver.findElement(By.linkText("User rights")).click();
		driver.findElement(By.id("username")).sendKeys("User001");
		driver.findElement(By.xpath("//*[@id=\"mw-userrights-form1\"]/fieldset/input[2]")).click();
		driver.findElement(By.id("wpGroup-sysop")).click();
		driver.findElement(By.id("wpReason")).sendKeys("promotion");
		driver.findElement(By.name("saveusergroups")).click();
		Thread.sleep(1000);
		
		assertTrue(driver.findElement(By.id("wpGroup-sysop")).isSelected());
		assertTrue(driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/ul/li")).getText().contains("changed group membership for User001 from (none) to administrator (promotion)"));
	}
	
}