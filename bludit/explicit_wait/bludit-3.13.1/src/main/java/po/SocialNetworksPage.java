package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.Wait;

public class SocialNetworksPage extends EditUserPage {
	
	@FindBy(id = "jsfacebook")
	protected WebElement facebook;
	
	@FindBy(id = "jsinstagram")
	protected WebElement instagram;
	
	@FindBy(xpath = "//*[@id=\"jsform\"]/div[1]/div/button")
	protected WebElement saveBtn;
	
	protected Wait wait;

	public SocialNetworksPage(WebDriver driver) {
		super(driver);
		wait = new Wait(driver);
	}
	
	public SocialNetworksPage setFb(String fb) {
		wait.waitClickability(facebook);
		facebook.sendKeys(fb);
		return this;
	}
	
	public SocialNetworksPage setIg(String ig) {
		instagram.sendKeys(ig);
		return this;
	}
	
	public UsersPage save() {
		saveBtn.click();
		return new UsersPage(driver);
	}
	
	public String getFb() {
		return facebook.getAttribute("value");
	}
	
	public String getIg() {
		return instagram.getAttribute("value");
	}
	
	
	
	

}
