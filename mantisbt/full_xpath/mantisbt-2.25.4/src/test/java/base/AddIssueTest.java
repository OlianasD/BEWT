package base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.Strings;

public class AddIssueTest extends BaseTest {
	
	@Test
	public void addIssue() throws InterruptedException {
		String category = "Category001";
		String severity = "crash";
		String summary = "Summary001";
		String description = "description001";

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
		WebElement newIssue = driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[3]/a"));
		newIssue.click();
		WebElement categorySelect = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/form/div/div[2]/div[1]/div/table/tbody/tr[1]/td/select"));
		new Select(categorySelect).selectByVisibleText(category);
		WebElement reproducibilitySelect = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/form/div/div[2]/div[1]/div/table/tbody/tr[2]/td/select"));
		new Select(reproducibilitySelect).selectByVisibleText(Strings.reproducibilityRandom);
		WebElement severitySelect = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/form/div/div[2]/div[1]/div/table/tbody/tr[3]/td/select"));
		new Select(severitySelect).selectByVisibleText(severity);
		WebElement prioritySelect = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/form/div/div[2]/div[1]/div/table/tbody/tr[4]/td/select"));
		new Select(prioritySelect).selectByVisibleText(Strings.priorityImmediate);
		WebElement summaryField = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/form/div/div[2]/div[1]/div/table/tbody/tr[7]/td/input"));
		summaryField.clear();
		summaryField.sendKeys(summary);
		WebElement descriptionField = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/form/div/div[2]/div[1]/div/table/tbody/tr[8]/td/textarea"));
		descriptionField.clear();
		descriptionField.sendKeys(description);
		WebElement submitBtn = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/form/div/div[2]/div[2]/input"));
		submitBtn.click();
		Thread.sleep(500);
		WebElement viewIssues = driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[2]/a"));
		viewIssues.click();
		WebElement displayedCategory = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[2]/form/div/div[2]/div[2]/div[1]/table/tbody/tr/td[7]/div"));
		WebElement displayedSeverity = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[2]/form/div/div[2]/div[2]/div[1]/table/tbody/tr/td[8]/span"));
		WebElement displayedSummary = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[2]/form/div/div[2]/div[2]/div[1]/table/tbody/tr/td[11]/a"));

		assertEquals(category, displayedCategory.getText());
		assertEquals(severity, displayedSeverity.getText());
		assertEquals(summary, displayedSummary.getText());

		WebElement adminDropdown = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/ul/li[3]/a/span"));
		adminDropdown.click();
		WebElement logout = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a"));
		logout.click();
	}
	
}