package tests;

import static org.junit.Assert.assertFalse;

import org.junit.Test;
import org.openqa.selenium.By;


public class DeleteCategoryTest extends BaseTest {
	
	@Test
	public void deleteCategory() {
		driver.findElement(By.id("jsusername")).sendKeys(username);
		driver.findElement(By.id("jspassword")).sendKeys(password);
		driver.findElement(By.name("save")).click();
		driver.findElement(By.linkText("Categories")).click();
		driver.findElement(By.linkText("Category001")).click();
		driver.findElement(By.xpath("//*[@id=\"jsform\"]/div[1]/div/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"jsdeleteModal\"]/div/div/div[2]/button[2]")).click();
		
		assertFalse(driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/table")).getText().contains("Category001"));
	}
}