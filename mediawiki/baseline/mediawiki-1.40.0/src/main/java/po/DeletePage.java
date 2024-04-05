package po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeletePage extends PageObject {
	
	@FindBy(id = "wpConfirmB")
	protected WebElement deleteBtn;

	public DeletePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public DeletePage delete() {
		deleteBtn.click();
		return new DeletePage(driver);
	}
	
	public String getSuccessMessage() {
		return driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/p[1]")).getText();
	}

}
