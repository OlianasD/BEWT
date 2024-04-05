package base;

import static org.junit.Assert.assertFalse;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import utils.Strings;

public class UnlinkMultipleSubprojectsTest extends BaseTest {

	@Test
	public void unlinkMultipleSubprojects() {
		String projectName = "Project001";
		
		driver.findElement(By.linkText(Strings.manage)).click();
		driver.findElement(By.linkText(Strings.manageProjects)).click();
		driver.findElement(By.linkText(projectName)).click();
		driver.findElement(By.xpath("//*[@id=\"manage-project-update-subprojects-form\"]/div/div[2]/div/fieldset/div/table/tbody/tr[1]/td[7]/div/a[2]")).click();
		driver.findElement(By.linkText(Strings.contin)).click();
		
		assertFalse(isSubprojectPresent("testSubProject1"));
		
		driver.findElement(By.xpath("//*[@id=\"manage-project-update-subprojects-form\"]/div/div[2]/div/fieldset/div/table/tbody/tr[1]/td[7]/div/a[2]")).click();

		assertFalse(isSubprojectPresent("testSubProject2"));
		
	}
	
	private boolean isSubprojectPresent(String project) {
		try {
			return driver.findElement(By.id("manage-project-update-subprojects-form")).getText().contains(project);
		} catch(NoSuchElementException e) {
			return false;
		}
	}
	
}