package po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.Waiter;

public class ProjectListPage extends TopNavBar {
	
	protected Waiter wait;
	
	public ProjectListPage(WebDriver driver) {
		super(driver);
		wait = new Waiter(driver);
	}
	
	public boolean firstProjectIsNot(String proj) {
		By locator = By.xpath("//*[@id=\"dashboard\"]/div[2]/div[2]/div[2]/div[1]/span/a");
		return wait.waitForTextToDisappear(locator, proj);
	}
	
	public boolean containsProject(String proj) {
		return driver.findElement(By.tagName("body")).getText().contains(proj);
	}
}