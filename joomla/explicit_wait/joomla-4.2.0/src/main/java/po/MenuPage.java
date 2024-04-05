package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.Waiter;

public class MenuPage extends PageObject {
	
	@FindBy(linkText = "All Menu Items")
	protected WebElement menuItems;
	
	protected Waiter wait;
	
	public MenuPage(WebDriver driver) {
		super(driver);
		wait = new Waiter(driver);
	}
	
	public MenuItemsPage menuItems() {
		wait.waitClickability(menuItems);
		menuItems.click();
		return new MenuItemsPage(driver);
	}
	


}
