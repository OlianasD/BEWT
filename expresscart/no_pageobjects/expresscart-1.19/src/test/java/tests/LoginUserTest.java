package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;



public class LoginUserTest extends BaseTest {
	
	@Test
	public void testExpressCartLoginUser() throws Exception {
		driver.get(appUrl+"/admin");
		driver.findElement(By.id("email")).sendKeys("test000@test.com");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.id("loginForm")).click();
		assertEquals(driver.findElement(By.xpath("//*[@id=\"container\"]/div/nav/div/ul[1]/li[2]/a")).getText(), "  Dashboard");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/nav/div/ul[3]/li/a")).click();
	}



}
