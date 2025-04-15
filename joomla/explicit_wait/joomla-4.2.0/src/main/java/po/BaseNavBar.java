package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Wait;

public class BaseNavBar {
	
	public WebDriver driver;
	
	@FindBy(linkText = "Home")
	protected WebElement home;
	
	@FindBy(linkText = "Author Login")
	protected WebElement authorLogin;
	
	protected Wait wait;
	
	public BaseNavBar(WebDriver driver) {
		this.driver = driver;
		wait = new Wait(driver);
		PageFactory.initElements(driver, this);
	}
	
	public AuthorLoginPage authorLogin() {
		authorLogin.click();
		return new AuthorLoginPage(driver);
	}
	
	public LoggedHome home() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		home.click();
		return new LoggedHome(driver);
	}
	
}
