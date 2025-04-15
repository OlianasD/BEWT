package tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.openqa.selenium.By;


public class AddUserTest extends BaseTest {
	
	@Test
	public void testExpressCartNewUser() throws Exception {
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
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/nav/div/ul[1]/li[6]/a[1]")).click();
		Thread.sleep(2000);
		assertEquals(driver.findElement(By.xpath("//*[@id=\"container\"]/div/main/div[2]/ul/li[3]")).getText(), "User: TestUser000 - (test000@test.com)\nRole: User");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/nav/div/ul[3]/li/a")).click();
	}


}
