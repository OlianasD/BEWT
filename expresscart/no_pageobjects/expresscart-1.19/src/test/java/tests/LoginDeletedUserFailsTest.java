package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;


public class LoginDeletedUserFailsTest extends BaseTest {
	
	@Test
	public void testExpressCartLoginUser() throws Exception {
		driver.get(appUrl+"/admin");
		driver.findElement(By.id("email")).sendKeys("test000@test.com");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.id("loginForm")).click();
		Thread.sleep(500);
		
		assertEquals("A user with that email does not exist.", driver.findElement(By.className("alert-danger")).getText());
	}


}
