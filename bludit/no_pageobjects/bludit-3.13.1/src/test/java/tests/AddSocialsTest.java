package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;

public class AddSocialsTest extends BaseTest {
	
	@Test
	public void addSocials() {
		driver.findElement(By.id("jsusername")).sendKeys(username);
		driver.findElement(By.id("jspassword")).sendKeys(password);
		driver.findElement(By.name("save")).click();
		driver.findElement(By.linkText("Users")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/table/tbody/tr[1]/td[1]/a")).click();
		driver.findElement(By.id("nav-social-tab")).click();
		driver.findElement(By.id("jsfacebook")).sendKeys("https://www.facebook.com/some_fake_user_name_52432562135863");
		driver.findElement(By.id("jsinstagram")).sendKeys("https://instagram.com/some_fake_user_name_52432562135863");
		driver.findElement(By.xpath("//*[@id=\"jsform\"]/div[1]/div/button")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/table/tbody/tr[1]/td[1]/a")).click();
		driver.findElement(By.id("nav-social-tab")).click();
		
		assertEquals("https://www.facebook.com/some_fake_user_name_52432562135863", driver.findElement(By.id("jsfacebook")).getAttribute("value"));
		assertEquals("https://instagram.com/some_fake_user_name_52432562135863", driver.findElement(By.id("jsinstagram")).getAttribute("value"));
		
	}
}