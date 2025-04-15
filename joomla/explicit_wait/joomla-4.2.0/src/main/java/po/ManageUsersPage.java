package po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.JavascriptExecutor;
import utils.Wait;

public class ManageUsersPage extends SiteAdminPageObject {
	
	@FindBy(className = "button-new")
	protected WebElement addUserBtn;
	
	@FindBy(xpath = "//*[@id=\"toolbar-delete\"]/button")
	protected WebElement deleteBtn;
	
	protected Wait wait;
	
	public ManageUsersPage(WebDriver driver) {
		super(driver);
		wait = new Wait(driver);
	}
	
	public AddUserPage addUser() {
		addUserBtn.click();
		return new AddUserPage(driver);
	}
	
	public String getSecondUserRealName() {
		return driver.findElement(By.xpath("//*[@id=\"userList\"]/tbody/tr[2]/th/div[1]/a")).getText();
	}
	
	public String getSecondUserName() {
		return driver.findElement(By.xpath("//*[@id=\"userList\"]/tbody/tr[2]/td[2]")).getText();
	}
	
	public String getSecondUserEmail() {
		return driver.findElement(By.xpath("//*[@id=\"userList\"]/tbody/tr[2]/td[6]")).getText();
	}
	
	public ManageUsersPage selectSecondUser() {
		driver.findElement(By.id("cb1")).click();
		return this;
	}
	
	public ManageUsersPage deleteSelectedUser() {
		driver.findElement(By.xpath("//*[@id=\"toolbar-status-group\"]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"status-group-children-delete\"]/button")).click();
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
		return new ManageUsersPage(driver);
	}
	
	public String getAlertMessage(String expected) {
		wait.waitForTextToBe(By.className("alert-message"), expected);
		return driver.findElement(By.className("alert-message")).getText();
	}
	
	public boolean containsUser(String user) {
		return driver.findElement(By.id("userList")).getText().contains(user);
	}
	
	public boolean containsGroup(int uid, String group) {
		wait.waitForTextToBeContained(By.xpath("//*[@id=\"userList\"]/tbody/tr["+uid+"]/td[5]"), group);
		return driver.findElement(By.xpath("//*[@id=\"userList\"]/tbody/tr["+uid+"]/td[5]")).getText().contains(group);
	}
	
	public EditUserPage editUser(String name) {
		WebElement user = driver.findElement(By.linkText(name));
		new JavascriptExecutor(driver).scrollTo(user);
		user.click();
		return new EditUserPage(driver);
	}
	

}
