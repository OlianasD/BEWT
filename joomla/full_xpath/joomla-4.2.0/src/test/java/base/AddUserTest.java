package base;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddUserTest extends BaseTest {
	
	@Test
	public void addUser() {
		String name ="Test User";
		String username = "tuser01";
		String password = "tpassword";
		String email = "testmail@example.com";

		WebElement authorLogin = driver.findElement(By.xpath("/html/body/div/div/nav/div[2]/ul/li[3]/a"));
		authorLogin.click();
		WebElement userField = driver.findElement(By.xpath("/html/body/div/div/div/main/div[3]/form/fieldset/div[1]/div[2]/input"));;
		userField.sendKeys("administrator");
		WebElement pswField = driver.findElement(By.xpath("/html/body/div/div/div/main/div[3]/form/fieldset/div[2]/div[2]/div/div/input"));
		pswField.sendKeys(rootPassword);
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div/div/div/main/div[3]/form/fieldset/div[4]/div/button"));
		loginBtn.click();
		WebElement siteAdminLink = driver.findElement(By.xpath("/html/body/div/div/nav/div[2]/ul[2]/li[3]/a"));
		siteAdminLink.click();
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver = driver.switchTo().window(tabs2.get(1));
		WebElement siteAdminUser = driver.findElement(By.xpath("/html/body/div/div[1]/section/main/div/form/fieldset/div[1]/div/input"));
		siteAdminUser.clear();
		siteAdminUser.sendKeys("administrator");
		WebElement siteAdminPsw = driver.findElement(By.xpath("/html/body/div/div[1]/section/main/div/form/fieldset/div[2]/div/input"));
		siteAdminPsw.clear();
		siteAdminPsw.sendKeys(rootPassword);
		WebElement siteAdminLoginBtn = driver.findElement(By.xpath("/html/body/div/div[1]/section/main/div/form/fieldset/div[3]/div/button"));
		siteAdminLoginBtn.click();
		WebElement usersLink = driver.findElement(By.xpath("/html/body/div[1]/div[2]/section[1]/div/div/main/div[3]/div/div/div[1]/div/div[2]/nav/ul/li[1]/ul/li[1]/a"));
		usersLink.click();
		WebElement addUserBtn = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/nav/div/joomla-toolbar-button[1]/button"));
		addUserBtn.click();
		WebElement nameField = driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/main/form/div/joomla-tab/joomla-tab-element[1]/fieldset/div/div[1]/div[2]/input"));
		nameField.sendKeys(name);
		WebElement usernameField = driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/main/form/div/joomla-tab/joomla-tab-element[1]/fieldset/div/div[2]/div[2]/input"));
		usernameField.sendKeys(username);
		WebElement passwordField = driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/main/form/div/joomla-tab/joomla-tab-element[1]/fieldset/div/div[3]/div[2]/div[2]/div[1]/input"));
		passwordField.sendKeys(password);
		WebElement pswConfirm = driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/main/form/div/joomla-tab/joomla-tab-element[1]/fieldset/div/div[4]/div[2]/div/div/input"));
		pswConfirm.sendKeys(password);
		WebElement emailField = driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/main/form/div/joomla-tab/joomla-tab-element[1]/fieldset/div/div[5]/div[2]/input"));
		emailField.sendKeys(email);
		WebElement saveAndCloseBtn = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/nav/div/div/joomla-toolbar-button/button"));
		saveAndCloseBtn.click();
		WebElement displayedName = driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/div/div/main/form/div/div/div/table/tbody/tr[2]/th/div[1]/a"));
		WebElement displayedUsername = driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/div/div/main/form/div/div/div/table/tbody/tr[2]/td[2]"));
		WebElement displayedMail = driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/div/div/main/form/div/div/div/table/tbody/tr[2]/td[6]"));

		assertEquals(name, displayedName.getText());
		assertEquals(username, displayedUsername.getText());
		assertEquals(email, displayedMail.getText());
		
		WebElement userMenuDropdown = driver.findElement(By.xpath("/html/body/header/div[2]/div[2]/div[2]/div/button/div[2]"));
		userMenuDropdown.click();
		WebElement siteAdminLogoutLink = driver.findElement(By.xpath("/html/body/header/div[2]/div[2]/div[2]/div/div/a[3]"));
		siteAdminLogoutLink.click();
		tabs2 = new ArrayList<String> (driver.getWindowHandles());
		driver.close();
	    driver = driver.switchTo().window(tabs2.get(0));
		WebElement logoutLink = driver.findElement(By.xpath("/html/body/div/div/nav/div[2]/ul[2]/li[5]/a"));
		logoutLink.click();
		WebElement logoutBtn = driver.findElement(By.xpath("/html/body/div/div/div/main/div[3]/form/div/div/button"));
		logoutBtn.click();
	}
}
