package base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.Strings;

public class UpdateIssueStatusNewTest extends BaseTest {

	@Test
	public void updateIssueStatusNew() throws InterruptedException {
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
		WebElement selectStatus = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/div/form/div/div[2]/div/div/table/tbody/tr[7]/td[1]/select"));
		new Select(selectStatus).selectByVisibleText(Strings.statusNew);
		WebElement saveBtn = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/div/form/div/div[3]/input"));
		saveBtn.click();
		Thread.sleep(500);
		WebElement displayedStatus = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/div/div[2]/div[2]/div/table/tbody/tr[7]/td[1]"));
		
		assertEquals(Strings.statusNew, displayedStatus.getText());

		WebElement adminDropdown = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/ul/li[3]/a/span"));
		adminDropdown.click();
		WebElement logout = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a"));
		logout.click();
	}
	
}