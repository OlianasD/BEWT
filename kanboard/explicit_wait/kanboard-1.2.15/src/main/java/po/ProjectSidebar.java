package po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.Waiter;

public class ProjectSidebar extends TopNavBar {
	
	@FindBy(linkText = "Summary")
	protected WebElement summary;
	
	@FindBy(linkText = "Edit project")
	protected WebElement edit;
	
	@FindBy(linkText = "Columns")
	protected WebElement columns;
	
	@FindBy(linkText = "Swimlanes")
	protected WebElement swimlanes;
	
	@FindBy(linkText = "Categories")
	protected WebElement categories;
	
	@FindBy(linkText =  "Permissions")
	protected WebElement permissions;
	
	@FindBy(linkText =  "Remove")
	protected WebElement remove;
	
	protected Waiter wait;

	public ProjectSidebar(WebDriver driver) {
		super(driver);
		wait = new Waiter(driver);
	}
	
	public EditProjectPage editProject() {
		edit.click();
		return new EditProjectPage(driver);
	}
	
	public ProjectSummaryPage summary() {
		summary.click();
		return new ProjectSummaryPage(driver);
	}
	
	public ColumnsPage columns() {
		columns.click();
		return new ColumnsPage(driver);
	}
	
	public SwimlanesPage swimlanes() {
		swimlanes.click();
		return new SwimlanesPage(driver);
	}
	
	public CategoriesPage categories() {
		categories.click();
		return new CategoriesPage(driver);
	}
	
	public PermissionsPage permissions() {
		permissions.click();
		return new PermissionsPage(driver);
	}
	
	public ProjectListPage remove() {
		remove.click();
		By locator = By.id("modal-confirm-button");
		wait.waitClickability(locator);
		driver.findElement(locator).click();
		return new ProjectListPage(driver);
	}

}
