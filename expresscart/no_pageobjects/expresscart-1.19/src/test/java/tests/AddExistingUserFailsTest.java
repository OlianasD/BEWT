package tests;


import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;

public class AddExistingUserFailsTest extends BaseTest {
	
	@Test
	public void testExpressCartExistingUserFails() throws Exception {
		driver.get(appUrl+"/admin");
		driver.findElement(By.id("email")).sendKeys("owner@test.com");
		driver.findElement(By.id("password")).sendKeys("e2eW3Bt3s71nGB3nchM4rK");
		driver.findElement(By.id("loginForm")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/nav/div/ul[1]/li[6]/a[2]")).click();
		driver.findElement(By.id("usersName")).sendKeys("TestUser000");
		driver.findElement(By.id("userEmail")).sendKeys("test000@test.com");
		driver.findElement(By.id("userPassword")).sendKeys("e2eW3Bt3s71nGB3nchM4rK");
		driver.findElement(By.xpath("//*[@id=\"userNewForm\"]/div[4]/input")).sendKeys("e2eW3Bt3s71nGB3nchM4rK");
		driver.findElement(By.id("btnUserAdd")).click();
		Thread.sleep(500);
		
		assertEquals("A user with that email address already exists", driver.findElement(By.className("alert-danger")).getText());
		
	}



}
