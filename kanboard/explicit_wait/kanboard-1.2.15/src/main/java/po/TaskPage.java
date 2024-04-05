package po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.Waiter;

public class TaskPage extends TaskSidebar {
	
	@FindBy(xpath = "//*[@id=\"task-summary\"]/div/div/div[1]/ul/li[1]/span")
	protected WebElement status;
	
	protected Waiter wait;

	public TaskPage(WebDriver driver) {
		super(driver);
		wait = new Waiter(driver);
	}
	
	public TaskPage confirmCloseTask() {
		By locator = By.xpath("//*[@id=\"modal-confirm-button\"]");
		wait.waitClickability(locator);
		driver.findElement(locator).click();
		/*try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		return new TaskPage(driver);
	}
	
	public String getStatus(String expected) {
		By locator = By.xpath("//*[@id=\"task-summary\"]/div/div/div[1]/ul/li[1]/span");
		wait.waitForTextToBe(locator, expected);
		return status.getText();
	}

}
