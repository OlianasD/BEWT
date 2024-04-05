package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import utils.Wait;

public class LanguagePage extends GeneralSettingsAbstractPage {
	
	@FindBy(id = "jslanguage")
	protected WebElement langSelect;
	
	protected Wait wait;

	public LanguagePage(WebDriver driver) {
		super(driver);
		wait = new Wait(driver);
	}
	
	public LanguagePage setLanguage(String lang) {
		wait.waitClickability(langSelect);
		new Select(langSelect).selectByVisibleText(lang);
		return this;
	}
	
	public LanguagePage save() {
		saveBtn.click();
		return new LanguagePage(driver);
	}
	
	public String getLanguage() {
		wait.waitVisibility(langSelect);
		return new Select(langSelect).getFirstSelectedOption().getText();
	}

}
