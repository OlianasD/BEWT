package test;

import org.junit.Test;
import org.openqa.selenium.By;


import static org.junit.Assert.assertTrue;

public class AddWrongEmailUserTest extends BaseTest {

	@Test
	public void testClarolineAddWrongEmailUser() throws Exception {
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("admin");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id='loginBox']/form/fieldset/button")).click();
		driver.findElement(By.linkText("Platform administration")).click();
		driver.findElement(By.linkText("Create user")).click();
		driver.findElement(By.id("lastname")).clear();
		driver.findElement(By.id("lastname")).sendKeys("user");
		driver.findElement(By.id("firstname")).clear();
		driver.findElement(By.id("firstname")).sendKeys("user");
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("user");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("pass");
		driver.findElement(By.id("password_conf")).clear();
		driver.findElement(By.id("password_conf")).sendKeys("pass");
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("email");
		driver.findElement(By.id("applyChange")).click();
		assertTrue(driver.findElement(By.xpath("//*[@id='claroBody']/div[2]/div[1]")).getText()
				.contains("The email address is not valid"));
		driver.findElement(By.linkText("Logout")).click();
	}


}
