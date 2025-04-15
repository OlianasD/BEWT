package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.Wait;

public class SiteSocialsPage extends GeneralSettingsAbstractPage {
	
	@FindBy(id = "jsinstagram")
	protected WebElement instagram;
	
	protected Wait wait;
	

	public SiteSocialsPage(WebDriver driver) {
		super(driver);
		wait = new Wait(driver);
	}
	
	public SiteSocialsPage setInstagram(String ig) {
		wait.waitClickability(instagram);
		instagram.clear();
		instagram.sendKeys(ig);
		return this;
	}
	
	public SiteSocialsPage save() {
		saveBtn.click();
		return new SiteSocialsPage(driver);
	}
	
	public String getInstagram() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.waitVisibility(instagram);
		return instagram.getAttribute("value");
	}

}
