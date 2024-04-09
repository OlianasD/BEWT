package test;

import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertTrue;

public class AddTwiceUserTest extends BaseTest {

	@Test
	public void testClarolineAddTwiceUser() throws Exception {
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("admin");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id='loginBox']/form/fieldset/button")).click();
		driver.findElement(By.linkText("Platform administration")).click();
		driver.findElement(By.linkText("Create user")).click();
		driver.findElement(By.id("lastname")).clear();
		driver.findElement(By.id("lastname")).sendKeys("Name001");
		driver.findElement(By.id("firstname")).clear();
		driver.findElement(By.id("firstname")).sendKeys("Firstname001");
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("user001");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("password001");
		driver.findElement(By.id("password_conf")).clear();
		driver.findElement(By.id("password_conf")).sendKeys("password001");
		driver.findElement(By.id("student")).click();
		driver.findElement(By.id("applyChange")).click();
		assertTrue(driver.findElement(By.xpath("//*[@id='claroBody']/div[2]/div[1]")).getText()
				.contains("This username is already taken"));
		driver.findElement(By.linkText("Logout")).click();
	}

}
