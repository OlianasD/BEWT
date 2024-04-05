package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;

public class ChangePasswordTest extends BaseTest {
	
	@Test
	public void changePassword() {
		driver.findElement(By.id("jsusername")).sendKeys(username);
		driver.findElement(By.id("jspassword")).sendKeys(password);
		driver.findElement(By.name("save")).click();
		driver.findElement(By.linkText("Users")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/table/tbody/tr[2]/td[1]/a")).click();
		driver.findElement(By.id("nav-security-tab")).click();
		driver.findElement(By.xpath("//*[@id=\"security\"]/div[1]/a")).click();
		driver.findElement(By.id("jsnewPassword")).sendKeys("newpassword");
		driver.findElement(By.id("jsconfirmPassword")).sendKeys("newpassword");
		driver.findElement(By.xpath("//*[@id=\"jsform\"]/div[1]/div/button")).click();
		
		assertEquals("Enabled", driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/table/tbody/tr[2]/td[4]")).getText());

	}
	
}
