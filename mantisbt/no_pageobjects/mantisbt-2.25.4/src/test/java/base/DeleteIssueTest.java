package base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import utils.Strings;

public class DeleteIssueTest extends BaseTest {

	
	@Test
	public void deleteIssue() {
		driver.findElement(By.linkText(Strings.viewIssues)).click();
		driver.findElement(By.xpath("//*[@id=\"buglist\"]/tbody/tr/td[1]/div/label/span")).click();
		new Select(driver.findElement(By.name("action"))).selectByVisibleText(Strings.delete);
		driver.findElement(By.xpath("//*[@id=\"bug_action\"]/div/div[2]/div[2]/div[2]/div[1]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"action-group-div\"]/form/div/div[2]/div[2]/input")).click();
		
		assertEquals(Strings.anomaliesEmpty, driver.findElement(By.xpath("//*[@id=\"bug_action\"]/div/div[1]/h4")).getText());
		
		driver.findElement(By.className("user-info")).click();
		driver.findElement(By.xpath("//*[@id=\"navbar-container\"]/div[2]/ul/li[3]/ul/li[4]/a")).click();
	}
	
}