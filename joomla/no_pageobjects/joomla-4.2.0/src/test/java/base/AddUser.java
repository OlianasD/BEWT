package base;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;
import org.openqa.selenium.By;

public class AddUser extends BaseTest {
	
	@Test
	public void addUser() {
		String name ="Test User";
		String username = "tuser01";
		String password = "tpassword";
		String email = "testmail@example.com";
		
		driver.findElement(By.linkText("Author Login")).click();
		driver.findElement(By.id("username")).sendKeys("administrator");
		driver.findElement(By.id("password")).sendKeys(rootPassword);
		driver.findElement(By.className("btn-primary")).click();
		driver.findElement(By.linkText("Site Administrator")).click();
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver = driver.switchTo().window(tabs2.get(1));
		driver.findElement(By.id("mod-login-username")).clear();
		driver.findElement(By.id("mod-login-username")).sendKeys("administrator");
		driver.findElement(By.id("mod-login-password")).clear();
		driver.findElement(By.id("mod-login-password")).sendKeys(rootPassword);
		driver.findElement(By.id("btn-login-submit")).click();
		driver.findElement(By.xpath("//*[@id=\"cpanel-modules\"]/div/div/div[1]/div/div[2]/nav/ul/li[1]/ul/li[1]/a")).click();
		driver.findElement(By.className("button-new")).click();
		driver.findElement(By.id("jform_name")).sendKeys(name);
		driver.findElement(By.id("jform_username")).sendKeys(username);
		driver.findElement(By.id("jform_password")).sendKeys(password);
		driver.findElement(By.id("jform_password2")).sendKeys(password);
		driver.findElement(By.id("jform_email")).sendKeys(email);
		driver.findElement(By.className("button-save")).click();
		
		assertEquals(name, driver.findElement(By.xpath("//*[@id=\"userList\"]/tbody/tr[2]/th/div[1]/a")).getText());
		assertEquals(username, driver.findElement(By.xpath("//*[@id=\"userList\"]/tbody/tr[2]/td[2]")).getText());
		assertEquals(email, driver.findElement(By.xpath("//*[@id=\"userList\"]/tbody/tr[2]/td[6]")).getText());
		
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div[2]/div[2]/div/button/div[2]")).click();
		driver.findElement(By.linkText("Log out")).click();
		tabs2 = new ArrayList<String> (driver.getWindowHandles());
		driver.close();
	    driver = driver.switchTo().window(tabs2.get(0));
	    driver.findElement(By.linkText("Log out")).click();
		driver.findElement(By.className("btn-primary")).click();
	}
}
