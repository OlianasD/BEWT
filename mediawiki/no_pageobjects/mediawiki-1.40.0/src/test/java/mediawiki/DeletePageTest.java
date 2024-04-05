package mediawiki;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


public class DeletePageTest extends BaseTest {
	
	@Test
	public void deletePageNoPO() throws InterruptedException {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("wpName1")).clear();
		driver.findElement(By.id("wpName1")).sendKeys("admin");
		driver.findElement(By.id("wpPassword1")).clear();
		driver.findElement(By.id("wpPassword1")).sendKeys("Password001");
		driver.findElement(By.id("wpLoginAttempt")).click();
		driver.findElement(By.id("searchInput")).sendKeys("E2E Web Testing");
		Thread.sleep(500);
		driver.findElement(By.id("searchInput")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("p-cactions-checkbox")).click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.id("wpConfirmB")).click();
		
		assertEquals("\"E2E Web Testing\" has been deleted. See deletion log for a record of recent deletions.", 
				driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/p[1]")).getText());

	}
	
}