package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;

public class ChangeParentTest extends BaseTest {
	
	@Test
	public void changeParent() throws InterruptedException {
		driver.findElement(By.id("jsusername")).sendKeys(username);
		driver.findElement(By.id("jspassword")).sendKeys(password);
		driver.findElement(By.name("save")).click();
		driver.findElement(By.linkText("Content")).click();
		driver.findElement(By.xpath("//*[@id=\"pages\"]/table/tbody/tr[1]/td[3]/a[2]")).click();
		driver.findElement(By.id("jsoptionsSidebar")).click();
		driver.findElement(By.id("nav-advanced-tab")).click();
		driver.findElement(By.xpath("//*[@id=\"nav-advanced\"]/div[5]/span/span[1]/span")).click();
		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Create your own content");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"select2-jsparent-results\"]/li")).click();
		driver.findElement(By.id("jsoptionsSidebar")).click();
		driver.findElement(By.id("jsbuttonSave")).click();
		Thread.sleep(500);
		driver.findElement(By.id("jsoptionsSidebar")).click();
		driver.findElement(By.id("nav-advanced-tab")).click();
		
		assertEquals("Create your own content", driver.findElement(By.xpath("//*[@id=\"select2-jsparent-container\"]")).getAttribute("title"));
	}
}
