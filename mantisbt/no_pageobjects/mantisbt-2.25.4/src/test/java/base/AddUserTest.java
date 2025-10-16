package base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import utils.Strings;

public class AddUserTest extends BaseTest {
	
	@Test
	public void addUser() throws InterruptedException {
		String username = "username001";
		String realname = "username001";
		String email = "username@username.it";
		
		driver.findElement(By.linkText(Strings.manage)).click();
		driver.findElement(By.linkText(Strings.manageUsers)).click();
		driver.findElement(By.xpath("//*[@id=\"manage-user-div\"]/div[1]/a")).click();
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("realname")).clear();
		driver.findElement(By.name("realname")).sendKeys(realname);
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys(email);
		new Select(driver.findElement(By.name("access_level"))).selectByVisibleText(Strings.updater);
		driver.findElement(By.xpath("//*[@id=\"manage-user-create-form\"]/div/div[3]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText(Strings.manageUsers)).click();
		
		assertEquals(username, driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[2]/div[2]/div/div/div[4]/div[2]/div[2]/div/table/tbody/tr[2]/td[1]/a")).getText());
		assertEquals(realname, driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[2]/div[2]/div/div/div[4]/div[2]/div[2]/div/table/tbody/tr[2]/td[2]")).getText());
		assertEquals(email, driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[2]/div[2]/div/div/div[4]/div[2]/div[2]/div/table/tbody/tr[2]/td[3]")).getText());
		assertEquals(Strings.updater, driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[2]/div[2]/div/div/div[4]/div[2]/div[2]/div/table/tbody/tr[2]/td[4]")).getText());
		
		driver.findElement(By.className("user-info")).click();
		driver.findElement(By.xpath("//*[@id=\"navbar-container\"]/div[2]/ul/li[3]/ul/li[4]/a")).click();
	}
	
}