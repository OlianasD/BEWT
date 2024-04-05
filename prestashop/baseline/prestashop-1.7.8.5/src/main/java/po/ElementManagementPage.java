package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementManagementPage extends AdminSidebar {
	
	@FindBy(className = "alert-text")
	protected WebElement tagMessage;

	public ElementManagementPage(WebDriver driver) {
		super(driver);
	}
	
	public String getSuccessMessage() {
		return tagMessage.getText();
	}

}
