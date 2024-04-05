package base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import utils.Strings;

public class UpdateIssueSeverityTest extends BaseTest {

	@Test
	public void updateIssueSeverity() {
		driver.findElement(By.linkText(Strings.viewIssues)).click();
		driver.findElement(By.xpath("//*[@id=\"buglist\"]/tbody/tr/td[2]/a/i")).click();
		new Select(driver.findElement(By.id("severity"))).selectByVisibleText(Strings.majorSeverity);
		driver.findElement(By.xpath("//*[@id=\"update_bug_form\"]/div/div[3]/input")).click();
		
		assertEquals(Strings.majorSeverity, driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[2]/div[2]/div/div[1]/div/div[2]/div[2]/div/table/tbody/tr[6]/td[2]")).getText());
		
		driver.findElement(By.className("user-info")).click();
		driver.findElement(By.xpath("//*[@id=\"navbar-container\"]/div[2]/ul/li[3]/ul/li[4]/a")).click();
	}
	
}