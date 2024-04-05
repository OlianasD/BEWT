package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;

public class ChangeHomeTest extends BaseTest {
	
	@Test
	public void changeHome() throws InterruptedException {
		driver.findElement(By.id("jsusername")).sendKeys(username);
		driver.findElement(By.id("jspassword")).sendKeys(password);
		driver.findElement(By.name("save")).click();
		driver.findElement(By.linkText("General")).click();
		driver.findElement(By.id("nav-advanced-tab")).click();
		driver.findElement(By.xpath("//*[@id=\"advanced\"]/div[3]/div/span/span[1]/span")).click();
		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Create your own content");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"select2-jshomepage-results\"]/li")).click();
		driver.findElement(By.xpath("//*[@id=\"jsform\"]/div[1]/div/button")).click();
		
		assertEquals("Create your own content", driver.findElement(By.id("select2-jshomepage-container")).getAttribute("title"));
	}
	
}