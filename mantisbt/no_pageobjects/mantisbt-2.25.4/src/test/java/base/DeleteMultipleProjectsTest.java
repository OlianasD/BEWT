package base;

import static org.junit.Assert.assertFalse;

import org.junit.Test;
import org.openqa.selenium.By;
import utils.Strings;

public class DeleteMultipleProjectsTest extends BaseTest {
	
	@Test
	public void deleteMultipleProjects() {
		String[] projects = {"Project001", "testSubProject1", "testSubProject2"};
		driver.findElement(By.linkText(Strings.manage)).click();
		driver.findElement(By.linkText(Strings.manageProjects)).click();
		
		for(int i=0; i<3; i++) {
			driver.findElement(By.linkText(projects[i])).click();
			driver.findElement(By.xpath("//*[@id=\"project-delete-form\"]/fieldset/input[3]")).click();
			driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[2]/div[2]/div/div/div[2]/form/input[4]")).click();
			
			assertFalse(driver.findElement(By.tagName("BODY")).getText().contains(projects[i]));
		}
	}

}
