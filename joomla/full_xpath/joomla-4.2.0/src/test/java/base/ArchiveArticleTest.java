package base;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class ArchiveArticleTest extends BaseTest {
	
	@Test
	public void archiveArticle() throws InterruptedException {
		WebElement authorLogin = driver.findElement(By.xpath("/html/body/div/div/nav/div[2]/ul/li[3]/a"));
		authorLogin.click();
		WebElement userField = driver.findElement(By.xpath("/html/body/div/div/div/main/div[3]/form/fieldset/div[1]/div[2]/input"));;
		userField.sendKeys("administrator");
		WebElement pswField = driver.findElement(By.xpath("/html/body/div/div/div/main/div[3]/form/fieldset/div[2]/div[2]/div/div/input"));
		pswField.sendKeys(rootPassword);
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div/div/div/main/div[3]/form/fieldset/div[4]/div/button"));
		loginBtn.click();
		WebElement siteAdminLink = driver.findElement(By.xpath("/html/body/div/div/nav/div[2]/ul[2]/li[3]/a"));
		siteAdminLink.click();
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		driver = driver.switchTo().window(tabs2.get(1));
		WebElement siteAdminUser = driver.findElement(By.xpath("/html/body/div/div[1]/section/main/div/form/fieldset/div[1]/div/input"));
		siteAdminUser.clear();
		siteAdminUser.sendKeys("administrator");
		WebElement siteAdminPsw = driver.findElement(By.xpath("/html/body/div/div[1]/section/main/div/form/fieldset/div[2]/div/input"));
		siteAdminPsw.clear();
		siteAdminPsw.sendKeys(rootPassword);
		WebElement siteAdminLoginBtn = driver.findElement(By.xpath("/html/body/div/div[1]/section/main/div/form/fieldset/div[3]/div/button"));
		siteAdminLoginBtn.click();
		WebElement articles = driver.findElement(By.xpath("/html/body/div[1]/div[2]/section[1]/div/div/main/div[3]/div/div/div[1]/div/div[2]/nav/ul/li[2]/ul/li[1]/a"));
		articles.click();
		WebElement secondArticleCheckbox = driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/div/div/main/form/div/div/div/table/tbody/tr[2]/td[1]/input"));
		secondArticleCheckbox.click();
		WebElement actionsDropdown = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/nav/div/joomla-toolbar-button[2]/button"));
		actionsDropdown.click();
		WebElement archive = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/nav/div/joomla-toolbar-button[2]/div/joomla-toolbar-button[5]/button"));
		archive.click();
		Thread.sleep(500);
		WebElement successMsg = driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/div/div/main/div/joomla-alert/div[2]/div"));

		assertEquals("Article archived.", successMsg.getText());

		WebElement userMenuDropdown = driver.findElement(By.xpath("/html/body/header/div[2]/div[2]/div[2]/div/button/div[2]"));
		userMenuDropdown.click();
		WebElement siteAdminLogoutLink = driver.findElement(By.xpath("/html/body/header/div[2]/div[2]/div[2]/div/div/a[3]"));
		siteAdminLogoutLink.click();
		tabs2 = new ArrayList<String> (driver.getWindowHandles());
		driver.close();
		driver = driver.switchTo().window(tabs2.get(0));
		WebElement logoutLink = driver.findElement(By.xpath("/html/body/div/div/nav/div[2]/ul[2]/li[5]/a"));
		logoutLink.click();
		WebElement logoutBtn = driver.findElement(By.xpath("/html/body/div/div/div/main/div[3]/form/div/div/button"));
		logoutBtn.click();
	}
}
