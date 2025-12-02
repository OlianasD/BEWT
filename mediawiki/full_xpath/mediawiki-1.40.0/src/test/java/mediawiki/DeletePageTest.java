package mediawiki;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class DeletePageTest extends BaseTest {
	
	@Test
	public void deletePageNoPO() throws InterruptedException {
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
		WebElement searchField = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/div/div/form/div/input[1]"));
		searchField.sendKeys("E2E Web Testing");
		Thread.sleep(500);
		searchField.sendKeys(Keys.ENTER);
		WebElement more = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/nav[2]/input"));
		more.click();
		WebElement delete = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/nav[2]/div/ul/li[1]/a"));
		delete.click();
		WebElement confirmDelete = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/div[1]/form/fieldset/div/div[4]/div/span[2]/span/button"));
		confirmDelete.click();
		Thread.sleep(1000);
		WebElement successMsg = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/p[1]"));
		assertEquals("\"E2E Web Testing\" has been deleted. See deletion log for a record of recent deletions.",
				successMsg.getText());

	}
	
}