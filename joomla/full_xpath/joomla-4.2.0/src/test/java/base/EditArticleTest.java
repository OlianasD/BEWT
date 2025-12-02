package base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EditArticleTest extends BaseTest {
	
	@Test
	public void editArticle() throws InterruptedException {
		String expectedBody = "This is the body of the first article for testing the platformEDITED";

		WebElement authorLogin = driver.findElement(By.xpath("/html/body/div/div/nav/div[2]/ul/li[3]/a"));
		authorLogin.click();
		WebElement userField = driver.findElement(By.xpath("/html/body/div/div/div/main/div[3]/form/fieldset/div[1]/div[2]/input"));;
		userField.sendKeys("administrator");
		WebElement pswField = driver.findElement(By.xpath("/html/body/div/div/div/main/div[3]/form/fieldset/div[2]/div[2]/div/div/input"));
		pswField.sendKeys(rootPassword);
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div/div/div/main/div[3]/form/fieldset/div[4]/div/button"));
		loginBtn.click();
		Thread.sleep(500);
		WebElement homeLink = driver.findElement(By.xpath("/html/body/div/div/nav/div[2]/ul[1]/li[1]/a"));
		homeLink.click();
		WebElement editArticle = driver.findElement(By.xpath("/html/body/div/div/div/main/div[3]/div[1]/div[1]/div/div[2]/div/div/a/div"));
		editArticle.click();
		WebElement iframe = driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div[3]/form/fieldset/joomla-tab/joomla-tab-element[1]/div[9]/div[2]/div/div[1]/div[1]/div[2]/div[1]/iframe"));
		driver.switchTo().frame(iframe);
		//the XPath refers to the body of the inner iframe, that's why the previous switchTo is required
		WebElement articleText = driver.findElement(By.xpath("/html/body"));
		articleText.sendKeys("EDITED");
		driver.switchTo().defaultContent();
		WebElement saveAndCloseBtn = driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div[3]/form/div/button[2]"));
		saveAndCloseBtn.click();
		WebElement displayedBody = driver.findElement(By.xpath("/html/body/div/div/div/main/div[3]/div[1]/div[1]/div/p"));

		assertEquals(expectedBody, displayedBody.getText());

		WebElement logoutLink = driver.findElement(By.xpath("/html/body/div/div/nav/div[2]/ul[2]/li[5]/a"));
		logoutLink.click();
		WebElement logoutBtn = driver.findElement(By.xpath("/html/body/div/div/div/main/div[3]/form/div/div/button"));
		logoutBtn.click();
	}
}
