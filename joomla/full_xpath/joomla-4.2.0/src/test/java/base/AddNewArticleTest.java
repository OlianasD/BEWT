package base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class AddNewArticleTest extends BaseTest {
	
	@Test
	public void addNewArticle() {
		String title = "Test Article 01";
		String body = "This is the body of the first article for testing the platform";

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
		WebElement titleField = driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div[3]/form/fieldset/joomla-tab/joomla-tab-element[1]/div[1]/div[2]/input"));
		titleField.sendKeys(title);
		WebElement iframe = driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div[3]/form/fieldset/joomla-tab/joomla-tab-element[1]/div[10]/div[2]/div/div[1]/div[1]/div[2]/div[1]/iframe"));
		driver.switchTo().frame(iframe);
		//the XPath refers to the body of the inner iframe, that's why the previous switchTo is required
		WebElement articleText = driver.findElement(By.xpath("/html/body"));
		articleText.sendKeys(body);
		driver.switchTo().defaultContent();
		WebElement saveAndCloseBtn = driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div[3]/form/div/button[2]"));
		saveAndCloseBtn.click();
		WebElement displayedTitle = driver.findElement(By.xpath("/html/body/div/div/div/main/div[3]/div[1]/div[1]/div/div[1]/h2/a"));
		WebElement displayedBody = driver.findElement(By.xpath("/html/body/div/div/div/main/div[3]/div[1]/div[1]/div/p"));
		assertEquals(title, displayedTitle.getText());
		assertEquals(body, displayedBody.getText());

		WebElement logoutLink = driver.findElement(By.xpath("/html/body/div/div/nav/div[2]/ul[2]/li[5]/a"));
		logoutLink.click();
		WebElement logoutBtn = driver.findElement(By.xpath("/html/body/div/div/div/main/div[3]/form/div/div/button"));
		logoutBtn.click();
		
	}
}
