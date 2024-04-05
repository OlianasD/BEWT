package base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;

public class LoginAsNewUser extends BaseTest {
	
	@Test
	public void loginAsNewUser() {
		String name ="Test User";
		String username = "tuser01";
		String password = "tpassword";
		
		driver.findElement(By.linkText("Author Login")).click();
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("btn-primary")).click();
		assertEquals(name, driver.findElement(By.xpath("//*[@id=\"users-profile-core\"]/dl/dd[1]")).getText());
		driver.findElement(By.linkText("Author Login")).click();
		driver.findElement(By.className("btn-primary")).click();
	}
}
