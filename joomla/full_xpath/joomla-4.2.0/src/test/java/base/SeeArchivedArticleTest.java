package base;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class SeeArchivedArticleTest extends BaseTest {
	
	@Test
	public void seeArchivedArticle() throws Exception {
		String title = "Your Modules";

		WebElement authorLogin = driver.findElement(By.xpath("/html/body/div/div/nav/div[2]/ul/li[3]/a"));
		authorLogin.click();
		WebElement userField = driver.findElement(By.xpath("/html/body/div/div/div/main/div[3]/form/fieldset/div[1]/div[2]/input"));;
		userField.sendKeys("administrator");
		WebElement pswField = driver.findElement(By.xpath("/html/body/div/div/div/main/div[3]/form/fieldset/div[2]/div[2]/div/div/input"));
		pswField.sendKeys(rootPassword);
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div/div/div/main/div[3]/form/fieldset/div[4]/div/button"));
		loginBtn.click();
		Thread.sleep(1000);
		WebElement testMenuItem = driver.findElement(By.xpath("/html/body/div/div/nav/div[2]/ul/li[4]/a"));
		testMenuItem.click();
		WebElement firstArticle = driver.findElement(By.xpath("/html/body/div/div/div/main/div[3]/div[1]/div/div[1]/h2/a"));
		assertEquals(firstArticle.getText(), title);

		WebElement logoutLink = driver.findElement(By.xpath("/html/body/div/div/nav/div[2]/ul[2]/li[5]/a"));
		logoutLink.click();
		WebElement logoutBtn = driver.findElement(By.xpath("/html/body/div/div/div/main/div[3]/form/div/div/button"));
		logoutBtn.click();
		
	}
}
