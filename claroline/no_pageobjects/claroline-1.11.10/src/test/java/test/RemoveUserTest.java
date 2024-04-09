package test;

import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertTrue;

public class RemoveUserTest extends BaseTest {

	@Test
	public void testClarolineRemoveUser() throws Exception {
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("admin");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id='loginBox']/form/fieldset/button")).click();
		driver.findElement(By.linkText("Platform administration")).click();
		driver.findElement(By.id("search_user")).clear();
		driver.findElement(By.id("search_user")).sendKeys("user001");
		driver.findElement(By.xpath("//*[@id='claroBody']/ul/li[1]/ul/li[1]/form/input[2]")).click();
		driver.findElement(By.xpath("//*[@id='claroBody']/table[2]/tbody/tr/td[10]/a/img")).click();
		driver.switchTo().alert().accept();
		assertTrue(driver.findElement(By.xpath("//*[@id='claroBody']/div[2]/div")).getText()
				.contains("Deletion of the user was done sucessfully"));
		driver.findElement(By.linkText("Logout")).click();
	}

}
