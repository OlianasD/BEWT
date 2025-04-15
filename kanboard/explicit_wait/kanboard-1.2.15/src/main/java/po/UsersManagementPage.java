package po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.Wait;

public class UsersManagementPage extends TopNavBar {

	@FindBy(linkText = "New user")
	protected WebElement newUser;

	@FindBy(xpath = "/html/body/section/div[3]/div[2]/div[1]/div/a/strong/i")
	protected WebElement firstUserDropdown;

	@FindBy(linkText = "Remove")
	protected WebElement remove;

	@FindBy(xpath = "//*[@id=\"modal-confirm-button\"]")
	protected WebElement confirmRemoveBtn;
	
	protected Wait wait;

	public UsersManagementPage(WebDriver driver) {
		super(driver);
		wait = new Wait(driver);
	}

	public NewUserPage newUser() {
		newUser.click();
		return new NewUserPage(driver);
	}

	public UsersManagementPage removeFirstUser() {
		firstUserDropdown.click();
		remove.click();
		wait.waitClickability(confirmRemoveBtn);
		confirmRemoveBtn.click();
		return new UsersManagementPage(driver);
	}

	public boolean containsUser(String user) {
		return driver.findElement(By.tagName("body")).getText().contains(user);
	}
	
	public boolean firstUserIsNot(String user) {
		By locator = By.xpath("/html/body/section/div[3]/div[2]/div[1]/span/a");
		return wait.waitForTextToDisappear(locator, user);
	}

	public UserSummaryPage goToUser(String user) {
		driver.findElement(By.linkText(user)).click();
		return new UserSummaryPage(driver);
	}

}
