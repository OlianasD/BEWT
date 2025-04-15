package po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.Wait;

public class MenuItemsPage extends SiteAdminPageObject {
	
	@FindBy(className = "button-new")
	protected WebElement createMenuItem;
	
	protected Wait wait;
	
	public MenuItemsPage(WebDriver driver) {
		super(driver);
		wait = new Wait(driver);
	}
	
	public CreateMenuItemPage createMenuItem() {
		createMenuItem.click();
		return new CreateMenuItemPage(driver);
	}
	
	public String getAlertMessage() {
		wait.waitVisibility(By.className("alert-message"));
		return driver.findElement(By.className("alert-message")).getText();
	}
	
	public boolean containsMenuItem(String title) {
		return driver.findElement(By.id("menuitemList")).getText().contains(title);
	}

}
