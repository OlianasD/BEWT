package base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import utils.Strings;

public class UpdateCategoryEmptyTest extends BaseTest {
	
	@Test
	public void updateCategoryEmpty() throws InterruptedException {
		String projectName = "Project001";
		
		driver.findElement(By.linkText(Strings.manage)).click();
		driver.findElement(By.linkText(Strings.manageProjects)).click();
		driver.findElement(By.linkText(projectName)).click();
		driver.findElement(By.xpath("//*[@id=\"categories\"]/div/div[3]/div/div/table/tbody/tr[1]/td[3]/div/div[1]/form/button")).click();
		driver.findElement(By.id("proj-category-name")).clear();
		driver.findElement(By.id("proj-category-name")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"manage-proj-category-update-form\"]/div/div[3]/input")).click();
		Thread.sleep(1000);
		
		assertEquals(Strings.emptyCategoryError, driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[2]/div[2]/div/div/div[2]/p[2]")).getText());
		
		driver.findElement(By.className("user-info")).click();
		driver.findElement(By.xpath("//*[@id=\"navbar-container\"]/div[2]/ul/li[3]/ul/li[4]/a")).click();
	}
	
}