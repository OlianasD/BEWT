package po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.Waiter;

public class ManageArticlesPage extends SiteAdminPageObject {
	
	protected Waiter wait;
	
	public ManageArticlesPage(WebDriver driver) {
		super(driver);
		wait = new Waiter(driver);
	}
	
	public ManageArticlesPage deleteFirstArticle() {
		driver.findElement(By.id("cb0")).click();
		driver.findElement(By.xpath("//*[@id=\"toolbar-status-group\"]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"status-group-children-trash\"]/button")).click();
		return this;
	}
	
	public String getAlertMessage(String message) {
		By locator = By.className("alert-message");
		wait.waitForTextToBe(locator, message);
		return driver.findElement(locator).getText();
	}
	
	public boolean containsArticle(String title) {
		return driver.findElement(By.id("articleList")).getText().contains(title);
	}
	
	public EditArticleSiteAdminPage goToArticle(String article) {
		driver.findElement(By.linkText(article)).click();
		return new EditArticleSiteAdminPage(driver);
	}
	
	public String getFirstArticleCategory() {
		return driver.findElement(By.xpath("//*[@id=\"articleList\"]/tbody/tr[1]/th/div/div[2]/a")).getText();
	}
	
	public ManageArticlesPage archiveSecondArticle() {
		driver.findElement(By.id("cb1")).click();
		driver.findElement(By.xpath("//*[@id=\"toolbar-status-group\"]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"status-group-children-archive\"]/button")).click();
		return this;
	}

}
