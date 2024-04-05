package tests;

import static org.junit.Assert.assertFalse;

import org.junit.Test;
import org.openqa.selenium.By;

public class DeletePostTest extends BaseTest {
	
	@Test
	public void deletePost() throws InterruptedException {
		driver.findElement(By.id("jsusername")).sendKeys(username);
		driver.findElement(By.id("jspassword")).sendKeys(password);
		driver.findElement(By.name("save")).click();
		driver.findElement(By.linkText("Content")).click();
		driver.findElement(By.xpath("//*[@id=\"pages\"]/table/tbody/tr[3]/td[3]/a[3]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"jsdeletePageModal\"]/div/div/div[2]/button[2]")).click();
		
		assertFalse(driver.findElement(By.id("pages")).getText().contains("Follow Bludit"));
	}
	
}
