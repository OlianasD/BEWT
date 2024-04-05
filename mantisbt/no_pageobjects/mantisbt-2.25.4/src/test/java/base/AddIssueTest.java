package base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import utils.Strings;

public class AddIssueTest extends BaseTest {
	
	@Test
	public void addIssue() {
		String category = "Category001";
		String severity = "crash";
		String summary = "Summary001";
		String description = "description001";
		
		driver.findElement(By.linkText(Strings.newIssue)).click();
		new Select(driver.findElement(By.id("category_id"))).selectByVisibleText(category);
		new Select(driver.findElement(By.id("reproducibility"))).selectByVisibleText(Strings.reproducibilityRandom);
		new Select(driver.findElement(By.id("severity"))).selectByVisibleText(severity);
		new Select(driver.findElement(By.id("priority"))).selectByVisibleText(Strings.priorityImmediate);
		driver.findElement(By.id("summary")).clear();
		driver.findElement(By.id("summary")).sendKeys(summary);
		driver.findElement(By.id("description")).clear();
		driver.findElement(By.id("description")).sendKeys(description);
		driver.findElement(By.xpath("//*[@id=\"report_bug_form\"]/div/div[2]/div[2]/input")).click();
		driver.findElement(By.linkText(Strings.viewIssues)).click();
		
		assertEquals(category, driver.findElement(By.xpath("//*[@id=\"buglist\"]/tbody/tr/td[7]/div")).getText());
		assertEquals(severity, driver.findElement(By.xpath("//*[@id=\"buglist\"]/tbody/tr/td[8]/span")).getText());
		assertEquals(summary, driver.findElement(By.xpath("//*[@id=\"buglist\"]/tbody/tr/td[11]/a")).getText());
		
		driver.findElement(By.className("user-info")).click();
		driver.findElement(By.xpath("//*[@id=\"navbar-container\"]/div[2]/ul/li[3]/ul/li[4]/a")).click();
		
		
	}
	
}