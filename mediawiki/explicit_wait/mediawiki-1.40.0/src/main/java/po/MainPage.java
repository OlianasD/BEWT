package po;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.Wait;

public class MainPage extends PageObject {
	
	@FindBy(linkText = "Log in")
	protected WebElement login;
	
	@FindBy(linkText = "Create account")
	protected WebElement createAccount;
	
	@FindBy(linkText = "Special pages")
	protected WebElement specialPages;
	
	@FindBy(id = "searchInput")
	protected WebElement searchBar;
	
	protected Wait wait;
	

	public MainPage(WebDriver driver) {
		super(driver);
		wait = new Wait(driver);
	}
	
	public CreateAccountPage createAccount() {
		createAccount.click();
		return new CreateAccountPage(driver);
	}
	
	public SpecialPagesPage specialPages() {
		specialPages.click();
		return new SpecialPagesPage(driver);
	}
	
	public LoginPage login() {
		login.click();
		return new LoginPage(driver);
	}
	
	public SearchResultsPage searchNonExisting(String query) {
		searchBar.sendKeys(query);
		searchBar.sendKeys(Keys.ENTER);
		return new SearchResultsPage(driver, query);
	}
	
	public WikiPage searchExisting(String query) {
		searchBar.sendKeys(query);
		wait.waitClickability(By.className("highlight"));
		searchBar.sendKeys(Keys.ENTER);
		return new WikiPage(driver);
	}
	
	public WikiPage goToUserPage(String user) {
		driver.findElement(By.linkText(user)).click();
		return new WikiPage(driver);
	}
	
	

}
