package po;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.Wait;

public class WikiPage extends PageObject {
	
	@FindBy(xpath = "//*[@id=\"firstHeading\"]")
	protected WebElement title;
	
	@FindBy(xpath = "//*[@id=\"mw-content-text\"]")
	protected WebElement body;
	
	@FindBy(linkText = "Edit")
	protected WebElement edit;
	
	@FindBy(linkText = "Edit source")
	protected WebElement editSource;
	
	@FindBy(linkText = "Create source")
	protected WebElement createSource;
	
	@FindBy(xpath = "//*[@id=\"mw-normal-catlinks\"]/ul/li/a")
	protected WebElement category;
	
	//@FindBy(id = "p-cactions-checkbox")
	@FindBy(xpath = "//*[@id=\"p-cactions-checkbox\"]")
	protected WebElement more;
	
	@FindBy(linkText = "View history")
	protected WebElement viewHistory;
	
	protected Wait wait;

	public WikiPage(WebDriver driver) {
		super(driver);
		wait = new Wait(driver);
	}
	
	public String getTitle() {
		String ttl = "";
		try {
			ttl = title.getText();
		} catch (StaleElementReferenceException e) {
			title = driver.findElement(By.xpath("//*[@id=\"firstHeading\"]"));
			ttl = title.getText();
		}
		return ttl;
	}
	
	public String getBody(String expected) {
		wait.waitForTextToBeContained(By.xpath("//*[@id=\"mw-content-text\"]"), expected);
		return body.getText();
	}
	
	public PageCreationPage edit() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		edit.click();
		return new PageCreationPage(driver);
	}
	
	public EditSourcePage editSource() {
		editSource.click();
		return new EditSourcePage(driver);
	}
	
	public EditSourcePage createSource() {
		createSource.click();
		return new EditSourcePage(driver);
	}
	
	public WikiPage goToLink(String link) {
		By locator = By.linkText(link);
		wait.waitStaleness(driver.findElement(locator));
		wait.waitClickability(locator);
		driver.findElement(locator).click();
		return new WikiPage(driver);
	}
	
	public String getCategory() {
		wait.waitVisibility(category);
		return category.getText();
	}
	
	public PageProtectPage protect() {
		more.click();
		By locator = By.linkText("Protect");
		wait.waitClickability(locator);
		driver.findElement(locator).click();
		return new PageProtectPage(driver);
	}
	
	public PageProtectPage changeProtectionLevel() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		more.click();
		By locator = By.linkText("Change protection");
		wait.waitClickability(locator);
		driver.findElement(locator).click();
		return new PageProtectPage(driver);
	}
	
	public PageCreationPage forceEdit() {
		driver.get(driver.getCurrentUrl()+"?veaction=edit");
		return new PageCreationPage(driver);
	}
	
	public RevisionHistoryPage viewHistory() {
		viewHistory.click();
		return new RevisionHistoryPage(driver);
	}
	
	public DeletePage deletePage() {
		more.click();
		By locator = By.linkText("Delete");
		wait.waitClickability(locator);
		driver.findElement(locator).click();
		return new DeletePage(driver);
	}
	
	public String getMainRedirect() {
		return driver.findElement(By.className("redirectText")).getText();
	}
	
	public String getSourceRedirect() {
		return driver.findElement(By.className("mw-redirectedfrom")).getText();
	}

}
