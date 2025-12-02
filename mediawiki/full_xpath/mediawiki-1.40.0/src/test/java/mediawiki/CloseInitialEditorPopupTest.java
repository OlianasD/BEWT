package mediawiki;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class CloseInitialEditorPopupTest extends BaseTest {

	
	@Test
	public void closeInitialEditorPopup() throws InterruptedException {
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
		searchField.sendKeys("Software testing");
		searchField.sendKeys(Keys.ENTER);
		WebElement nonExistingPageLink = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/div[2]/div[1]/p[2]/a"));
		nonExistingPageLink.click();
		Thread.sleep(6000);

		WebElement startEditingBtn = driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/div[2]/div[3]/div/span[2]/a"));
		assertTrue(startEditingBtn.isDisplayed());
		Thread.sleep(1000);
		startEditingBtn.click();
	}
	
}