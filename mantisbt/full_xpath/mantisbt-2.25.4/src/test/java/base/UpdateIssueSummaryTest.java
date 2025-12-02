package base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Strings;

public class UpdateIssueSummaryTest extends BaseTest {
	
	@Test
	public void updateIssueSummary()  throws InterruptedException {
		String summary = "Summary002";

		WebElement loginUsr = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[4]/div/div/div[1]/form/fieldset/label/span/input"));
		loginUsr.clear();
		loginUsr.sendKeys("administrator");
		WebElement usrLoginBtn = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[4]/div/div/div[1]/form/fieldset/input[2]"));
		usrLoginBtn.click();
		Thread.sleep(500);
		WebElement loginPsw = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[4]/div/div/div/form/fieldset/label/span/input"));
		loginPsw.clear();
		loginPsw.sendKeys("e2eW3Bt3s71nGB3nchM4rK");
		WebElement pswLoginBtn = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[4]/div/div/div/form/fieldset/input[3]"));
		pswLoginBtn.click();
		WebElement viewIssues = driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[2]/a"));
		viewIssues.click();
		WebElement editIssue = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[2]/form/div/div[2]/div[2]/div[1]/table/tbody/tr/td[2]/a"));
		editIssue.click();
		WebElement summaryField = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/div/form/div/div[2]/div/div/table/tbody/tr[11]/td/input"));
		summaryField.clear();
		summaryField.sendKeys(summary);
		WebElement saveBtn = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/div/form/div/div[3]/input"));
		saveBtn.click();
		Thread.sleep(500);
		WebElement displayedSummary = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/div/div[2]/div[2]/div/table/tbody/tr[10]/td"));
		
		assertEquals("0000001: "+summary, displayedSummary.getText());

		WebElement adminDropdown = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/ul/li[3]/a/span"));
		adminDropdown.click();
		WebElement logout = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a"));
		logout.click();
	}
	

	
}