package base;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.Select;
import utils.Strings;

public class LinkMultipleSubprojectsTest extends BaseTest {

	@Test
	public void linkMultipleSubprojects() {
		String projectName = "Project001";
		
		driver.findElement(By.linkText(Strings.manage)).click();
		driver.findElement(By.linkText(Strings.manageProjects)).click();
		driver.findElement(By.linkText(projectName)).click();
		new Select(driver.findElement(By.name("subproject_id"))).selectByVisibleText("testSubProject1");
		driver.findElement(By.xpath("//*[@id=\"manage-project-subproject-add-form\"]/div/div/fieldset/input[3]")).click();
		driver.findElement(By.linkText(Strings.contin)).click();
		
		assertTrue(isSubprojectPresent("testSubProject1"));
		
		new Select(driver.findElement(By.name("subproject_id"))).selectByVisibleText("testSubProject2");
		driver.findElement(By.xpath("//*[@id=\"manage-project-subproject-add-form\"]/div/div/fieldset/input[3]")).click();
		driver.findElement(By.linkText(Strings.contin)).click();
		
		assertTrue(isSubprojectPresent("testSubProject2"));
	}
	
	private boolean isSubprojectPresent(String project) {
		try {
			return driver.findElement(By.id("manage-project-update-subprojects-form")).getText().contains(project);
		} catch(NoSuchElementException e) {
			return false;
		}
	}
}