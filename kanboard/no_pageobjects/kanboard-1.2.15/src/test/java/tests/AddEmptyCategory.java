package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;


public class AddEmptyCategory extends BaseTest {
	
	@Test
	public void addEmptyCategory() {
		driver.findElement(By.id("form-username")).sendKeys("admin");
		driver.findElement(By.id("form-password")).sendKeys("admin");
		driver.findElement(By.xpath("/html/body/div/form/div[1]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div[2]/div[2]/div[2]/div[1]/div/a/strong/i")).click();
		driver.findElement(By.linkText("Configure this project")).click();
		driver.findElement(By.linkText("Categories")).click();
		driver.findElement(By.linkText("Add a new category")).click();
		driver.findElement(By.xpath("//*[@id=\"modal-content\"]/form/div/div/button")).click();
		
		assertEquals("The name is required", driver.findElement(By.className("form-errors")).getText());
		  
	}
}
