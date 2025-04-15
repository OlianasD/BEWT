package tests;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.openqa.selenium.By;


public class AddEmptyUserTest extends BaseTest {
	
	@Test
	public void testExpressCartEmptyUser() throws Exception {
		driver.get(appUrl+"/admin");
		driver.findElement(By.id("email")).sendKeys("owner@test.com");
		driver.findElement(By.id("password")).sendKeys("e2eW3Bt3s71nGB3nchM4rK");
		driver.findElement(By.id("loginForm")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/nav/div/ul[1]/li[6]/a[2]")).click();
		driver.findElement(By.id("btnUserAdd")).click();
		Thread.sleep(1000);
		assertTrue(driver.findElement(By.xpath("//*[@id=\"userNewForm\"]/div[1]")).getAttribute("class").contains("has-error has-danger"));
		assertTrue(driver.findElement(By.xpath("//*[@id=\"userNewForm\"]/div[2]")).getAttribute("class").contains("has-error has-danger"));
		assertTrue(driver.findElement(By.xpath("//*[@id=\"userNewForm\"]/div[3]")).getAttribute("class").contains("has-error has-danger"));
		assertTrue(driver.findElement(By.xpath("//*[@id=\"userNewForm\"]/div[4]")).getAttribute("class").contains("has-error has-danger"));
	}


}
