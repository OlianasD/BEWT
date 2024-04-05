package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;
import org.openqa.selenium.By;

public class AddAsDraftTest extends BaseTest {
	
	@Test
	public void addAsDraft() {
		driver.findElement(By.id("jsusername")).sendKeys(username);
		driver.findElement(By.id("jspassword")).sendKeys(password);
		driver.findElement(By.name("save")).click();
		driver.findElement(By.linkText("New content")).click();
		driver.findElement(By.id("jstitle")).sendKeys("Draft Content");
		driver.findElement(By.id("jsbuttonSwitch")).click();
		driver.findElement(By.id("jsbuttonSave")).click();
		
		assertFalse(driver.findElement(By.xpath("//*[@id=\"pages\"]/table/tbody/tr[1]/td[1]/div[1]/a")).getText().contains("Draft Content"));
		driver.findElement(By.id("draft-tab")).click();
		assertEquals("Draft Content", driver.findElement(By.xpath("//*[@id=\"draft\"]/table/tbody/tr/td[1]/div[1]/a")).getText());
	}
}