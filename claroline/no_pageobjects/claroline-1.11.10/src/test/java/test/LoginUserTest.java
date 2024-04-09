package test;

import org.junit.Test;
import org.openqa.selenium.By;


import static org.junit.Assert.assertTrue;

public class LoginUserTest extends BaseTest {


	@Test
	public void testClarolineLoginUser() throws Exception {
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("user001");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("password001");
		driver.findElement(By.xpath("//*[@id='loginBox']/form/fieldset/button")).click();
		assertTrue(driver.findElement(By.xpath("//*[@id='userProfileBox']/h3/span")).getText().contains("Firstname001 Name001"));
		driver.findElement(By.linkText("Logout")).click();
	}

}
