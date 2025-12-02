package mediawiki;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class CreateRedirectTest extends BaseTest {

	
	@Test
	public void createRedirect() throws InterruptedException {
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
		searchField.sendKeys("Testing");
		searchField.sendKeys(Keys.ENTER);
		WebElement nonExistingPageLink = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/div[2]/div[1]/p/a"));
		nonExistingPageLink.click();
		WebElement closeNotice = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div[3]/div/div[2]/div[2]/div[1]/div[1]/span[3]/a/span[1]"));
		closeNotice.click();
		WebElement createSource = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/nav[1]/div/ul/li[2]/a"));
		createSource.click();
		WebElement classicEditor = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/form/div[2]/div[3]/div[1]/div[2]/div/textarea"));
		classicEditor.sendKeys("#REDIRECT [[Software testing]]");
		WebElement saveBtn = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/form/div[4]/div[4]/span[1]/input"));
		saveBtn.click();
		Thread.sleep(500);
		WebElement redirLink = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[5]/div[1]/div/ul/li/a"));
		
		assertEquals("Software testing", redirLink.getText());
	}
	
}