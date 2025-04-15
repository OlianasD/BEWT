package test;

import org.junit.Test;
import org.openqa.selenium.By;
import static org.junit.Assert.assertTrue;


public class SearchMultipleUsersTest extends BaseTest {

	@Test
	public void testClarolineSearchMultipleUsers() throws Exception {
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("admin");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("n0tl34k3dy3t");
		driver.findElement(By.xpath("//*[@id='loginBox']/form/fieldset/button")).click();
		driver.findElement(By.linkText("Platform administration")).click();
		driver.findElement(By.id("search_user")).clear();
		driver.findElement(By.id("search_user")).sendKeys("testuser");
		driver.findElement(By.xpath("//*[@id='claroBody']/ul/li[1]/ul/li[1]/form/input[2]")).click();
		driver.findElement(By.linkText("No.")).click();
		assertTrue(driver.findElement(By.id("L0")).getText().contains("testuser1"));
		assertTrue(driver.findElement(By.id("L1")).getText().contains("testuser2"));
		assertTrue(driver.findElement(By.id("L2")).getText().contains("testuser3"));
		driver.findElement(By.linkText("Logout")).click();
	}

}
