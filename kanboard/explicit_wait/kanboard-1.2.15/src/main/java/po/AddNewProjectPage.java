package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.Waiter;

public class AddNewProjectPage extends PageObject {

	@FindBy(id = "form-name")
	protected WebElement newProjectInput;

	@FindBy(xpath = "//*[@id=\"project-creation-form\"]/div[2]/div/button")
	protected WebElement saveBtn;

	@FindBy(className = "form-errors")
	protected WebElement errorMsg;
	
	protected Waiter wait;

	public AddNewProjectPage(WebDriver driver) {
		super(driver);
		wait = new Waiter(driver);

	}

	public ProjectSummaryPage addNewProject(String name) {
		wait.waitClickability(newProjectInput);
		newProjectInput.sendKeys(name);
		saveBtn.click();
		return new ProjectSummaryPage(driver);

	}

	public AddNewProjectPage addEmptyProject() {
		wait.waitClickability(saveBtn);
		saveBtn.click();
		return new AddNewProjectPage(driver);
	}

	public String getErrorMessage() {
		wait.waitVisibility(errorMsg);
		return errorMsg.getText();
	}

}
