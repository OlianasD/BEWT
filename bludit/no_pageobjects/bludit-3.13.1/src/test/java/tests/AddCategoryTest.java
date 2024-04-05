package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;

public class AddCategoryTest extends BaseTest {
	
	@Test
	public void addCategory() {
		driver.findElement(By.id("jsusername")).sendKeys(username);
		driver.findElement(By.id("jspassword")).sendKeys(password);
		driver.findElement(By.name("save")).click();
		driver.findElement(By.linkText("Categories")).click();
		driver.findElement(By.linkText("Add a new category")).click();
		driver.findElement(By.id("jsname")).sendKeys("Category001");
		driver.findElement(By.id("jsdescription")).sendKeys("Description001");
		driver.findElement(By.name("save")).click();
		
		assertEquals("Category001", driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/table/tbody/tr[1]/td[1]/a")).getText());
		
	}
	
}
