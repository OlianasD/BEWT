package base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.Strings;

public class AssignIssueTest extends BaseTest {
	
	@Test
	public void assignIssue() throws InterruptedException {
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
		WebElement issueCheckbox = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[2]/form/div/div[2]/div[2]/div[1]/table/tbody/tr/td[1]/div/label/span"));
		issueCheckbox.click();
		WebElement actionSelect = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[2]/form/div/div[2]/div[2]/div[2]/div[1]/select"));
		new Select(actionSelect).selectByVisibleText(Strings.assign);
		WebElement okBtn = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[2]/form/div/div[2]/div[2]/div[2]/div[1]/input"));
		okBtn.click();
		WebElement assignIssueBtn = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div/form/div/div[2]/div[2]/input"));
		assignIssueBtn.click();
		Thread.sleep(500);
		WebElement displayedStatus = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[2]/form/div/div[2]/div[2]/div[1]/table/tbody/tr/td[9]/div"));
		
		assertEquals(Strings.assignedAdministrator, displayedStatus.getText());

		WebElement adminDropdown = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/ul/li[3]/a/span"));
		adminDropdown.click();
		WebElement logout = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a"));
		logout.click();
	}
	
}