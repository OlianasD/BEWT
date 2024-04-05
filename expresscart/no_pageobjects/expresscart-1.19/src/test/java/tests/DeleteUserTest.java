package tests;

import static org.junit.Assert.assertFalse;

import org.junit.Test;
import org.openqa.selenium.By;



public class DeleteUserTest extends BaseTest {
	
	
	@Test
	public void testExpressCartDeleteUser() throws Exception {
		driver.get(appUrl+"/admin");
		driver.findElement(By.id("email")).sendKeys("owner@test.com");
		driver.findElement(By.id("password")).sendKeys("test");
		driver.findElement(By.id("loginForm")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/nav/div/ul[1]/li[6]/a[1]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/main/div[2]/ul/li[3]/span/a[2]")).click();
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/nav/div/ul[1]/li[6]/a[1]")).click();
		
		assertFalse(driver.findElement(By.tagName("body")).getText().contains("test000@test.com"));
	}



}
