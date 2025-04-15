package base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import utils.Strings;

public class AddExistingProjectFailsTest extends BaseTest {

	@Test
	public void addExistingProjectFails() throws InterruptedException {
		String projectName = "Project001";
		String status = "release";
		String description = "Description";
		
		
		driver.findElement(By.linkText(Strings.manage)).click();
		driver.findElement(By.linkText(Strings.manageProjects)).click();
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[2]/div[2]/div/div/div[2]/div[2]/div/div[1]/form/button")).click();
		Thread.sleep(500);
		driver.findElement(By.name("name")).clear();
		driver.findElement(By.name("name")).sendKeys(projectName);
		new Select(driver.findElement(By.name("status"))).selectByVisibleText(status);
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.name("description")).sendKeys(description);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"manage-project-create-form\"]/div/div[3]/input")).click();
		
		assertEquals(Strings.existingProjectError, driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[2]/div[2]/div/div/div[2]/p[2]")).getText());
				
	}
	
	
}