package base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;


public class AdminLoginTest extends BaseTest {
	
	@Test
	public void adminLoginTest() {
		driver.findElement(By.linkText("Author Login")).click();
		driver.findElement(By.id("username")).sendKeys("administrator");
		driver.findElement(By.id("password")).sendKeys(rootPassword);
		driver.findElement(By.className("btn-primary")).click();
		assertEquals("Super User", driver.findElement(By.xpath("//*[@id=\"users-profile-core\"]/dl/dd[1]")).getText());
		driver.findElement(By.linkText("Log out")).click();
		driver.findElement(By.className("btn-primary")).click();
		
	}
	
}
