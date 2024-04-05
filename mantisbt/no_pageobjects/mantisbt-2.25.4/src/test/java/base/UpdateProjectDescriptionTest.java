package base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import utils.Strings;

public class UpdateProjectDescriptionTest extends BaseTest {
	
	@Test
	public void updateProjectDescription() {
		String projectName = "Project001";
		String descr = "UpdatedDescription";
		
		driver.findElement(By.linkText(Strings.manage)).click();
		driver.findElement(By.linkText(Strings.manageProjects)).click();
		driver.findElement(By.linkText(projectName)).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.name("description")).sendKeys(descr);
		driver.findElement(By.xpath("//*[@id=\"manage-proj-update-form\"]/div/div[3]/input")).click();
		
		assertEquals(descr, driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[2]/div[2]/div/div/div[2]/div[2]/div/div[2]/table/tbody/tr/td[5]")).getText());
		
		driver.findElement(By.className("user-info")).click();
		driver.findElement(By.xpath("//*[@id=\"navbar-container\"]/div[2]/ul/li[3]/ul/li[4]/a")).click();
	}
	
}