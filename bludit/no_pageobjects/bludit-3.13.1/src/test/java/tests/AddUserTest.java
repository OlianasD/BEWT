package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;


public class AddUserTest extends BaseTest {
	
	@Test
	public void addUser() {
		driver.findElement(By.id("jsusername")).sendKeys(username);
		driver.findElement(By.id("jspassword")).sendKeys(password);
		driver.findElement(By.name("save")).click();
		driver.findElement(By.linkText("Users")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/a")).click();
		driver.findElement(By.id("jsnew_username")).sendKeys("usertest");
		driver.findElement(By.id("jsnew_password")).sendKeys("usertest123");
		driver.findElement(By.id("jsconfirm_password")).sendKeys("usertest123");
		driver.findElement(By.id("jsemail")).sendKeys("user@test.com");
		new Select(driver.findElement(By.id("jsrole"))).selectByVisibleText("Administrator");
		driver.findElement(By.xpath("//*[@id=\"jsform\"]/div[1]/div/button")).click();
		
		assertEquals("usertest", driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/table/tbody/tr[2]/td[1]/a")).getText());
		
	}
	
}
