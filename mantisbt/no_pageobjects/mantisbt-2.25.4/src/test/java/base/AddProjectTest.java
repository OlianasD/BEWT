package base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import utils.Strings;

public class AddProjectTest extends BaseTest {
	
	@Test
	public void addProject() throws InterruptedException {
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
		Thread.sleep(1000);
		driver.findElement(By.linkText(Strings.manage)).click();
		driver.findElement(By.linkText(Strings.manageProjects)).click();
		
		assertEquals(projectName, driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[2]/div[2]/div/div/div[2]/div[2]/div/div[2]/table/tbody/tr/td[1]/a")).getText());
		assertEquals(status, driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[2]/div[2]/div/div/div[2]/div[2]/div/div[2]/table/tbody/tr/td[2]")).getText());
		assertEquals(Strings.visibilityPublic, driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[2]/div[2]/div/div/div[2]/div[2]/div/div[2]/table/tbody/tr/td[4]")).getText());
		assertEquals(description, driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[2]/div[2]/div/div/div[2]/div[2]/div/div[2]/table/tbody/tr/td[5]")).getText());
		
		driver.findElement(By.className("user-info")).click();
		driver.findElement(By.xpath("//*[@id=\"navbar-container\"]/div[2]/ul/li[3]/ul/li[4]/a")).click();
	}
	
}