package base;

import static org.junit.Assert.assertFalse;

import org.junit.Test;
import org.openqa.selenium.By;
import utils.Strings;

public class DeleteCategoryTest extends BaseTest {
	
	@Test
	public void deleteCategory() throws InterruptedException {
		String projectName = "Project001";
		String category = "Category002";
		
		driver.findElement(By.linkText(Strings.manage)).click();
		driver.findElement(By.linkText(Strings.manageProjects)).click();
		driver.findElement(By.linkText(projectName)).click();
		driver.findElement(By.xpath("//*[@id=\"categories\"]/div/div[3]/div/div/table/tbody/tr[1]/td[3]/div/div[2]/form/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[2]/div[2]/div/div/div[2]/form/input[5]")).click();
		driver.findElement(By.linkText(Strings.contin)).click();
		
		
		assertFalse(driver.findElement(By.id("categories")).getText().contains(category));
	}
	
	
}