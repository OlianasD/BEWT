package test;


import org.junit.Test;
import org.openqa.selenium.By;


import static org.junit.Assert.assertTrue;

public class AddEmptyUserTest extends BaseTest {

	@Test
	public void testClarolineAddEmptyUser() throws Exception {
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("admin");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id='loginBox']/form/fieldset/button")).click();
		driver.findElement(By.linkText("Platform administration")).click();
		driver.findElement(By.linkText("Create user")).click();
		driver.findElement(By.id("applyChange")).click();
		assertTrue(driver.findElement(By.xpath("//*[@id='claroBody']/div[2]/div[1]")).getText()
				.contains("You left some required fields empty"));
		driver.findElement(By.linkText("Logout")).click();
	}

}
