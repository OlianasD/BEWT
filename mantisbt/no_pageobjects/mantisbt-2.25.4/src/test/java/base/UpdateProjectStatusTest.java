package base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import utils.Strings;

public class UpdateProjectStatusTest extends BaseTest {
	
	@Test
	public void updateProjectStatus() {
		String projectName = "Project001";
		
		driver.findElement(By.linkText(Strings.manage)).click();
		driver.findElement(By.linkText(Strings.manageProjects)).click();
		driver.findElement(By.linkText(projectName)).click();
		new Select(driver.findElement(By.id("project-status"))).selectByVisibleText(Strings.projectStatusStable);
		driver.findElement(By.xpath("//*[@id=\"manage-proj-update-form\"]/div/div[3]/input")).click();
		
		assertEquals(Strings.projectStatusStable, driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[2]/div[2]/div/div/div[2]/div[2]/div/div[2]/table/tbody/tr/td[2]")).getText());
		
		driver.findElement(By.className("user-info")).click();
		driver.findElement(By.xpath("//*[@id=\"navbar-container\"]/div[2]/ul/li[3]/ul/li[4]/a")).click();
		
	}
	
	
}