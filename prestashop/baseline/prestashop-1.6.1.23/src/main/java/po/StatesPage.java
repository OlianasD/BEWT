package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StatesPage extends AdminSidebar {
	
	@FindBy(xpath = "//*[@id=\"page-header-desc-state-new_state\"]")
	protected WebElement addNewState;
	
	@FindBy(className = "alert-success")
	protected WebElement tagMessage;

	public StatesPage(WebDriver driver) {
		super(driver);
	}
	
	public AddNewStatePage addNewState() {
		addNewState.click();
		return new AddNewStatePage(driver);
	}
	
	public String getSuccesssMessage() {
		return tagMessage.getText();
	}

}
