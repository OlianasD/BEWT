package base;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;

public class LogoutTest extends BaseTest {

	@Test
	public void logout() {
		driver.findElement(By.className("user-info")).click();
		driver.findElement(By.xpath("//*[@id=\"navbar-container\"]/div[2]/ul/li[3]/ul/li[4]/a")).click();
		assertTrue(driver.findElement(By.className("btn")).isDisplayed());
	}
	
}