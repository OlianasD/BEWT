package base;

import static org.junit.Assert.assertFalse;

import org.junit.Test;
import org.openqa.selenium.By;
import utils.Strings;

public class DeleteProjectTest extends BaseTest {
	
	@Test
	public void deleteProject() {
		String projectName = "Project001";
		
		driver.findElement(By.linkText(Strings.manage)).click();
		driver.findElement(By.linkText(Strings.manageProjects)).click();
		driver.findElement(By.linkText(projectName)).click();
		driver.findElement(By.xpath("//*[@id=\"project-delete-form\"]/fieldset/input[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[2]/div[2]/div/div/div[2]/form/input[4]")).click();
		
		assertFalse(driver.findElement(By.tagName("BODY")).getText().contains(projectName));
		
		driver.findElement(By.className("user-info")).click();
		driver.findElement(By.xpath("//*[@id=\"navbar-container\"]/div[2]/ul/li[3]/ul/li[4]/a")).click();
	}
}