package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.Wait;

public class NewUserPage extends TopNavBar {

	@FindBy(id = "form-username")
	protected WebElement formUserName;

	@FindBy(id = "form-name")
	protected WebElement formName;

	@FindBy(id = "form-email")
	protected WebElement formEmail;

	@FindBy(id = "form-password")
	protected WebElement formPassword;

	@FindBy(id = "form-confirmation")
	protected WebElement formConfirm;

	@FindBy(xpath = "//*[@id=\"modal-content\"]/form/div[2]/div/button")
	protected WebElement saveBtn;

	@FindBy(xpath = "//*[@id=\"modal-content\"]/form/div[1]/div[1]/fieldset[2]/label[1]/input")
	protected WebElement remoteUser;

	@FindBy(xpath = "//*[@id=\"modal-content\"]/form/div[1]/div[1]/fieldset[1]/ul")
	protected WebElement nameError;

	@FindBy(xpath = "//*[@id=\"modal-content\"]/form/div[1]/div[1]/fieldset[2]/ul[1]")
	protected WebElement pswError;

	@FindBy(xpath = "//*[@id=\"modal-content\"]/form/div[1]/div[1]/fieldset[2]/ul[2]")
	protected WebElement pswConfirmError;
	
	protected Wait wait;

	public NewUserPage(WebDriver driver) {
		super(driver);
		wait = new Wait(driver);
	}

	public NewUserPage setUsername(String usr) {
		wait.waitClickability(formUserName);
		formUserName.sendKeys(usr);
		return this;
	}

	public NewUserPage setFullname(String name) {
		wait.waitClickability(formName);
		formName.sendKeys(name);
		return this;
	}

	public NewUserPage setEmail(String mail) {
		formEmail.sendKeys(mail);
		return this;
	}

	public NewUserPage setPassword(String psw) {
		formPassword.sendKeys(psw);
		return this;
	}

	public NewUserPage confirmPassword(String psw) {
		formConfirm.sendKeys(psw);
		return this;
	}

	public NewUserPage setRemote() {
		remoteUser.click();
		return this;
	}

	public UserSummaryPage save() {
		saveBtn.click();
		return new UserSummaryPage(driver);
	}

	public NewUserPage saveError() {
		saveBtn.click();
		return new NewUserPage(driver);
	}

	public String getNameError() {
		wait.waitVisibility(nameError);
		return nameError.getText();
	}

	public String getPswError() {
		wait.waitVisibility(pswError);
		return pswError.getText();
	}

	public String getPswConfirmError() {
		wait.waitVisibility(pswConfirmError);
		return pswConfirmError.getText();
	}

}
