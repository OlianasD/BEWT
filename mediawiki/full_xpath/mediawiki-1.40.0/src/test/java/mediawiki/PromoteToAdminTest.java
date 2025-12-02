package mediawiki;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class PromoteToAdminTest extends BaseTest {
	
	@Test
	public void promoteToAdminNoPO() throws InterruptedException {
		WebElement loginLink = driver.findElement(By.xpath("/html/body/div[4]/div[1]/nav/div/ul/li/a"));
		loginLink.click();
		WebElement userField = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/div[1]/div[2]/form/div/div[1]/div/input"));
		userField.clear();
		userField.sendKeys("admin");
		WebElement pswField = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/div[1]/div[2]/form/div/div[2]/div/input"));
		pswField.clear();
		pswField.sendKeys("e2eW3Bt3s71nGB3nchM4rK");
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/div[1]/div[2]/form/div/div[4]/div/button"));
		loginBtn.click();
		Thread.sleep(1000);
		WebElement specialPages = driver.findElement(By.xpath("/html/body/div[4]/div[2]/nav[2]/div/ul/li[3]/a"));
		specialPages.click();
		WebElement userRights = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/div[6]/ul/li[19]/a"));
		userRights.click();
		WebElement usernameField = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/form/fieldset/input[1]"));
		usernameField.sendKeys("User001");
		WebElement loadUserGroups = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/form/fieldset/input[2]"));
		loadUserGroups.click();
		WebElement adminCheckbox = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/form[2]/fieldset/table[1]/tbody/tr[2]/td/div[2]/input"));
		adminCheckbox.click();
		WebElement reason = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/form[2]/fieldset/table[2]/tbody/tr[1]/td[2]/input"));
		reason.sendKeys("promotion");
		WebElement saveBtn = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/form[2]/fieldset/table[2]/tbody/tr[2]/td[2]/input"));
		saveBtn.click();
		Thread.sleep(500);
		WebElement secondAdminCheckbox = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/form[2]/fieldset/table[1]/tbody/tr[2]/td/div[2]/input"));
		WebElement logEntry = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/ul/li"));

		assertTrue(secondAdminCheckbox.isSelected());
		assertTrue(logEntry.getText().contains("changed group membership for User001 from (none) to administrator (promotion)"));
	}
	
}