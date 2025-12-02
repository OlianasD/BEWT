package base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.Strings;

public class AddUserTest extends BaseTest {
	
	@Test
	public void addUserTest() throws InterruptedException {
		String username = "username001";
		String realname = "username001";
		String email = "username@username.it";

		WebElement loginUsr = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[4]/div/div/div[1]/form/fieldset/label/span/input"));
		loginUsr.clear();
		loginUsr.sendKeys("administrator");
		WebElement usrLoginBtn = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[4]/div/div/div[1]/form/fieldset/input[2]"));
		usrLoginBtn.click();
		WebElement loginPsw = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[4]/div/div/div/form/fieldset/label/span/input"));
		loginPsw.clear();
		loginPsw.sendKeys("e2eW3Bt3s71nGB3nchM4rK");
		WebElement pswLoginBtn = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[4]/div/div/div/form/fieldset/input[3]"));
		pswLoginBtn.click();
		WebElement manage = driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[6]/a/span"));
		manage.click();
		WebElement manageUsers = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/ul/li[2]/a"));
		manageUsers.click();
		WebElement createUserBtn = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[4]/div[2]/div[1]/div/div[1]/a"));
		createUserBtn.click();
		WebElement userField = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[2]/form/div/div[2]/div/div/table/tbody/tr[1]/td[2]/input"));
		userField.clear();
		userField.sendKeys(username);
		WebElement realnameField = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[2]/form/div/div[2]/div/div/table/tbody/tr[2]/td[2]/input"));
		realnameField.clear();
		realnameField.sendKeys(realname);
		WebElement emailField = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[2]/form/div/div[2]/div/div/table/tbody/tr[3]/td[2]/input"));
		emailField.clear();
		emailField.sendKeys(email);
		WebElement accessLevelSelect = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[2]/form/div/div[2]/div/div/table/tbody/tr[4]/td[2]/select"));
		new Select(accessLevelSelect).selectByVisibleText(Strings.updater);
		WebElement saveBtn = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[2]/form/div/div[3]/input"));
		saveBtn.click();
		Thread.sleep(500);
		WebElement secondManageUsers = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/ul/li[2]/a"));
		secondManageUsers.click();
		WebElement displayedUsername = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[4]/div[2]/div[2]/div/table/tbody/tr[2]/td[1]/a"));
		WebElement displayedRealname = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[4]/div[2]/div[2]/div/table/tbody/tr[2]/td[2]"));
		WebElement displayedEmail = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[4]/div[2]/div[2]/div/table/tbody/tr[2]/td[3]"));
		WebElement displayedAccessLevel = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[4]/div[2]/div[2]/div/table/tbody/tr[2]/td[4]"));
		
		assertEquals(username, displayedUsername.getText());
		assertEquals(realname, displayedRealname.getText());
		assertEquals(email, displayedEmail.getText());
		assertEquals(Strings.updater, displayedAccessLevel.getText());

		WebElement adminDropdown = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/ul/li[3]/a/span"));
		adminDropdown.click();
		WebElement logout = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a"));
		logout.click();
	}
	
}