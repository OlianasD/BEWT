package mediawiki;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class CloseInitialEditorPopupTest extends BaseTest {

	
	@Test
	public void closeInitialEditorPopup() throws InterruptedException {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("wpName1")).clear();
		driver.findElement(By.id("wpName1")).sendKeys("admin");
		driver.findElement(By.id("wpPassword1")).clear();
		driver.findElement(By.id("wpPassword1")).sendKeys("Password001");
		driver.findElement(By.id("wpLoginAttempt")).click();
		driver.findElement(By.id("searchInput")).sendKeys("Software testing");
		driver.findElement(By.id("searchInput")).sendKeys(Keys.ENTER);
		driver.findElement(By.linkText("Software testing")).click();
		Thread.sleep(6000);
		
		assertTrue(driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/div[2]/div[3]/div/span[2]/a")).isDisplayed());
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/div[2]/div[3]/div/span[2]/a")).click();
	}
	
}