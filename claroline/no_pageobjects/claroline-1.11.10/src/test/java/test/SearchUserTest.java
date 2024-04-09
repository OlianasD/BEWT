package test;

import org.junit.Test;
import org.openqa.selenium.By;
import static org.junit.Assert.assertEquals;


public class SearchUserTest extends BaseTest {

	@Test
	public void testClarolineSearchUser() throws Exception {
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("admin");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id='loginBox']/form/fieldset/button")).click();
		driver.findElement(By.linkText("Platform administration")).click();
		driver.findElement(By.id("search_user")).clear();
		driver.findElement(By.id("search_user")).sendKeys("user001");
		driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
		assertEquals("Name001", driver.findElement(By.xpath("//*[@id='L0']")).getText());
		assertEquals("Firstname001",
				driver.findElement(By.xpath("//*[@id='claroBody']/table[2]/tbody/tr/td[3]")).getText());
		assertEquals("User", driver.findElement(By.xpath("//*[@id='claroBody']/table[2]/tbody/tr/td[6]")).getText());
		driver.findElement(By.linkText("Logout")).click();
	}

}
