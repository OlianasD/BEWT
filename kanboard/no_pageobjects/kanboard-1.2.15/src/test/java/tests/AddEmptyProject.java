package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;


public class AddEmptyProject extends BaseTest {
	
	@Test
	public void addEmptyProject() {
		driver.findElement(By.id("form-username")).sendKeys("admin");
		driver.findElement(By.id("form-password")).sendKeys("admin");
		driver.findElement(By.xpath("/html/body/div/form/div[1]/button")).click();
		driver.findElement(By.linkText("New project")).click();
		driver.findElement(By.xpath("//*[@id=\"project-creation-form\"]/div[2]/div/button")).click();
		
		assertEquals("The project name is required", driver.findElement(By.className("form-errors")).getText());
	}
}
