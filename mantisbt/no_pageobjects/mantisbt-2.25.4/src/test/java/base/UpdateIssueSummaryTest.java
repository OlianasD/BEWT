package base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import utils.Strings;

public class UpdateIssueSummaryTest extends BaseTest {
	
	@Test
	public void updateIssueSummary() {
		String summary = "Summary002";
		
		driver.findElement(By.linkText(Strings.viewIssues)).click();
		driver.findElement(By.xpath("//*[@id=\"buglist\"]/tbody/tr/td[2]/a/i")).click();
		driver.findElement(By.id("summary")).clear();
		driver.findElement(By.id("summary")).sendKeys(summary);
		driver.findElement(By.xpath("//*[@id=\"update_bug_form\"]/div/div[3]/input")).click();
		
		assertEquals("0000001: "+summary, driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[2]/div[2]/div/div[1]/div/div[2]/div[2]/div/table/tbody/tr[10]/td")).getText());
		
		driver.findElement(By.className("user-info")).click();
		driver.findElement(By.xpath("//*[@id=\"navbar-container\"]/div[2]/ul/li[3]/ul/li[4]/a")).click();
	}
	

	
}