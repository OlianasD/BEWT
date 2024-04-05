package base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;

import utils.Strings;

public class AddExistingCategoryFailsTest extends BaseTest {

	@Test
	public void addExistingCategoryFails() {
		String projectName = "Project001";
		String categoryName = "Category001";
		
		driver.findElement(By.linkText(Strings.manage)).click();
		driver.findElement(By.linkText(Strings.manageProjects)).click();
		driver.findElement(By.linkText(projectName)).click();
		driver.findElement(By.xpath("//*[@id=\"project-add-category-form\"]/fieldset/input[3]")).clear();
		driver.findElement(By.xpath("//*[@id=\"project-add-category-form\"]/fieldset/input[3]")).sendKeys(categoryName);
		driver.findElement(By.xpath("//*[@id=\"project-add-category-form\"]/fieldset/input[4]")).click();
		
		assertEquals(Strings.existingCategoryError, driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[2]/div[2]/div/div/div[2]/p[2]")).getText());
	}
	
}