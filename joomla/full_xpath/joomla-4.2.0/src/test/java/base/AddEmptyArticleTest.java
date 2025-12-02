package base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddEmptyArticleTest extends BaseTest {
	
	@Test
	public void addEmptyArticle() {
		WebElement authorLogin = driver.findElement(By.xpath("/html/body/div/div/nav/div[2]/ul/li[3]/a"));
		authorLogin.click();
		WebElement userField = driver.findElement(By.xpath("/html/body/div/div/div/main/div[3]/form/fieldset/div[1]/div[2]/input"));;
		userField.sendKeys("administrator");
		WebElement pswField = driver.findElement(By.xpath("/html/body/div/div/div/main/div[3]/form/fieldset/div[2]/div[2]/div/div/input"));
		pswField.sendKeys(rootPassword);
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div/div/div/main/div[3]/form/fieldset/div[4]/div/button"));
		loginBtn.click();
		WebElement createPostLink = driver.findElement(By.xpath("/html/body/div/div/nav/div[2]/ul[2]/li[1]/a"));
		createPostLink.click();
		WebElement saveAndCloseBtn = driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div[3]/form/div/button[2]"));
		saveAndCloseBtn.click();
		WebElement errorMsg = driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div[3]/form/fieldset/joomla-tab/joomla-tab-element[1]/div[1]/div[1]/label/span[2]"));

		assertEquals("Please fill in this field", errorMsg.getText());
	}
}
