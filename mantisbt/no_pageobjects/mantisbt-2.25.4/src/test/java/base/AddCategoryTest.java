package base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import utils.Strings;

public class AddCategoryTest extends BaseTest {
	
	@Test
	public void addCategory() throws InterruptedException {
		String projectName = "Project001";
		String categoryName = "Category001";
		
		driver.findElement(By.linkText(Strings.manage)).click();
		driver.findElement(By.linkText(Strings.manageProjects)).click();
		driver.findElement(By.linkText(projectName)).click();
		driver.findElement(By.xpath("//*[@id=\"project-add-category-form\"]/fieldset/input[3]")).clear();
		driver.findElement(By.xpath("//*[@id=\"project-add-category-form\"]/fieldset/input[3]")).sendKeys(categoryName);
		driver.findElement(By.xpath("//*[@id=\"project-add-category-form\"]/fieldset/input[4]")).click();
		Thread.sleep(1000);
		assertEquals(categoryName, driver.findElement(By.xpath("//*[@id=\"categories\"]/div/div[3]/div/div/table/tbody/tr[1]/td[1]")).getText());
		
		driver.findElement(By.className("user-info")).click();
		driver.findElement(By.xpath("//*[@id=\"navbar-container\"]/div[2]/ul/li[3]/ul/li[4]/a")).click();
	}
	
}