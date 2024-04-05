package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;


public class AddMenuTest extends BaseTest {
	
	@Test
	public void testExpressCartAddMenu() throws Exception {
		driver.get(appUrl+"/admin");
		driver.findElement(By.id("email")).sendKeys("owner@test.com");
		driver.findElement(By.id("password")).sendKeys("test");
		driver.findElement(By.id("loginForm")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/nav/div/ul[2]/li[2]/a")).click();
		driver.findElement(By.id("newNavMenu")).sendKeys("Test Menu");
		driver.findElement(By.id("newNavLink")).sendKeys("/category/tag000");
		driver.findElement(By.id("settings-menu-new")).click();
		Thread.sleep(1000);
		
		assertEquals("Menu created successfully.", driver.findElement(By.className("alert-success")).getText());
	}



}
