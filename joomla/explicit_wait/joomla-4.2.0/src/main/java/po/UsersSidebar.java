package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.Waiter;

public class UsersSidebar extends SiteAdminHome {
	
	@FindBy(xpath = "//*[@id=\"collapse4\"]/li[2]/a")
	protected WebElement groups;
	
	protected Waiter wait;
	
	public UsersSidebar(WebDriver driver) {
		super(driver);
		wait = new Waiter(driver);
	}
	
	public ManageGroupsPage groups() {
		wait.waitClickability(groups);
		groups.click();
		return new ManageGroupsPage(driver);
	}
	
	

}
