package po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.Strings;

public class CreateSubprojectPage extends ManageNavBar {
	
	@FindBy(name = "name")
	protected WebElement name;
	
	@FindBy(xpath = "/html/body/div[3]/form/table/tbody/tr[9]/td/input")
	protected WebElement createBtn;

	public CreateSubprojectPage(WebDriver driver) {
		super(driver);
	}
	
	public CreateSubprojectPage setName(String name) {
		this.name.sendKeys(name);
		return this;
	}
	
	public ManageProjectPage createSubproject() {
		createBtn.click();
		driver.findElement(By.linkText(Strings.contin)).click();
		return new ManageProjectPage(driver);
	}
	

}
