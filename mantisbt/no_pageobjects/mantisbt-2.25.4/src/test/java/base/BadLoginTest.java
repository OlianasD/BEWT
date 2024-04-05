package base;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import utils.Strings;

public class BadLoginTest extends BaseTest {
	
	@Test
	public void badLogin() {
		driver.findElement(By.className("user-info")).click();
		driver.findElement(By.xpath("//*[@id=\"navbar-container\"]/div[2]/ul/li[3]/ul/li[4]/a")).click();
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys("wrong");
		driver.findElement(By.className("btn")).click();
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("wrong");
		driver.findElement(By.className("btn")).click();
		assertTrue(driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div/div/div/div[4]/p")).getText()
				.contains(Strings.loginFailedError));
	}
	
}